#!/bin/bash 

# Définition des variables
DIRECTORY="src"
CLASSDIR="out"
LIB="lib/ojdbc11.jar"

# Nettoyage et création du dossier de sortie
rm -rf $CLASSDIR
mkdir -p $CLASSDIR

# Compilation des fichiers
find $DIRECTORY -name "*.java" > source.txt
javac -cp $LIB -d $CLASSDIR @source.txt

# Recherche de la classe Main
cd $CLASSDIR 
find . -name "Main*.class" > valiny.txt  

# Fonction pour éditer le fichier valiny.txt
function edit_valiny() {
    local input_file="valiny.txt"
    local temp_file="temp.txt"
    
    # Vérifier si le fichier existe
    if [ ! -f "$input_file" ]; then
        echo "Erreur : le fichier $input_file n'existe pas"
        return 1
    fi
    
    # Vérifier si le fichier est vide
    if [ ! -s "$input_file" ]; then
        echo "Erreur : le fichier $input_file est vide"
        return 1
    fi

    # Transformation du chemin
    sed 's|^\./||' "$input_file" |  # Supprimer le ./ au début
    sed 's|/|.|g' |                 # Remplacer '/' par '.'
    sed 's|\.class$||g' > "$temp_file"  # Supprimer .class à la fin

    # Remplacer l'ancien fichier par le nouveau
    mv "$temp_file" "$input_file"

    # Retourner le contenu (première ligne seulement)
    head -n 1 "$input_file"
}

# Obtenir le nom de la classe Main
MAIN_CLASS=$(edit_valiny)

echo "Le main : $MAIN_CLASS"
echo " "

# Exécution
java -cp ".:../$LIB:$CLASSDIR" "$MAIN_CLASS"
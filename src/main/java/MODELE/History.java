package main.java.MODELE;

public class History {
    int empno;
    java.sql.Date hdate;
    double hsal;
    int idrubrique;

    public History() {
        setEmpno(empno);
        setDateRef(hdate);
        setValeur(hsal);
    }

    public int getIdRubrique() {
        return idrubrique;
    }
    
    public void setIdRubrique(int idrubrique) {
        this.idrubrique = idrubrique;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setDateRef(java.sql.Date hdate) {
        this.hdate = hdate;
    }

    public void setValeur(double hsal) {
        this.hsal = hsal;
    }

    public int getEmpno() {
        return empno;
    }

    public java.sql.Date getDateRef() {
        return hdate;
    }

    public double getValeur() {
        return hsal;
    }   
}
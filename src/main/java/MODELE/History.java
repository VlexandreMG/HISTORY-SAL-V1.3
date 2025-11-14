package main.java.MODELE;

public class History {
    int empno;
    java.sql.Date hdate;
    double hsal;
    int idrubrique;

    public History() {
        setEmpno(empno);
        setHdate(hdate);
        setHsal(hsal);
    }

    public int getIdrubrique() {
        return idrubrique;
    }
    
    public void setIdrubrique(int idrubrique) {
        this.idrubrique = idrubrique;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setHdate(java.sql.Date hdate) {
        this.hdate = hdate;
    }

    public void setHsal(double hsal) {
        this.hsal = hsal;
    }

    public int getEmpno() {
        return empno;
    }

    public java.sql.Date getHdate() {
        return hdate;
    }

    public double getHsal() {
        return hsal;
    }   
}
package main.java.MODELE;

public class Emp {
    int empno;
    String ename;
    String job;
    int mgr;
    String hiredate;
    int comm;
    int deptno;
    double sal;
    double avantages;
    double cnaps;
    double irsa;

    public Emp() {
        setEname(ename);
        setJob(job);
        setHiredate(hiredate);
        setSal(sal);
        setComm(comm);
        setDeptno(deptno);
        setAvantages(avantages);
        setCnaps(cnaps);
        setIrsa(irsa);
    }

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public int getMgr() {
        return mgr;
    }

    public String getHiredate() {
        return hiredate;
    }

    public double getSal() {
        return sal;
    }

    public int getComm() {
        return comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public double getAvantages() {
        return avantages;
    }

    public double getCnaps() {
        return cnaps;
    }

    public double getIrsa() {
        return irsa;
    }

    public void setAvantages(double avantages) {
        this.avantages = avantages;
    }

    public void setCnaps(double cnaps) {
        this.cnaps = cnaps;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public void setIrsa(double irsa) {
        this.irsa = irsa;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
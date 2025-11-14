package main.java.PAGES;

import main.java.DAO.EmpDAO;
import main.java.MODELE.*;

public class Main {
    
    public static void main(String[] args) {
        
        Emp emp = new Emp();
        emp.setEmpno(7369);
        emp.setEname("SMITH");
        emp.setJob("CLERK");
        emp.setMgr(7902);
        emp.setHiredate(java.sql.Date.valueOf("1980-12-17").toString());
        emp.setSal(800);
        emp.setComm(0);
        emp.setDeptno(20);

        try {
            int val = EmpDAO.findEmpSalById(emp);
            System.out.println(val);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

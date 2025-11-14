package main.java.PAGES;

import main.java.DAO.*;
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

        History his = new History();
        his.setEmpno(7369);
        his.setHsal(800);
        his.setIdrubrique(1);

        try {
            // int val = EmpDAO.findEmpSalById(emp);
            HistoryDAO.save(his);
            // System.out.println(val);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

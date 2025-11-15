package main.java.PAGES;

import java.util.ArrayList;
import java.util.List;

import main.java.DAO.*;
import main.java.MODELE.*;

public class Main {
    
    public static void main(String[] args) {
//Liste d'employés de la table SCOTT 
        List<Emp> employes = new ArrayList<>();
        
        // SMITH
        Emp smith = new Emp();
        smith.setEmpno(7369);
        smith.setEname("SMITH");
        smith.setJob("CLERK");
        smith.setMgr(7902);
        smith.setHiredate(java.sql.Date.valueOf("1980-12-17").toString());
        smith.setSal(800);
        smith.setComm(0);
        smith.setDeptno(20);
        employes.add(smith);

        // ALLEN
        Emp allen = new Emp();
        allen.setEmpno(7499);
        allen.setEname("ALLEN");
        allen.setJob("SALESMAN");
        allen.setMgr(7698);
        allen.setHiredate(java.sql.Date.valueOf("1981-02-20").toString());
        allen.setSal(1600);
        allen.setComm(300);
        allen.setDeptno(30);
        employes.add(allen);

        // WARD
        Emp ward = new Emp();
        ward.setEmpno(7521);
        ward.setEname("WARD");
        ward.setJob("SALESMAN");
        ward.setMgr(7698);
        ward.setHiredate(java.sql.Date.valueOf("1981-02-22").toString());
        ward.setSal(1250);
        ward.setComm(500);
        ward.setDeptno(30);
        employes.add(ward);

        // JONES
        Emp jones = new Emp();
        jones.setEmpno(7566);
        jones.setEname("JONES");
        jones.setJob("MANAGER");
        jones.setMgr(7839);
        jones.setHiredate(java.sql.Date.valueOf("1981-04-02").toString());
        jones.setSal(2975);
        jones.setComm(0);
        jones.setDeptno(20);
        employes.add(jones);

        // MARTIN
        Emp martin = new Emp();
        martin.setEmpno(7654);
        martin.setEname("MARTIN");
        martin.setJob("SALESMAN");
        martin.setMgr(7698);
        martin.setHiredate(java.sql.Date.valueOf("1981-09-28").toString());
        martin.setSal(1250);
        martin.setComm(1400);
        martin.setDeptno(30);
        employes.add(martin);

        // BLAKE
        Emp blake = new Emp();
        blake.setEmpno(7698);
        blake.setEname("BLAKE");
        blake.setJob("MANAGER");
        blake.setMgr(7839);
        blake.setHiredate(java.sql.Date.valueOf("1981-05-01").toString());
        blake.setSal(2850);
        blake.setComm(0);
        blake.setDeptno(30);
        employes.add(blake);

        // CLARK
        Emp clark = new Emp();
        clark.setEmpno(7782);
        clark.setEname("CLARK");
        clark.setJob("MANAGER");
        clark.setMgr(7839);
        clark.setHiredate(java.sql.Date.valueOf("1981-06-09").toString());
        clark.setSal(2450);
        clark.setComm(0);
        clark.setDeptno(10);
        employes.add(clark);

        // SCOTT
        Emp scott = new Emp();
        scott.setEmpno(7788);
        scott.setEname("SCOTT");
        scott.setJob("ANALYST");
        scott.setMgr(7566);
        scott.setHiredate(java.sql.Date.valueOf("1987-04-19").toString());
        scott.setSal(3000);
        scott.setComm(0);
        scott.setDeptno(20);
        employes.add(scott);

        // KING
        Emp king = new Emp();
        king.setEmpno(7839);
        king.setEname("KING");
        king.setJob("PRESIDENT");
        king.setMgr(0);
        king.setHiredate(java.sql.Date.valueOf("1981-11-17").toString());
        king.setSal(5000);
        king.setComm(0);
        king.setDeptno(10);
        employes.add(king);

        // TURNER
        Emp turner = new Emp();
        turner.setEmpno(7844);
        turner.setEname("TURNER");
        turner.setJob("SALESMAN");
        turner.setMgr(7698);
        turner.setHiredate(java.sql.Date.valueOf("1981-09-08").toString());
        turner.setSal(1500);
        turner.setComm(0);
        turner.setDeptno(30);
        employes.add(turner);

        // ADAMS
        Emp adams = new Emp();
        adams.setEmpno(7876);
        adams.setEname("ADAMS");
        adams.setJob("CLERK");
        adams.setMgr(7788);
        adams.setHiredate(java.sql.Date.valueOf("1987-05-23").toString());
        adams.setSal(1100);
        adams.setComm(0);
        adams.setDeptno(20);
        employes.add(adams);

        // JAMES
        Emp james = new Emp();
        james.setEmpno(7900);
        james.setEname("JAMES");
        james.setJob("CLERK");
        james.setMgr(7698);
        james.setHiredate(java.sql.Date.valueOf("1981-12-03").toString());
        james.setSal(950);
        james.setComm(0);
        james.setDeptno(30);
        employes.add(james);

        // FORD
        Emp ford = new Emp();
        ford.setEmpno(7902);
        ford.setEname("FORD");
        ford.setJob("ANALYST");
        ford.setMgr(7566);
        ford.setHiredate(java.sql.Date.valueOf("1981-12-03").toString());
        ford.setSal(3000);
        ford.setComm(0);
        ford.setDeptno(20);
        employes.add(ford);

        // MILLER
        Emp miller = new Emp();
        miller.setEmpno(7934);
        miller.setEname("MILLER");
        miller.setJob("CLERK");
        miller.setMgr(7782);
        miller.setHiredate(java.sql.Date.valueOf("1982-01-23").toString());
        miller.setSal(1300);
        miller.setComm(0);
        miller.setDeptno(10);
        employes.add(miller);

//Liste historique des employés 

        List<History> historiques = new ArrayList<>();
        
        // SMITH
        History history_smith = new History();
        history_smith.setEmpno(7369);
        history_smith.setDateRef(null);
        history_smith.setValeur(800);
        history_smith.setIdRubrique(1);
        historiques.add(history_smith);

        // ALLEN
        History history_allen = new History();
        history_allen.setEmpno(7499);
        history_allen.setDateRef(null);
        history_allen.setValeur(1600);
        history_allen.setIdRubrique(1);
        historiques.add(history_allen);

        // WARD
        History history_ward = new History();
        history_ward.setEmpno(7521);
        history_ward.setDateRef(null);
        history_ward.setValeur(1250);
        history_ward.setIdRubrique(1);
        historiques.add(history_ward);

        // JONES
        History history_jones = new History();
        history_jones.setEmpno(7566);
        history_jones.setDateRef(null);
        history_jones.setValeur(2975);
        history_jones.setIdRubrique(1);
        historiques.add(history_jones);

        // MARTIN
        History history_martin = new History();
        history_martin.setEmpno(7654);
        history_martin.setDateRef(null);
        history_martin.setValeur(1250);
        history_martin.setIdRubrique(1);
        historiques.add(history_martin);

        // BLAKE
        History history_blake = new History();
        history_blake.setEmpno(7698);
        history_blake.setDateRef(null);
        history_blake.setValeur(2850);
        history_blake.setIdRubrique(1);
        historiques.add(history_blake);

        // CLARK
        History history_clark = new History();
        history_clark.setEmpno(7782);
        history_clark.setDateRef(null);
        history_clark.setValeur(2450);
        history_clark.setIdRubrique(1);
        historiques.add(history_clark);

        // SCOTT
        History history_scott = new History();
        history_scott.setEmpno(7788);
        history_scott.setDateRef(null);
        history_scott.setValeur(3000);
        history_scott.setIdRubrique(1);
        historiques.add(history_scott);

        // KING
        History history_king = new History();
        history_king.setEmpno(7839);
        history_king.setDateRef(null);
        history_king.setValeur(5000);
        history_king.setIdRubrique(1);
        historiques.add(history_king);

        // TURNER
        History history_turner = new History();
        history_turner.setEmpno(7844);
        history_turner.setDateRef(null);
        history_turner.setValeur(1500);
        history_turner.setIdRubrique(1);
        historiques.add(history_turner);

        // ADAMS
        History history_adams = new History();
        history_adams.setEmpno(7876);
        history_adams.setDateRef(null);
        history_adams.setValeur(1100);
        history_adams.setIdRubrique(1);
        historiques.add(history_adams);

        // JAMES
        History history_james = new History();
        history_james.setEmpno(7900);
        history_james.setDateRef(null);
        history_james.setValeur(950);
        history_james.setIdRubrique(1);
        historiques.add(history_james);

        // FORD
        History history_ford = new History();
        history_ford.setEmpno(7902);
        history_ford.setDateRef(null);
        history_ford.setValeur(3000);
        history_ford.setIdRubrique(1);
        historiques.add(history_ford);

        // MILLER
        History history_miller = new History();
        history_miller.setEmpno(7934);
        history_miller.setDateRef(null);
        history_miller.setValeur(1300);
        history_miller.setIdRubrique(1);
        historiques.add(history_miller);

        try {
            // int val = EmpDAO.findEmpSalById(emp);
            HistoryDAO.selectDate(history_smith);
            //System.out.println(dateRef);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

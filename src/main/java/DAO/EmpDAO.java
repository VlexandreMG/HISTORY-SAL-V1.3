package main.java.DAO;

import java.sql.SQLException;

import main.java.MODELE.Emp;
import main.java.PAGES.*;
import java.sql.*;

public class EmpDAO {
    
    public static int findEmpSalById(Emp em, Connection conn) throws SQLException {
        String sql = "SELECT SAL FROM EMP WHERE EMPNO = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        int valiny = 0;

        try {
            ps.setInt(1, em.getEmpno());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                    valiny = rs.getInt("SAL");
            }
            conn.commit();
            return valiny;
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            ps.close();
        }
    }

    public static int findEmpSalById(Emp em) throws SQLException {
        Connection conn = null;
        try {
            conn = new DBconnection().getConnection();
            int result = findEmpSalById(em, conn);
            conn.commit();
            return result;
        } catch (Exception e) {
            throw e;
        } finally {
            if (conn != null) {
                conn.close();   
            }
        }
    }
}

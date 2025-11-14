package main.java.DAO;

import java.sql.*;
import main.java.MODELE.*;
import main.java.PAGES.DBconnection;

public class HistoryDAO {
    
    public static void save(History his, Connection conn) throws SQLException {
        String sql = "INSERT INTO history (empno, date_ref, valeur, id_rubrique) VALUES (?, NULL, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, his.getEmpno());
            ps.setDouble(2, his.getHsal());
            ps.setInt(3, his.getIdrubrique());
            ps.executeUpdate();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if ( ps != null) {
                ps.close();
            }
        }
    }

    public static void save(History his) throws SQLException {
        Connection conn = null;

        try {
            conn = new DBconnection().getConnection();
            save(his, conn);
            conn.commit();
        } catch (Exception e) {
            throw e;
        } finally {
            if ( conn != null) {
                conn.close();
            }
        }
    }
}

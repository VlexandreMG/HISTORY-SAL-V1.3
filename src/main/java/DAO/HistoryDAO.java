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
            ps.setDouble(2, his.getValeur());
            ps.setInt(3, his.getIdRubrique());
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

    public static java.sql.Date updateDate(History his, Connection conn, java.sql.Date date_new) throws SQLException {
        String sql = "UPDATE HISTORY SET DATE_REF = ? WHERE EMPNO = ?";
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(sql);
            ps.setDate(1, date_new);
            ps.setInt(2, his.getEmpno());
            ps.executeUpdate();
            return date_new;
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if ( ps != null) {
                ps.close();
            }
        }
    }
    
    public static java.sql.Date updateDate(History his, java.sql.Date date_new) throws SQLException {
        Connection conn = null;

        try {
            conn = new DBconnection().getConnection();
            java.sql.Date updatedDate = updateDate(his, conn, date_new);
            conn.commit();
            return updatedDate;
        } catch (Exception e) {
            throw e;
        } finally {
            if ( conn != null) {
                conn.close();
            }
        }
    }
}




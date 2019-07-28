/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.DaoImp;

import com.sadria.Connection.DBConnection;
import com.sadria.Dao.SummaryDao;
import com.sadria.pojo.Person;
import com.sadria.pojo.Summary;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public class SummaryDaoImp implements SummaryDao {

    Connection con = DBConnection.getConnet();

    public static void main(String[] args) {
        SummaryDaoImp obj = new SummaryDaoImp();
        obj.createTable();
    }

    @Override
    public void createTable() {
        String sql = "create table if not Exists summary(id int(4) auto_increment primary key,accountNo varchar(20),name varchar(20),savingType varchar(20),annunity int(20),date date,totalDeposit int(20), totalWithdraw int(20),balance int(20),installmentNo int(20),coverDate date,due int(20))";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("Table created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Summary s) {
        String sql = "insert into summary(accountNo ,name ,savingType ,annunity ,date,totalDeposit , totalWithdraw ,balance,installmentNo,coverDate ,due) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s.getAccountNo());
            pst.setString(2, s.getName());
            pst.setString(3, s.getSavingType());
            pst.setInt(4, s.getAnnunity());
            pst.setDate(5, new java.sql.Date(s.getDate().getTime()));

            pst.setInt(6, s.getTotalDeposit());
            pst.setInt(7, s.getTotalWithdraw());
            pst.setInt(8, s.getBalance());
            pst.setInt(9, s.getInstallmentNo());

            pst.setDate(10, new java.sql.Date(s.getCoverDate().getTime()));
            pst.setInt(11, s.getDue());
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateForDeposit(Summary s) {
        String sql = "update summary set totalDeposit = ? ,balance = ? ,installmentNo = ? , coverDate = ? ,due = ? where accountNo = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, s.getTotalDeposit());
            pst.setInt(2, s.getBalance());
            pst.setInt(3, s.getInstallmentNo());
            pst.setDate(4, new java.sql.Date(s.getCoverDate().getTime()));

            pst.setInt(5, s.getDue());
            pst.setString(6, s.getAccountNo());
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Summary getSummaryByAccontNo(String accountNo) {
        Summary s = null;
        String sql = "SELECT * FROM summary where accountNo=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, accountNo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                s = new Summary(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getDate(11), rs.getInt(12));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public List<Summary> getSummarys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateForWithdraw(Summary s) {
        String sql = "update summary set totalWithdraw =? , balance=?, installmentNo = ? , coverDate = ? , due = ? where accountNo = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, s.getTotalWithdraw());
            pst.setInt(2, s.getBalance());
            pst.setInt(3, s.getInstallmentNo());
            pst.setDate(4, new java.sql.Date(s.getCoverDate().getTime()));
            pst.setInt(5, s.getDue());
            pst.setString(6, s.getAccountNo());
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getDeposit() {
        int totalDeposit = 0;
        String sql = "SELECT sum(balance) FROM summary";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                totalDeposit = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalDeposit;
    }

}

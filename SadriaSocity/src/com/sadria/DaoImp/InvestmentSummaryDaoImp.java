/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.DaoImp;

import com.sadria.Connection.DBConnection;
import com.sadria.Dao.InvestmentSummaryDao;
import com.sadria.Dao.SummaryDao;
import com.sadria.pojo.InvestmentSummary;
import com.sadria.pojo.Person;
import com.sadria.pojo.Summary;
import com.sadria.pojo.Transtion;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class InvestmentSummaryDaoImp implements InvestmentSummaryDao {

    Connection con = DBConnection.getConnet();

    public static void main(String[] args) {
        InvestmentSummaryDaoImp obj = new InvestmentSummaryDaoImp();
        obj.createTable();
    }

    @Override
    public void createTable() {
        String sql = "create table if not Exists investmentSummary(id int(4) auto_increment primary key,date date,accountNO varchar(20),projectName varchar(50),projectLocation varchar(100),startDate date,directorName varchar(50), totalInvestment Double , totalReturn Double , balance Double, projectDuration int(20))";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("Table created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(InvestmentSummary is) {
        String sql = "insert into investmentSummary(date,accountNo ,projectName ,projectLocation ,startDate ,directorName,totalInvestment , totalReturn ,balance,projectDuration) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date(is.getDate().getTime()));
            pst.setString(2, is.getAccountNo());
            pst.setString(3, is.getProjectName());
            pst.setString(4, is.getProjectLocation());
            pst.setDate(5, new java.sql.Date(is.getStartDate().getTime()));
            pst.setString(6, is.getDirectortName());
            pst.setDouble(7, is.getTotalInvestment());
            pst.setDouble(8, is.getReturnAmount());
            pst.setDouble(9, is.getBalance());
            pst.setInt(10, is.getProjectDuration());
            pst.executeUpdate();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    @Override
    public void updateForDeposit(InvestmentSummary is) {
        String sql = "update investmentSummary set totalReturn = ? ,balance=? where accountNo = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setDouble(1, is.getReturnAmount());                     
            pst.setDouble(2, is.getBalance());                     
            pst.setString(3, is.getAccountNo());
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
    public InvestmentSummary getInvestmentSummaryByAccontNo(String accountNo) {
        InvestmentSummary is = null;
        String sql = "SELECT * FROM investmentSummary where accountNo=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, accountNo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                is = new InvestmentSummary(rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getInt(11));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return is;
    }

    @Override
    public List<InvestmentSummary> getInvestmentSummarys() {
        List<InvestmentSummary> list= new ArrayList<>();
        String sql = "select * from investmentsummary";
        try {
            PreparedStatement pst  = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {                
                InvestmentSummary isamary = new InvestmentSummary(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getInt(11));
                list.add(isamary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void updateForWithdraw(InvestmentSummary is) {
         String sql = "update investmentSummary set totalInvestment = ? where accountNo = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setDouble(1, is.getTotalInvestment());          
             pst.setString(2, is.getAccountNo());
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public double getInvestment() {
        double totalInvestment = 0.0;
        String sql = "SELECT sum(balance) FROM investmentsummary";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                totalInvestment = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalInvestment;
    }

}
 
    
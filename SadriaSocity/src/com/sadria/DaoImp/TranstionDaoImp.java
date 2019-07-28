/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.DaoImp;

import com.sadria.Connection.DBConnection;
import com.sadria.Dao.TranstionDao;
import com.sadria.pojo.Person;
import com.sadria.pojo.Transtion;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class TranstionDaoImp implements TranstionDao{
Connection con = DBConnection.getConnet();
    public static void main(String[] args) {
        TranstionDaoImp obj = new TranstionDaoImp();
        obj.createTable();
    }
    @Override
    public void createTable() {
        String sql = "create table if not Exists transtion(id int(4) auto_increment primary key,Date date,accountNo varchar(20),name varchar(20),slipNO varchar(20)unique,Deposit int(20),Withdraw int(20) )";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deposit(Transtion t) {
        
        String sql = "insert into transtion(id,Date,accountNo ,name ,slipNO ,Deposit)values(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, t.getId());
            pst.setDate(2, (java.sql.Date) t.getDate());
            pst.setString(3,t.getAccountNo());
            pst.setString(4,t.getName());
            pst.setString(5,t.getSlipNo());
            pst.setInt(6,t.getDeposit());
           
            pst.executeUpdate();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void withdraw(Transtion t) {
        String sql = "insert into transtion(id,Date,accountNo ,name ,slipNO ,withdraw)values(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, t.getId());
            pst.setDate(2, (java.sql.Date) t.getDate());
            pst.setString(3,t.getAccountNo());
            pst.setString(4,t.getName());
            pst.setString(5,t.getSlipNo());
            pst.setInt(6,t.getWithdraw());
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
    public List<Transtion> getTranstions() {
        List<Transtion> list= new ArrayList<>();
        String sql = "select * from transtion";
        try {
            PreparedStatement pst  = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {                
                Transtion transtion = new Transtion(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getInt(6), rs.getInt(7));
                list.add(transtion);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Transtion getTranstionByAccontNo(String accountNo) {
        Transtion t = null;
        String sql = "SELECT * FROM transtion where accountNo=?";
        try {
            PreparedStatement pst  = con.prepareStatement(sql);
            pst.setString(1, accountNo);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {                
               t = new Transtion(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getInt(6), rs.getInt(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    @Override
    public List<Transtion> getTranstion(String accountNo) {
        List<Transtion> list= new ArrayList<>();
        String sql = "SELECT * FROM transtion where accountNo=?";
        try {
            PreparedStatement pst  = con.prepareStatement(sql);
            pst.setString(1, accountNo);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {                
                Transtion transtion = new Transtion(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getInt(6), rs.getInt(7));
                list.add(transtion);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}

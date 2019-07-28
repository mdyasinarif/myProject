/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.DaoImp;

import com.sadria.Connection.DBConnection;
import com.sadria.Dao.InvestmentDao;
import com.sadria.Dao.PersonDao;
import com.sadria.pojo.Investment;
import com.sadria.pojo.Person;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 *
    
 */

public class InvestmentDaoImp implements InvestmentDao{
Connection con = DBConnection.getConnet();
    public static void main(String[] args) {
        InvestmentDaoImp obj = new InvestmentDaoImp();
        obj.createTable();
    }
    @Override
    public void createTable() {
        String sql = "create table if not Exists investment(id int(4) auto_increment primary key,accountNo varchar(20)unique,projectName varchar(50),projectLocation varchar(100), totalInvestment double,startDate date,projectDuration int(10),directortName varchar(20),gender varchar(20),religion varchar(20),dateofBirth varchar(20),nIDNo varchar(20),mobileNo varchar(20),presentAddress varchar(100),parmanetAddress varchar(100),picture BLOB)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("Table Created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Investment i,File file) {
         FileInputStream inputStream = null;
        String sql = "insert into investment(accountNo ,projectName ,projectLocation ,totalInvestment ,startDate ,projectDuration,directortName,gender ,religion ,dateofBirth ,nIDNo ,mobileNo ,presentAddress ,parmanetAddress,picture)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            inputStream = new FileInputStream(file);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, i.getAccountNo());
            pst.setString(2, i.getProjectName());
            pst.setString(3, i.getProjectLocation());
            pst.setDouble(4, i.getTotalInvestment());
            pst.setDate(5, new java.sql.Date(i.getStartDate().getTime()));
            pst.setInt(6,i.getProjectDuration());
            pst.setString(7, i.getDirectortName());
            pst.setString(8, i.getGender());
            pst.setString(9, i.getReligion());
            pst.setString(10, i.getDateofBirth());
            pst.setString(11, i.getnIDNo());
            pst.setString(12, i.getMobileNo());
            pst.setString(13, i.getPresentAddress());
            pst.setString(14, i.getParmanetAddress());
           pst.setBinaryStream(15, (InputStream) inputStream, (int) (file.length()));
            pst.executeUpdate();   
            JOptionPane.showMessageDialog(null, "Data Saved");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data is not Save");
            e.printStackTrace();
        }
    }

    @Override
    public void update(Investment i,File file) {
       FileInputStream inputStream = null;
        String sql = "update investment set projectName=? ,projectLocation=? ,totalInvestment=? ,startDate=? ,projectDuration=?,directortName=?,gender=? ,religion=? ,dateofBirth=? ,nIDNo=? ,mobileNo=? ,presentAddress=? ,parmanetAddress=?,picture=? where accountNo=?";
        try {
            inputStream = new FileInputStream(file);
            PreparedStatement pst = con.prepareStatement(sql);
           
            pst.setString(1, i.getProjectName());
            pst.setString(2, i.getProjectLocation());
            pst.setDouble(3, i.getTotalInvestment());
            pst.setDate(4, new java.sql.Date(i.getStartDate().getTime()));
            pst.setInt(5,i.getProjectDuration());
            pst.setString(6, i.getDirectortName());
            pst.setString(7, i.getGender());
            pst.setString(8, i.getReligion());
            pst.setString(9, i.getDateofBirth());
            pst.setString(10, i.getnIDNo());
            pst.setString(11, i.getMobileNo());
            pst.setString(12, i.getPresentAddress());
            pst.setString(13, i.getParmanetAddress());
           pst.setBinaryStream(14, (InputStream) inputStream, (int) (file.length()));
            pst.setString(15, i.getAccountNo());
            pst.executeUpdate();    
            JOptionPane.showMessageDialog(null, "Data update");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data not update");
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public List<Investment> getPersons() {
        List<Investment> list = new ArrayList<>();
        String sql = "select * from investment";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Investment t = new Investment();
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Investment getInvestmentByAccontNo(String accountNo) {
        Investment i=null;
        String sql="select * from investment where accountNo=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, accountNo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
            //t = new Person(rs.getString(2), rs.getString(6), rs.getString(16), rs.getInt(17));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    

    @Override
    public Investment getInvestmentinfoByAccontNo(String accountNo) {
        Investment i=null;
        String sql="select * from investment where accountNo=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, accountNo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
            i = new Investment(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDate(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getBytes(16));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public Investment getIdByAccontNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Investment> getPersonsInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}

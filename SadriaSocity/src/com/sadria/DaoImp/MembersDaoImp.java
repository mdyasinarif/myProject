/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.DaoImp;

import com.sadria.Connection.DBConnection;
import com.sadria.Dao.MembersDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class MembersDaoImp implements MembersDao
{
Connection con = DBConnection.getConnet();

    @Override
    public int getTotalMember() {
       int totalMember = 0;
        String sql = "select count(*) from person";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                totalMember = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return totalMember;
    }

    @Override
    public int getProject() {
        int project = 0;
        String sql = "select count(*) from investment";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                project = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return project;
    }
    }
    



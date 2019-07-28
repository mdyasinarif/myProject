/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.pojo;

import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author User
 */
public class Investment {

    int id;
    String accountNo;
    String projectName;
    String projectLocation;
    double totalInvestment;
    Date startDate;
    int projectDuration;
    String directortName;
    String gender;
    String religion;
    String dateofBirth;
    String nIDNo;
    String mobileNo;
    String presentAddress;
    String parmanetAddress;
    byte[] picture;

    
    
    
    public Investment() {
    }

    public Investment(String accountNo, String name) {
        this.accountNo = accountNo;
        this.projectName = name;
    }

    public Investment(String accountNo, String projectName, String projectLocation, double totalInvestment, Date startDate, int projectDuration, String directortName) {
        this.accountNo = accountNo;
        this.projectName = projectName;
        this.projectLocation = projectLocation;
        this.totalInvestment = totalInvestment;
        this.startDate = startDate;
        this.projectDuration = projectDuration;
        this.directortName = directortName;
    }

    public Investment(int id, String accountNo, String projectName, String projectLocation, double totalInvestment, Date startDate, int projectDuration, String directortName, String gender, String religion, String dateofBirth, String nIDNo, String mobileNo, String presentAddress, String parmanetAddress, byte[] picture) {
        this.id = id;
        this.accountNo = accountNo;
        this.projectName = projectName;
        this.projectLocation = projectLocation;
        this.totalInvestment = totalInvestment;
        this.startDate = startDate;
        this.projectDuration = projectDuration;
        this.directortName = directortName;
        this.gender = gender;
        this.religion = religion;
        this.dateofBirth = dateofBirth;
        this.nIDNo = nIDNo;
        this.mobileNo = mobileNo;
        this.presentAddress = presentAddress;
        this.parmanetAddress = parmanetAddress;
        this.picture = picture;
    }

    

    public Investment(String accountNo, String projectName, String projectLocation, double totalInvestment, Date startDate, int projectDuration, String directortName, String gender, String religion, String dateofBirth, String nIDNo, String mobileNo, String presentAddress, String parmanetAddress) {
        this.accountNo = accountNo;
        this.projectName = projectName;
        this.projectLocation = projectLocation;
        this.totalInvestment = totalInvestment;
        this.startDate = startDate;
        this.projectDuration = projectDuration;
        this.directortName = directortName;
        this.gender = gender;
        this.religion = religion;
        this.dateofBirth = dateofBirth;
        this.nIDNo = nIDNo;
        this.mobileNo = mobileNo;
        this.presentAddress = presentAddress;
        this.parmanetAddress = parmanetAddress;
        
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }

    public double getTotalInvestment() {
        return totalInvestment;
    }

    public void setTotalInvestment(double totalInvestment) {
        this.totalInvestment = totalInvestment;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDirectortName() {
        return directortName;
    }

    public void setDirectortName(String directortName) {
        this.directortName = directortName;
    }

    public int getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(int projectDuration) {
        this.projectDuration = projectDuration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getnIDNo() {
        return nIDNo;
    }

    public void setnIDNo(String nIDNo) {
        this.nIDNo = nIDNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getParmanetAddress() {
        return parmanetAddress;
    }

    public void setParmanetAddress(String parmanetAddress) {
        this.parmanetAddress = parmanetAddress;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

   

   

    

   

    
    

}
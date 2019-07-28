/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.pojo;

import java.util.Date;

/**
 *
 * @author Md Yasin Arif
 */
public class InvestmentSummary {
    int id;
    Date date;
    String accountNo;    
    
    String projectName;    
    String ProjectLocation; 
    Date startDate;
    String directortName; 
    Double totalInvestment;
    Double returnAmount;
    Double balance;
    int projectDuration;

    public InvestmentSummary() {
    }

    public InvestmentSummary(String accountNo, Double totalInvestment, Double returnAmount, Double balance) {
        this.accountNo = accountNo;
        this.totalInvestment = totalInvestment;
        this.returnAmount = returnAmount;
        this.balance = balance;
    }

    public InvestmentSummary(Date date, String accountNo, String projectName, String ProjectLocation, Date startDate, String directortName, Double totalInvestment) {
        this.date = date;
        this.accountNo = accountNo;
        this.projectName = projectName;
        this.ProjectLocation = ProjectLocation;
        this.startDate = startDate;
        this.directortName = directortName;
        this.totalInvestment = totalInvestment;
    }

    public InvestmentSummary(int id, Date date, String accountNo, String projectName, String ProjectLocation, Date startDate, String directortName, Double totalInvestment, Double returnAmount, Double balance, int projectDuration) {
        this.id = id;
        this.date = date;
        this.accountNo = accountNo;
        this.projectName = projectName;
        this.ProjectLocation = ProjectLocation;
        this.startDate = startDate;
        this.directortName = directortName;
        this.totalInvestment = totalInvestment;
        this.returnAmount = returnAmount;
        this.balance = balance;
        this.projectDuration = projectDuration;
    }

    public InvestmentSummary(Date date, String accountNo, String projectName, String ProjectLocation, Date startDate, String directortName, Double totalInvestment, Double returnAmount, Double balance, int projectDuration) {
        this.date = date;
        this.accountNo = accountNo;
        this.projectName = projectName;
        this.ProjectLocation = ProjectLocation;
        this.startDate = startDate;
        this.directortName = directortName;
        this.totalInvestment = totalInvestment;
        this.returnAmount = returnAmount;
        this.balance = balance;
        this.projectDuration = projectDuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        return ProjectLocation;
    }

    public void setProjectLocation(String ProjectLocation) {
        this.ProjectLocation = ProjectLocation;
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

    public Double getTotalInvestment() {
        return totalInvestment;
    }

    public void setTotalInvestment(Double totalInvestment) {
        this.totalInvestment = totalInvestment;
    }

    public Double getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(Double returnAmount) {
        this.returnAmount = returnAmount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(int projectDuration) {
        this.projectDuration = projectDuration;
    }

    
    
    
}

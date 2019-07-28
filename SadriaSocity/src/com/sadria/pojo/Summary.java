/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.pojo;

import java.util.Date;

/**
 *
 * @author User
 */
public class Summary {
    int id;
    String accountNo;
    String name;
    String savingType;
    int annunity;
    Date date;
    int totalDeposit;
    int totalWithdraw;
    int balance;
    int installmentNo;
    Date coverDate;
    int due;

    public Summary() {
    }

    public Summary(int id, String accountNo, String name, String savingType, int annunity, Date date, int totalDeposit, int totalWithdraw, int balance, int installmentNo, Date coverDate, int due) {
        this.id = id;
        this.accountNo = accountNo;
        this.name = name;
        this.savingType = savingType;
        this.annunity = annunity;
        this.date = date;
        this.totalDeposit = totalDeposit;
        this.totalWithdraw = totalWithdraw;
        this.balance = balance;
        this.installmentNo = installmentNo;
        this.coverDate = coverDate;
        this.due = due;
    }

    public Summary(String accountNo, String name, String savingType, int annunity, Date date, int totalDeposit, int totalWithdraw, int balance, int installmentNo, Date coverDate, int due) {
        this.accountNo = accountNo;
        this.name = name;
        this.savingType = savingType;
        this.annunity = annunity;
        this.date = date;
        this.totalDeposit = totalDeposit;
        this.totalWithdraw = totalWithdraw;
        this.balance = balance;
        this.installmentNo = installmentNo;
        this.coverDate = coverDate;
        this.due = due;
    }

    public Summary(String accountNo, int totalDeposit, int balance, int installmentNo, Date coverDate, int due) {
        this.accountNo = accountNo;
        this.totalDeposit = totalDeposit;
        this.balance = balance;
        this.installmentNo = installmentNo;
        this.coverDate = coverDate;
        this.due = due;
    }

    
    public Summary(int totalDeposit, int balance, int installmentNo, Date coverDate, int due) {
        this.totalDeposit = totalDeposit;
        this.balance = balance;
        this.installmentNo = installmentNo;
        this.coverDate = coverDate;
        this.due = due;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSavingType() {
        return savingType;
    }

    public void setSavingType(String savingType) {
        this.savingType = savingType;
    }

    public int getAnnunity() {
        return annunity;
    }

    public void setAnnunity(int annunity) {
        this.annunity = annunity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalDeposit() {
        return totalDeposit;
    }

    public void setTotalDeposit(int totalDeposit) {
        this.totalDeposit = totalDeposit;
    }

    public int getTotalWithdraw() {
        return totalWithdraw;
    }

    public void setTotalWithdraw(int totalWithdraw) {
        this.totalWithdraw = totalWithdraw;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getInstallmentNo() {
        return installmentNo;
    }

    public void setInstallmentNo(int installmentNo) {
        this.installmentNo = installmentNo;
    }

    public Date getCoverDate() {
        return coverDate;
    }

    public void setCoverDate(Date coverDate) {
        this.coverDate = coverDate;
    }

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        this.due = due;
    }

    

    
    
    
   
    
    
}

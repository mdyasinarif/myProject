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
public class Transtion {
    int id;
    Date date;
    String accountNo;
    String name;
    String slipNo;
    int deposit;
    int withdraw;

    public Transtion() {
    }

    public Transtion(int id, Date date, String accountNo, String name, String slipNo, int deposit, int withdraw) {
        this.id = id;
        this.date = date;
        this.accountNo = accountNo;
        this.name = name;
        this.slipNo = slipNo;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public Transtion(Date date, String accountNo, String name, String slipNo, int deposit, int withdraw) {
        this.date = date;
        this.accountNo = accountNo;
        this.name = name;
        this.slipNo = slipNo;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public Transtion(Date date, String accountNo, String name, String slipNo, int deposit) {
        this.date = date;
        this.accountNo = accountNo;
        this.name = name;
        this.slipNo = slipNo;
        this.deposit = deposit;
    }

    public Transtion(int id, Date date, String accountNo, String name, String slipNo, int withdraw) {
        this.id = id;
        this.date = date;
        this.accountNo = accountNo;
        this.name = name;
        this.slipNo = slipNo;
        this.withdraw = withdraw;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlipNo() {
        return slipNo;
    }

    public void setSlipNo(String slipNo) {
        this.slipNo = slipNo;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    

   
    
}

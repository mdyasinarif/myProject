/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.Dao;

import com.sadria.pojo.InvestmentSummary;
import java.util.List;


/**
 *
 * @author User
 */
public interface InvestmentSummaryDao {
    void createTable();
    void save(InvestmentSummary is);
    void updateForDeposit(InvestmentSummary is);
    void updateForWithdraw(InvestmentSummary is);
    public double getInvestment();
    void delete(int id);
    InvestmentSummary getInvestmentSummaryByAccontNo(String accountNo);
   
    List<InvestmentSummary> getInvestmentSummarys();
    
}

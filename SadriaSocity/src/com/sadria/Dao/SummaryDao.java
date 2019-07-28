/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.Dao;

import com.sadria.pojo.Person;
import com.sadria.pojo.Summary;
import java.util.List;


/**
 *
 * @author User
 */
public interface SummaryDao {
    void createTable();
    void save(Summary s);
    void updateForDeposit(Summary s);
    void updateForWithdraw(Summary s);
    public int getDeposit();
    
    void delete(int id);
    Summary getSummaryByAccontNo(String accountNo);
  
    List<Summary> getSummarys();
    
    
}

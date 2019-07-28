/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.Dao;

import com.sadria.pojo.Investment;
import java.io.File;
import java.util.List;


/**
 *
 * @author User
 */
public interface InvestmentDao {
    void createTable();
    void save(Investment i,File file);
    void update(Investment i,File file);
    void delete(int id);
    Investment getIdByAccontNo();
   
    List<Investment> getPersons();
    List<Investment>getPersonsInfo();
    Investment getInvestmentByAccontNo(String accountNo);
    Investment getInvestmentinfoByAccontNo(String accountNo);
}

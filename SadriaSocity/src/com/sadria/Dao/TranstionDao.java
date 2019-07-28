/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.Dao;

import com.sadria.pojo.Person;
import com.sadria.pojo.Transtion;
import java.util.List;


/**
 *
 * @author User
 */
public interface TranstionDao {
    void createTable();
    void deposit(Transtion t);
    void withdraw(Transtion t);
    Transtion getTranstionByAccontNo(String accountNo);
    void delete(int id);
    List<Transtion> getTranstions();
    List<Transtion> getTranstion(String accountNo);
    
    
}

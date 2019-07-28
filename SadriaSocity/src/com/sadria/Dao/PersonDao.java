/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.Dao;

import com.sadria.pojo.Person;
import java.io.File;
import java.util.List;


/**
 *
 * @author User
 */
public interface PersonDao {
    void createTable();
    void save(Person p,File file);
    void update(Person p,File file);
    void delete(int id);
    Person getIdByAccontNo();
   
    List<Person> getPersons();
    List<Person>getPersonsInfo();
    Person getPersonByAccontNo(String accountNo);
    Person getPersoninfoByAccontNo(String accountNo);
}

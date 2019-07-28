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
public class Person {

    int id;
    String accountNo;
    String fromNO;
    String cardNo;
    Date admissionDate;
    String name;
    String motherName;
    String fatherHusbendName;
    String gender;
    String religion;
    String dateofBirth;
    
    String nIDNo;
    String mobileNo;
    String presentAddress;
    String parmanetAddress; 
    String savingType;
    int annunity;
    String nomineName;
    String relations;
    int share;
    byte[] picture;
    public Person() {
    }

    public Person(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
    }

    public Person(int id, String accountNo, String fromNO, String cardNo, Date admissionDate, String name, String motherName, String fatherHusbendName, String gender, String religion, String dateofBirth, String nIDNo, String mobileNo, String presentAddress, String parmanetAddress, String savingType, int annunity, String nomineName, String relations, int share, byte[] picture) {
        this.id = id;
        this.accountNo = accountNo;
        this.fromNO = fromNO;
        this.cardNo = cardNo;
        this.admissionDate = admissionDate;
        this.name = name;
        this.motherName = motherName;
        this.fatherHusbendName = fatherHusbendName;
        this.gender = gender;
        this.religion = religion;
        this.dateofBirth = dateofBirth;
        this.nIDNo = nIDNo;
        this.mobileNo = mobileNo;
        this.presentAddress = presentAddress;
        this.parmanetAddress = parmanetAddress;
        this.savingType = savingType;
        this.annunity = annunity;
        this.nomineName = nomineName;
        this.relations = relations;
        this.share = share;
        this.picture = picture;
    }

    public Person(String accountNo, String fromNO, String cardNo, Date admissionDate, String name, String motherName, String fatherHusbendName, String gender, String religion, String dateofBirth, String nIDNo, String mobileNo, String presentAddress, String parmanetAddress, String savingType, int annunity, String nomineName, String relations, int share, byte[] picture) {
        this.accountNo = accountNo;
        this.fromNO = fromNO;
        this.cardNo = cardNo;
        this.admissionDate = admissionDate;
        this.name = name;
        this.motherName = motherName;
        this.fatherHusbendName = fatherHusbendName;
        this.gender = gender;
        this.religion = religion;
        this.dateofBirth = dateofBirth;
        this.nIDNo = nIDNo;
        this.mobileNo = mobileNo;
        this.presentAddress = presentAddress;
        this.parmanetAddress = parmanetAddress;
        this.savingType = savingType;
        this.annunity = annunity;
        this.nomineName = nomineName;
        this.relations = relations;
        this.share = share;
        this.picture = picture;
    }

    public Person(int id, String accountNo, String fromNO, String cardNo, Date admissionDate, String name, String motherName, String fatherHusbendName, String gender, String religion, String dateofBirth, String nIDNo, String mobileNo, String presentAddress, String parmanetAddress, String savingType, int annunity, String nomineName, String relations, int share) {
        this.id = id;
        this.accountNo = accountNo;
        this.fromNO = fromNO;
        this.cardNo = cardNo;
        this.admissionDate = admissionDate;
        this.name = name;
        this.motherName = motherName;
        this.fatherHusbendName = fatherHusbendName;
        this.gender = gender;
        this.religion = religion;
        this.dateofBirth = dateofBirth;
        this.nIDNo = nIDNo;
        this.mobileNo = mobileNo;
        this.presentAddress = presentAddress;
        this.parmanetAddress = parmanetAddress;
        this.savingType = savingType;
        this.annunity = annunity;
        this.nomineName = nomineName;
        this.relations = relations;
        this.share = share;
    }

    public Person(String accountNo, String fromNO, String cardNo, Date admissionDate, String name, String motherName, String fatherHusbendName, String gender, String religion, String dateofBirth, String nIDNo, String mobileNo, String presentAddress, String parmanetAddress, String savingType, int annunity, String nomineName, String relations, int share) {
        this.accountNo = accountNo;
        this.fromNO = fromNO;
        this.cardNo = cardNo;
        this.admissionDate = admissionDate;
        this.name = name;
        this.motherName = motherName;
        this.fatherHusbendName = fatherHusbendName;
        this.gender = gender;
        this.religion = religion;
        this.dateofBirth = dateofBirth;
        this.nIDNo = nIDNo;
        this.mobileNo = mobileNo;
        this.presentAddress = presentAddress;
        this.parmanetAddress = parmanetAddress;
        this.savingType = savingType;
        this.annunity = annunity;
        this.nomineName = nomineName;
        this.relations = relations;
        this.share = share;
    }

    

   

   

    

    

    public Person(String accountNo,Date admissionDate, String name, String savingType, int annunity) {
        this.accountNo = accountNo;
         this.admissionDate = admissionDate;
        this.name = name;
        this.savingType = savingType;
        this.annunity = annunity;
       
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

    public String getFromNO() {
        return fromNO;
    }

    public void setFromNO(String fromNO) {
        this.fromNO = fromNO;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherHusbendName() {
        return fatherHusbendName;
    }

    public void setFatherHusbendName(String fatherHusbendName) {
        this.fatherHusbendName = fatherHusbendName;
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

    public String getNomineName() {
        return nomineName;
    }

    public void setNomineName(String nomineName) {
        this.nomineName = nomineName;
    }

    public String getRelations() {
        return relations;
    }

    public void setRelations(String relations) {
        this.relations = relations;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    

    

    
    

   
    
    
    
    
}

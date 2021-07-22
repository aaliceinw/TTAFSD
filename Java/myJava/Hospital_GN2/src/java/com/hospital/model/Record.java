/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.model;

/**
 *
 * @author joanlaine
 */   
public class Record {
    
    int treat;
    String name;
    int phone;
    String dob;
    String problem;
    String docName;
    String medecine;
    String test;
   

//create default constructor
     public Record() {
    }

    //create parameterized constructor

    public Record(int treat, String name, int phone, String dob, String problem, String docName, String medecine, String test) {
        this.treat = treat;
        this.name = name;
        this.phone = phone;
        this.dob = dob;
        this.problem = problem;
        this.docName = docName;
        this.medecine = medecine;
        this.test = test;
    }

    //create getter setter

    public int getTreat() {
        return treat;
    }

    public void setTreat(int treat) {
        this.treat = treat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getMedecine() {
        return medecine;
    }

    public void setMedecine(String medecine) {
        this.medecine = medecine;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }


}
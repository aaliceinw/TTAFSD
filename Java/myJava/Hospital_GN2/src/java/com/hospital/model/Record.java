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
    
    String name;
    String phone;
    String dob;
    String problem;
    String docname;
    String medecine;
    String test;
   int treat;

//create default constructor
     public Record() {
    }

    //create parameterized constructor

    public Record(String name, String phone, String dob, String problem, String docname, String medecine, String test, int treat) {
        this.name = name;
        this.phone = phone;
        this.dob = dob;
        this.problem = problem;
        this.docname = docname;
        this.medecine = medecine;
        this.test = test;
        this.treat = treat;
    }
   
    //create getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
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

    public int getTreat() {
        return treat;
    }

    public void setTreat(int treat) {
        this.treat = treat;
    }

}       

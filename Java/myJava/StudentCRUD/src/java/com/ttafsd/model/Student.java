
package com.ttafsd.model;


public class Student {
    
    int sid;
    String firstname;
    String lastname;
    int score;

    
    //default constructor
    public Student() {
    }
    
    
    //create parameter constructer

    public Student(int sid, String firstname, String lastname, int score) {
        this.sid = sid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.score = score;
    }
    
    //generate getter and setter

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getlLastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

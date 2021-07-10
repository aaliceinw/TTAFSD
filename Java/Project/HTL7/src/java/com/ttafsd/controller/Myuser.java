/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttafsd.controller;

/**
 *
 * @author joanlaine
 */
public class Myuser {
    
    int uid;
    String uname;
    String upass;
    
    public Myuser(int uid, String uname, String upass){

this.uid = uid;
this.uname = uname;
this.upass = upass;


    
    
}

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}
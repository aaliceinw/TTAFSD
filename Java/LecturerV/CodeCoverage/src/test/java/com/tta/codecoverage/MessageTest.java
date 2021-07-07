/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tta.codecoverage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vaibh
 */
public class MessageTest {
    
    public MessageTest() {
    }
    
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
     /**
     * Test of getMsg method, of class Message.
     */
    @org.junit.jupiter.api.Test
    
    
    public void testGetMsg() {
        
        Message obj = new Message();
        String input = "V";
        String actual = obj.getMsg(input);
        String expected = "Hello "+input;
        assertEquals(expected, actual);        
        
    }
    
    @Test
    public void testMesg2()
    {
        Message obj = new Message();
        String input = "";
        String actual = obj.getMsg(input);
        String expected = "Wrong input";
        assertEquals(expected, actual); 
    }
    
     @Test
    public void testMesg3()
    {
        Message obj = new Message();
        String input = null;
        String actual = obj.getMsg(input);
        String expected = "Wrong input";
        assertEquals(expected, actual); 
    }
    
}

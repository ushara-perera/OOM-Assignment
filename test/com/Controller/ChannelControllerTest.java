/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author User
 */
//@RunWith(Suite.class)
public class ChannelControllerTest {
    
    
    private ChannelController controller;
   
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    
    @Before
    public void setUp() {
        controller = new ChannelController();
        
    }
    
    @After
    public void tearDown() {
        System.out.println("End");
    }

    @Test
    public void testSomeMethod() {
        int subscribe = controller.subscribe(1, 2);
        assertEquals(3, subscribe);
        
    }
    
    @Test
    public void test2(){
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Error");
        controller.subscribe(5, 6);
    }
    
}

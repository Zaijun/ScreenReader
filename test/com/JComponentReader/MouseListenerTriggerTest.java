/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JComponentReader;

import java.awt.AWTEvent;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author ZAIJUN
 */
public class MouseListenerTriggerTest {
    
    public MouseListenerTriggerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of eventDispatched method, of class MouseListenerTrigger.
     */
    @Test
    public void testEventDispatched() {
        System.out.println("eventDispatched");
        AWTEvent event = null;
        MouseListenerTrigger instance = new MouseListenerTrigger();
        instance.eventDispatched(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

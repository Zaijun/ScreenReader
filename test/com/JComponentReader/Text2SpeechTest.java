/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JComponentReader;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author ZAIJUN
 */
public class Text2SpeechTest {
    
    public Text2SpeechTest() {
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
     * Test of say method, of class Text2Speech.
     */
    @Test
    public void testSay_StringArr() {
        System.out.println("say");
        String[] thingsToSay = null;
        Text2Speech instance = null;
        instance.say(thingsToSay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of say method, of class Text2Speech.
     */
    @Test
    public void testSay_String() {
        System.out.println("say");
        String thingToSay = "";
        Text2Speech instance = null;
        instance.say(thingToSay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dispose method, of class Text2Speech.
     */
    @Test
    public void testDispose() {
        System.out.println("dispose");
        Text2Speech instance = null;
        instance.dispose();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

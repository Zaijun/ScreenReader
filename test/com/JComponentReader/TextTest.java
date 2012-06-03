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
public class TextTest {
    
    public TextTest() {
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
     * Test of isVisible method, of class Text.
     */
    @Test
    public void testIsVisible() {
        System.out.println("isVisible");
        Text instance = null;
        boolean expResult = false;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisible method, of class Text.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean visible = false;
        Text instance = null;
        instance.setVisible(visible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBounds method, of class Text.
     */
    @Test
    public void testSetBounds() {
        System.out.println("setBounds");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        Text instance = null;
        instance.setBounds(x, y, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Text.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Text instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Text.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Text instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class Text.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Text instance = null;
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Text.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Text instance = null;
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Text.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Text instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ClipboardReader;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author ZAIJUN
 */
public class ReadClipboardTest {
    
    public ReadClipboardTest() {
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
     * Test of writeToSysClipboard method, of class ReadClipboard.
     */
    @Test
    public void testWriteToSysClipboard() {
        System.out.println("writeToSysClipboard");
        String str = "";
        ReadClipboard.writeToSysClipboard(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSysClipboardText method, of class ReadClipboard.
     */
    @Test
    public void testGetSysClipboardText() {
        System.out.println("getSysClipboardText");
        String expResult = "";
        String result = ReadClipboard.getSysClipboardText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lostOwnership method, of class ReadClipboard.
     */
    @Test
    public void testLostOwnership() {
        System.out.println("lostOwnership");
        Clipboard clipboard = null;
        Transferable contents = null;
        ReadClipboard instance = new ReadClipboard();
        instance.lostOwnership(clipboard, contents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ClipboardReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ZAIJUN
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.ClipboardReader.ClipboardTestDemoTest.class, com.ClipboardReader.ReadClipboardTest.class})
public class ClipboardReaderSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

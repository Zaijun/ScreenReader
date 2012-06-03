/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JComponentReader;

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
@Suite.SuiteClasses({com.JComponentReader.TextTest.class, com.JComponentReader.Text2SpeechTest.class, com.JComponentReader.ProxyGraphicsTest.class, com.JComponentReader.WordPickerTest.class, com.JComponentReader.JComponentDemoTest.class, com.JComponentReader.MouseListenerTriggerTest.class})
public class JComponentReaderSuite {

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

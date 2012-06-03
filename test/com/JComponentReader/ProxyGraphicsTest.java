/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JComponentReader;

import java.awt.RenderingHints.Key;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author ZAIJUN
 */
public class ProxyGraphicsTest {
    
    public ProxyGraphicsTest() {
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
     * Test of setTexts method, of class ProxyGraphics.
     */
    @Test
    public void testSetTexts() {
        System.out.println("setTexts");
        ArrayList<Text> texts = null;
        ProxyGraphics instance = null;
        instance.setTexts(texts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTexts method, of class ProxyGraphics.
     */
    @Test
    public void testGetTexts() {
        System.out.println("getTexts");
        ProxyGraphics instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getTexts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class ProxyGraphics.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Shape s = null;
        ProxyGraphics instance = null;
        instance.draw(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImage method, of class ProxyGraphics.
     */
    @Test
    public void testDrawImage_3args() {
        System.out.println("drawImage");
        Image img = null;
        AffineTransform xform = null;
        ImageObserver obs = null;
        ProxyGraphics instance = null;
        boolean expResult = false;
        boolean result = instance.drawImage(img, xform, obs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImage method, of class ProxyGraphics.
     */
    @Test
    public void testDrawImage_4args_1() {
        System.out.println("drawImage");
        BufferedImage img = null;
        BufferedImageOp op = null;
        int x = 0;
        int y = 0;
        ProxyGraphics instance = null;
        instance.drawImage(img, op, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawRenderedImage method, of class ProxyGraphics.
     */
    @Test
    public void testDrawRenderedImage() {
        System.out.println("drawRenderedImage");
        RenderedImage img = null;
        AffineTransform xform = null;
        ProxyGraphics instance = null;
        instance.drawRenderedImage(img, xform);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawRenderableImage method, of class ProxyGraphics.
     */
    @Test
    public void testDrawRenderableImage() {
        System.out.println("drawRenderableImage");
        RenderableImage img = null;
        AffineTransform xform = null;
        ProxyGraphics instance = null;
        instance.drawRenderableImage(img, xform);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawString method, of class ProxyGraphics.
     */
    @Test
    public void testDrawString_3args_1() {
        System.out.println("drawString");
        String str = "";
        int x = 0;
        int y = 0;
        ProxyGraphics instance = null;
        instance.drawString(str, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawString method, of class ProxyGraphics.
     */
    @Test
    public void testDrawString_3args_2() {
        System.out.println("drawString");
        String str = "";
        float x = 0.0F;
        float y = 0.0F;
        ProxyGraphics instance = null;
        instance.drawString(str, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawString method, of class ProxyGraphics.
     */
    @Test
    public void testDrawString_3args_3() {
        System.out.println("drawString");
        AttributedCharacterIterator iterator = null;
        int x = 0;
        int y = 0;
        ProxyGraphics instance = null;
        instance.drawString(iterator, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawString method, of class ProxyGraphics.
     */
    @Test
    public void testDrawString_3args_4() {
        System.out.println("drawString");
        AttributedCharacterIterator iterator = null;
        float x = 0.0F;
        float y = 0.0F;
        ProxyGraphics instance = null;
        instance.drawString(iterator, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawGlyphVector method, of class ProxyGraphics.
     */
    @Test
    public void testDrawGlyphVector() {
        System.out.println("drawGlyphVector");
        GlyphVector g = null;
        float x = 0.0F;
        float y = 0.0F;
        ProxyGraphics instance = null;
        instance.drawGlyphVector(g, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fill method, of class ProxyGraphics.
     */
    @Test
    public void testFill() {
        System.out.println("fill");
        Shape s = null;
        ProxyGraphics instance = null;
        instance.fill(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hit method, of class ProxyGraphics.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Rectangle rect = null;
        Shape s = null;
        boolean onStroke = false;
        ProxyGraphics instance = null;
        boolean expResult = false;
        boolean result = instance.hit(rect, s, onStroke);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceConfiguration method, of class ProxyGraphics.
     */
    @Test
    public void testGetDeviceConfiguration() {
        System.out.println("getDeviceConfiguration");
        ProxyGraphics instance = null;
        GraphicsConfiguration expResult = null;
        GraphicsConfiguration result = instance.getDeviceConfiguration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComposite method, of class ProxyGraphics.
     */
    @Test
    public void testSetComposite() {
        System.out.println("setComposite");
        Composite comp = null;
        ProxyGraphics instance = null;
        instance.setComposite(comp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaint method, of class ProxyGraphics.
     */
    @Test
    public void testSetPaint() {
        System.out.println("setPaint");
        Paint paint = null;
        ProxyGraphics instance = null;
        instance.setPaint(paint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStroke method, of class ProxyGraphics.
     */
    @Test
    public void testSetStroke() {
        System.out.println("setStroke");
        Stroke s = null;
        ProxyGraphics instance = null;
        instance.setStroke(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRenderingHint method, of class ProxyGraphics.
     */
    @Test
    public void testSetRenderingHint() {
        System.out.println("setRenderingHint");
        Key hintKey = null;
        Object hintValue = null;
        ProxyGraphics instance = null;
        instance.setRenderingHint(hintKey, hintValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRenderingHint method, of class ProxyGraphics.
     */
    @Test
    public void testGetRenderingHint() {
        System.out.println("getRenderingHint");
        Key hintKey = null;
        ProxyGraphics instance = null;
        Object expResult = null;
        Object result = instance.getRenderingHint(hintKey);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRenderingHints method, of class ProxyGraphics.
     */
    @Test
    public void testSetRenderingHints() {
        System.out.println("setRenderingHints");
        Map<?, ?> hints = null;
        ProxyGraphics instance = null;
        instance.setRenderingHints(hints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRenderingHints method, of class ProxyGraphics.
     */
    @Test
    public void testAddRenderingHints() {
        System.out.println("addRenderingHints");
        Map<?, ?> hints = null;
        ProxyGraphics instance = null;
        instance.addRenderingHints(hints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRenderingHints method, of class ProxyGraphics.
     */
    @Test
    public void testGetRenderingHints() {
        System.out.println("getRenderingHints");
        ProxyGraphics instance = null;
        RenderingHints expResult = null;
        RenderingHints result = instance.getRenderingHints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of translate method, of class ProxyGraphics.
     */
    @Test
    public void testTranslate_int_int() {
        System.out.println("translate");
        int x = 0;
        int y = 0;
        ProxyGraphics instance = null;
        instance.translate(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of translate method, of class ProxyGraphics.
     */
    @Test
    public void testTranslate_double_double() {
        System.out.println("translate");
        double tx = 0.0;
        double ty = 0.0;
        ProxyGraphics instance = null;
        instance.translate(tx, ty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotate method, of class ProxyGraphics.
     */
    @Test
    public void testRotate_double() {
        System.out.println("rotate");
        double theta = 0.0;
        ProxyGraphics instance = null;
        instance.rotate(theta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotate method, of class ProxyGraphics.
     */
    @Test
    public void testRotate_3args() {
        System.out.println("rotate");
        double theta = 0.0;
        double x = 0.0;
        double y = 0.0;
        ProxyGraphics instance = null;
        instance.rotate(theta, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scale method, of class ProxyGraphics.
     */
    @Test
    public void testScale() {
        System.out.println("scale");
        double sx = 0.0;
        double sy = 0.0;
        ProxyGraphics instance = null;
        instance.scale(sx, sy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shear method, of class ProxyGraphics.
     */
    @Test
    public void testShear() {
        System.out.println("shear");
        double shx = 0.0;
        double shy = 0.0;
        ProxyGraphics instance = null;
        instance.shear(shx, shy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transform method, of class ProxyGraphics.
     */
    @Test
    public void testTransform() {
        System.out.println("transform");
        AffineTransform Tx = null;
        ProxyGraphics instance = null;
        instance.transform(Tx);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransform method, of class ProxyGraphics.
     */
    @Test
    public void testSetTransform() {
        System.out.println("setTransform");
        AffineTransform Tx = null;
        ProxyGraphics instance = null;
        instance.setTransform(Tx);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransform method, of class ProxyGraphics.
     */
    @Test
    public void testGetTransform() {
        System.out.println("getTransform");
        ProxyGraphics instance = null;
        AffineTransform expResult = null;
        AffineTransform result = instance.getTransform();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaint method, of class ProxyGraphics.
     */
    @Test
    public void testGetPaint() {
        System.out.println("getPaint");
        ProxyGraphics instance = null;
        Paint expResult = null;
        Paint result = instance.getPaint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComposite method, of class ProxyGraphics.
     */
    @Test
    public void testGetComposite() {
        System.out.println("getComposite");
        ProxyGraphics instance = null;
        Composite expResult = null;
        Composite result = instance.getComposite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBackground method, of class ProxyGraphics.
     */
    @Test
    public void testSetBackground() {
        System.out.println("setBackground");
        Color color = null;
        ProxyGraphics instance = null;
        instance.setBackground(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackground method, of class ProxyGraphics.
     */
    @Test
    public void testGetBackground() {
        System.out.println("getBackground");
        ProxyGraphics instance = null;
        Color expResult = null;
        Color result = instance.getBackground();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStroke method, of class ProxyGraphics.
     */
    @Test
    public void testGetStroke() {
        System.out.println("getStroke");
        ProxyGraphics instance = null;
        Stroke expResult = null;
        Stroke result = instance.getStroke();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clip method, of class ProxyGraphics.
     */
    @Test
    public void testClip() {
        System.out.println("clip");
        Shape s = null;
        ProxyGraphics instance = null;
        instance.clip(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFontRenderContext method, of class ProxyGraphics.
     */
    @Test
    public void testGetFontRenderContext() {
        System.out.println("getFontRenderContext");
        ProxyGraphics instance = null;
        FontRenderContext expResult = null;
        FontRenderContext result = instance.getFontRenderContext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ProxyGraphics.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ProxyGraphics instance = null;
        Graphics expResult = null;
        Graphics result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class ProxyGraphics.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        ProxyGraphics instance = null;
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class ProxyGraphics.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Color c = null;
        ProxyGraphics instance = null;
        instance.setColor(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaintMode method, of class ProxyGraphics.
     */
    @Test
    public void testSetPaintMode() {
        System.out.println("setPaintMode");
        ProxyGraphics instance = null;
        instance.setPaintMode();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setXORMode method, of class ProxyGraphics.
     */
    @Test
    public void testSetXORMode() {
        System.out.println("setXORMode");
        Color c1 = null;
        ProxyGraphics instance = null;
        instance.setXORMode(c1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFont method, of class ProxyGraphics.
     */
    @Test
    public void testGetFont() {
        System.out.println("getFont");
        ProxyGraphics instance = null;
        Font expResult = null;
        Font result = instance.getFont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFont method, of class ProxyGraphics.
     */
    @Test
    public void testSetFont() {
        System.out.println("setFont");
        Font font = null;
        ProxyGraphics instance = null;
        instance.setFont(font);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFontMetrics method, of class ProxyGraphics.
     */
    @Test
    public void testGetFontMetrics() {
        System.out.println("getFontMetrics");
        Font f = null;
        ProxyGraphics instance = null;
        FontMetrics expResult = null;
        FontMetrics result = instance.getFontMetrics(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClipBounds method, of class ProxyGraphics.
     */
    @Test
    public void testGetClipBounds() {
        System.out.println("getClipBounds");
        ProxyGraphics instance = null;
        Rectangle expResult = null;
        Rectangle result = instance.getClipBounds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clipRect method, of class ProxyGraphics.
     */
    @Test
    public void testClipRect() {
        System.out.println("clipRect");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        ProxyGraphics instance = null;
        instance.clipRect(x, y, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClip method, of class ProxyGraphics.
     */
    @Test
    public void testSetClip_4args() {
        System.out.println("setClip");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        ProxyGraphics instance = null;
        instance.setClip(x, y, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClip method, of class ProxyGraphics.
     */
    @Test
    public void testGetClip() {
        System.out.println("getClip");
        ProxyGraphics instance = null;
        Shape expResult = null;
        Shape result = instance.getClip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClip method, of class ProxyGraphics.
     */
    @Test
    public void testSetClip_Shape() {
        System.out.println("setClip");
        Shape clip = null;
        ProxyGraphics instance = null;
        instance.setClip(clip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copyArea method, of class ProxyGraphics.
     */
    @Test
    public void testCopyArea() {
        System.out.println("copyArea");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        int dx = 0;
        int dy = 0;
        ProxyGraphics instance = null;
        instance.copyArea(x, y, width, height, dx, dy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawLine method, of class ProxyGraphics.
     */
    @Test
    public void testDrawLine() {
        System.out.println("drawLine");
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        ProxyGraphics instance = null;
        instance.drawLine(x1, y1, x2, y2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillRect method, of class ProxyGraphics.
     */
    @Test
    public void testFillRect() {
        System.out.println("fillRect");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        ProxyGraphics instance = null;
        instance.fillRect(x, y, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearRect method, of class ProxyGraphics.
     */
    @Test
    public void testClearRect() {
        System.out.println("clearRect");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        ProxyGraphics instance = null;
        instance.clearRect(x, y, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawRoundRect method, of class ProxyGraphics.
     */
    @Test
    public void testDrawRoundRect() {
        System.out.println("drawRoundRect");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        int arcWidth = 0;
        int arcHeight = 0;
        ProxyGraphics instance = null;
        instance.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillRoundRect method, of class ProxyGraphics.
     */
    @Test
    public void testFillRoundRect() {
        System.out.println("fillRoundRect");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        int arcWidth = 0;
        int arcHeight = 0;
        ProxyGraphics instance = null;
        instance.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawOval method, of class ProxyGraphics.
     */
    @Test
    public void testDrawOval() {
        System.out.println("drawOval");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        ProxyGraphics instance = null;
        instance.drawOval(x, y, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillOval method, of class ProxyGraphics.
     */
    @Test
    public void testFillOval() {
        System.out.println("fillOval");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        ProxyGraphics instance = null;
        instance.fillOval(x, y, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawArc method, of class ProxyGraphics.
     */
    @Test
    public void testDrawArc() {
        System.out.println("drawArc");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        int startAngle = 0;
        int arcAngle = 0;
        ProxyGraphics instance = null;
        instance.drawArc(x, y, width, height, startAngle, arcAngle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillArc method, of class ProxyGraphics.
     */
    @Test
    public void testFillArc() {
        System.out.println("fillArc");
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        int startAngle = 0;
        int arcAngle = 0;
        ProxyGraphics instance = null;
        instance.fillArc(x, y, width, height, startAngle, arcAngle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawPolyline method, of class ProxyGraphics.
     */
    @Test
    public void testDrawPolyline() {
        System.out.println("drawPolyline");
        int[] xPoints = null;
        int[] yPoints = null;
        int nPoints = 0;
        ProxyGraphics instance = null;
        instance.drawPolyline(xPoints, yPoints, nPoints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawPolygon method, of class ProxyGraphics.
     */
    @Test
    public void testDrawPolygon() {
        System.out.println("drawPolygon");
        int[] xPoints = null;
        int[] yPoints = null;
        int nPoints = 0;
        ProxyGraphics instance = null;
        instance.drawPolygon(xPoints, yPoints, nPoints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillPolygon method, of class ProxyGraphics.
     */
    @Test
    public void testFillPolygon() {
        System.out.println("fillPolygon");
        int[] xPoints = null;
        int[] yPoints = null;
        int nPoints = 0;
        ProxyGraphics instance = null;
        instance.fillPolygon(xPoints, yPoints, nPoints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImage method, of class ProxyGraphics.
     */
    @Test
    public void testDrawImage_4args_2() {
        System.out.println("drawImage");
        Image img = null;
        int x = 0;
        int y = 0;
        ImageObserver observer = null;
        ProxyGraphics instance = null;
        boolean expResult = false;
        boolean result = instance.drawImage(img, x, y, observer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImage method, of class ProxyGraphics.
     */
    @Test
    public void testDrawImage_6args() {
        System.out.println("drawImage");
        Image img = null;
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        ImageObserver observer = null;
        ProxyGraphics instance = null;
        boolean expResult = false;
        boolean result = instance.drawImage(img, x, y, width, height, observer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImage method, of class ProxyGraphics.
     */
    @Test
    public void testDrawImage_5args() {
        System.out.println("drawImage");
        Image img = null;
        int x = 0;
        int y = 0;
        Color bgcolor = null;
        ImageObserver observer = null;
        ProxyGraphics instance = null;
        boolean expResult = false;
        boolean result = instance.drawImage(img, x, y, bgcolor, observer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImage method, of class ProxyGraphics.
     */
    @Test
    public void testDrawImage_7args() {
        System.out.println("drawImage");
        Image img = null;
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        Color bgcolor = null;
        ImageObserver observer = null;
        ProxyGraphics instance = null;
        boolean expResult = false;
        boolean result = instance.drawImage(img, x, y, width, height, bgcolor, observer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImage method, of class ProxyGraphics.
     */
    @Test
    public void testDrawImage_10args() {
        System.out.println("drawImage");
        Image img = null;
        int dx1 = 0;
        int dy1 = 0;
        int dx2 = 0;
        int dy2 = 0;
        int sx1 = 0;
        int sy1 = 0;
        int sx2 = 0;
        int sy2 = 0;
        ImageObserver observer = null;
        ProxyGraphics instance = null;
        boolean expResult = false;
        boolean result = instance.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImage method, of class ProxyGraphics.
     */
    @Test
    public void testDrawImage_11args() {
        System.out.println("drawImage");
        Image img = null;
        int dx1 = 0;
        int dy1 = 0;
        int dx2 = 0;
        int dy2 = 0;
        int sx1 = 0;
        int sy1 = 0;
        int sx2 = 0;
        int sy2 = 0;
        Color bgcolor = null;
        ImageObserver observer = null;
        ProxyGraphics instance = null;
        boolean expResult = false;
        boolean result = instance.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, bgcolor, observer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dispose method, of class ProxyGraphics.
     */
    @Test
    public void testDispose() {
        System.out.println("dispose");
        ProxyGraphics instance = null;
        instance.dispose();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

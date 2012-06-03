
package com.JComponentReader;

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

//This class records mouse location
public class ProxyGraphics extends Graphics2D {

    private Graphics2D proxy;
    private ArrayList<Text> texts = new ArrayList<>();

    /** Creates a new instance of ProxyGraphics */
    public ProxyGraphics(Graphics2D g2d) {
        proxy = g2d;
    }

    public void setTexts(ArrayList<Text> texts) {
        this.texts = texts;
    }

    public ArrayList<Text> getTexts() {
        return texts;
    }

    @Override
    public void draw(Shape s) {
        proxy.draw(s);
    }

    @Override
    public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
        return proxy.drawImage(img, xform, obs);
    }

    @Override
    public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {
        proxy.drawImage(img, op, x, y);
    }

    @Override
    public void drawRenderedImage(RenderedImage img, AffineTransform xform) {
        proxy.drawRenderedImage(img, xform);
    }

    @Override
    public void drawRenderableImage(RenderableImage img, AffineTransform xform) {
        proxy.drawRenderableImage(img, xform);
    }

    @Override
    public void drawString(String str, int x, int y) {
        if (str == null || str.length() == 0) {
            return;
        }
        int leftx = x;
        int topy = y - proxy.getFontMetrics().getAscent();
        int height = proxy.getFontMetrics().getHeight();
        StringBuilder builder = null;
        int pointer = 0;
        while (pointer < str.length()) {
            char c = str.charAt(pointer++);
            if (Character.isLetter(c)) {
                builder = new StringBuilder();
                while (Character.isLetter(c)) {
                    builder.append(c);
                    if (pointer == str.length()) {
                        break;
                    } else {
                        c = str.charAt(pointer++);
                    }
                }
                String s = builder.toString();
                Text text = new Text(s);
                int width = proxy.getFontMetrics().stringWidth(s);
                text.setBounds(leftx, topy, width, height);
                texts.add(text);
                leftx = x + proxy.getFontMetrics().stringWidth(str.substring(0, pointer));
                if (pointer == str.length()) {
                    break;
                } else {
                    if (!Character.isLetter(c)) {
                        pointer--;
                    }
                }
            }
        }
        proxy.drawString(str, x, y);
    }

    @Override
    public void drawString(String str, float x, float y) {
        System.out.println("drawString1");
        proxy.drawString(str, x, y);
    }

    @Override
    public void drawString(AttributedCharacterIterator iterator, int x, int y) {
        System.out.println("drawString2");
        proxy.drawString(iterator, x, y);
    }

    @Override
    public void drawString(AttributedCharacterIterator iterator, float x, float y) {
        System.out.println("drawString3");
        proxy.drawString(iterator, x, y);
    }

    @Override
    public void drawGlyphVector(GlyphVector g, float x, float y) {
        System.out.println("drawGlyphVector");
        proxy.drawGlyphVector(g, x, y);
    }

    @Override
    public void fill(Shape s) {
        proxy.fill(s);
    }

    @Override
    public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
        return proxy.hit(rect, s, onStroke);
    }

    @Override
    public GraphicsConfiguration getDeviceConfiguration() {
        return proxy.getDeviceConfiguration();
    }

    @Override
    public void setComposite(Composite comp) {
        proxy.setComposite(comp);
    }

    @Override
    public void setPaint(Paint paint) {
        proxy.setPaint(paint);
    }

    @Override
    public void setStroke(Stroke s) {
        proxy.setStroke(s);
    }

    @Override
    public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {
        proxy.setRenderingHint(hintKey, hintValue);
    }

    @Override
    public Object getRenderingHint(RenderingHints.Key hintKey) {
        return proxy.getRenderingHint(hintKey);
    }

    @Override
    public void setRenderingHints(Map<?, ?> hints) {
        proxy.setRenderingHints(hints);
    }

    @Override
    public void addRenderingHints(Map<?, ?> hints) {
        proxy.addRenderingHints(hints);
    }

    @Override
    public RenderingHints getRenderingHints() {
        return proxy.getRenderingHints();
    }

    @Override
    public void translate(int x, int y) {
        proxy.translate(x, y);
    }

    @Override
    public void translate(double tx, double ty) {
        proxy.translate(tx, ty);
    }

    @Override
    public void rotate(double theta) {
        proxy.rotate(theta);
    }

    @Override
    public void rotate(double theta, double x, double y) {
        proxy.rotate(theta, x, y);
    }

    @Override
    public void scale(double sx, double sy) {
        proxy.scale(sx, sy);
    }

    @Override
    public void shear(double shx, double shy) {
        proxy.shear(shx, shy);
    }

    @Override
    public void transform(AffineTransform Tx) {
        proxy.transform(Tx);
    }

    @Override
    public void setTransform(AffineTransform Tx) {
        proxy.setTransform(Tx);
    }

    @Override
    public AffineTransform getTransform() {
        return proxy.getTransform();
    }

    @Override
    public Paint getPaint() {
        return proxy.getPaint();
    }

    @Override
    public Composite getComposite() {
        return proxy.getComposite();
    }

    @Override
    public void setBackground(Color color) {
        proxy.setBackground(color);
    }

    @Override
    public Color getBackground() {
        return proxy.getBackground();
    }

    @Override
    public Stroke getStroke() {
        return proxy.getStroke();
    }

    @Override
    public void clip(Shape s) {
        proxy.clip(s);
    }

    @Override
    public FontRenderContext getFontRenderContext() {
        return proxy.getFontRenderContext();
    }

    @Override
    public Graphics create() {
        ProxyGraphics pg = new ProxyGraphics((Graphics2D) proxy.create());
        pg.setTexts(this.getTexts());
        return pg;
    }

    @Override
    public Color getColor() {
        return proxy.getColor();
    }

    @Override
    public void setColor(Color c) {
        proxy.setColor(c);
    }

    @Override
    public void setPaintMode() {
        proxy.setPaintMode();
    }

    @Override
    public void setXORMode(Color c1) {
        proxy.setXORMode(c1);
    }

    @Override
    public Font getFont() {
        return proxy.getFont();
    }

    @Override
    public void setFont(Font font) {
        proxy.setFont(font);
    }

    @Override
    public FontMetrics getFontMetrics(Font f) {
        return proxy.getFontMetrics(f);
    }

    @Override
    public Rectangle getClipBounds() {
        return proxy.getClipBounds();
    }

    @Override
    public void clipRect(int x, int y, int width, int height) {
        proxy.clipRect(x, y, width, height);
    }

    @Override
    public void setClip(int x, int y, int width, int height) {
        proxy.setClip(x, y, width, height);
    }

    @Override
    public Shape getClip() {
        return proxy.getClip();
    }

    @Override
    public void setClip(Shape clip) {
        proxy.setClip(clip);
    }

    @Override
    public void copyArea(int x, int y, int width, int height, int dx, int dy) {
        proxy.copyArea(x, y, width, height, dx, dy);
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        proxy.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void fillRect(int x, int y, int width, int height) {
        proxy.fillRect(x, y, width, height);
    }

    @Override
    public void clearRect(int x, int y, int width, int height) {
        proxy.clearRect(x, y, width, height);
    }

    @Override
    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        proxy.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
    }

    @Override
    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        proxy.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
    }

    @Override
    public void drawOval(int x, int y, int width, int height) {
        proxy.drawOval(x, y, width, height);
    }

    @Override
    public void fillOval(int x, int y, int width, int height) {
        proxy.fillOval(x, y, width, height);
    }

    @Override
    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        proxy.drawArc(x, y, width, height, startAngle, arcAngle);
    }

    @Override
    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        proxy.fillArc(x, y, width, height, startAngle, arcAngle);
    }

    @Override
    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
        proxy.drawPolyline(xPoints, yPoints, nPoints);
    }

    @Override
    public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        proxy.drawPolygon(xPoints, yPoints, nPoints);
    }

    @Override
    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        proxy.fillPolygon(xPoints, yPoints, nPoints);
    }

    @Override
    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
        return proxy.drawImage(img, x, y, observer);
    }

    @Override
    public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
        return proxy.drawImage(img, x, y, width, height, observer);
    }

    @Override
    public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
        return proxy.drawImage(img, x, y, bgcolor, observer);
    }

    @Override
    public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
        return proxy.drawImage(img, x, y, width, height, bgcolor, observer);
    }

    @Override
    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
        return proxy.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer);
    }

    @Override
    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
        return drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, bgcolor, observer);
    }

    @Override
    public void dispose() {
        proxy.dispose();
    }
}

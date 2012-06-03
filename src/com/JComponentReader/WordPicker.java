
package com.JComponentReader;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JComponent;

//Pick the text to speak
public class WordPicker implements MouseMotionListener {

    private static Method paintComponentMethod;
    static {
        try {
            paintComponentMethod = JComponent.class.getDeclaredMethod("paintComponent", Graphics.class);
            paintComponentMethod.setAccessible(true);
        } catch (NoSuchMethodException | SecurityException e) {
        }
    }
    private JComponent component;

    private ArrayList<Text> texts;

    public WordPicker(JComponent component) {
        this.component = component;
        Image offImage = component.createVolatileImage(component.getWidth(), component.getHeight());
        if (offImage != null) {
            ProxyGraphics pg = new ProxyGraphics((Graphics2D) offImage.getGraphics());
            ArrayList<JComponent> dbcomponents = new ArrayList<>();
            clearDoubleBuffer(component, dbcomponents);
            paintComponent(pg);
            resetDbl(dbcomponents);
            texts = pg.getTexts();
        }
    }

    private void paintComponent(Graphics g) {
        try {
            paintComponentMethod.invoke(component, g);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        for (Text text : texts) {
            if (x >= text.getX() && x <= text.getX() + text.getWidth() && y >= text.getY() && y <= text.getY() + text.getHeight()) {
                if (!text.isVisible()) {
                    String thingsToSay = text.getText();
                    Text2Speech voiceKevin16 = new Text2Speech("kevin16");
                    voiceKevin16.say(thingsToSay);
                    
                }
                return;
            }
        }
    }

    private void resetDbl(ArrayList<JComponent> dbcomponents) {
        for (JComponent jc : dbcomponents) {
            jc.setDoubleBuffered(true);
        }
    }

    private void clearDoubleBuffer(Component c, ArrayList<JComponent> dbcomponents) {
        if (c instanceof JComponent) {
            JComponent jc = (JComponent) c;
            if (jc.isDoubleBuffered()) {
                jc.setDoubleBuffered(false);
                dbcomponents.add(jc);
            }
            int count = jc.getComponentCount();
            for (int i = 0; i < count; i++) {
                Component comp = jc.getComponent(i);
                clearDoubleBuffer(comp, dbcomponents);
            }
        }
    }
}

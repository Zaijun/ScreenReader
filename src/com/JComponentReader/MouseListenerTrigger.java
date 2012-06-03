
package com.JComponentReader;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;

//Listen mouse actions
public class MouseListenerTrigger implements AWTEventListener {

    private ArrayList<Window> windows = new ArrayList<>();

    public MouseListenerTrigger() {
    }

    private void addMouseListener(Container container) {
        if (container instanceof JComponent) {
            JComponent jc = (JComponent) container;
            WordPicker wp = new WordPicker(jc);
            container.addMouseMotionListener(wp);
        }
        int count = container.getComponentCount();
        for (int i = 0; i < count; i++) {
            Component child = container.getComponent(i);
            if (child instanceof Container) {
                addMouseListener((java.awt.Container) child);
            }
        }
    }

    @Override
    public void eventDispatched(AWTEvent event) {
        if (event instanceof MouseEvent) {
            Object src = event.getSource();
            if (src != null && src instanceof Component) {
                Component component = (Component) src;
                Window window = null;
                if (component instanceof Window) {
                    window = (Window) component;
                } else {
                    window = SwingUtilities.getWindowAncestor(component);
                }
                if (window != null && !windows.contains(window)) {
                    if (window instanceof RootPaneContainer) {
                        addMouseListener(((RootPaneContainer) window).getContentPane());
                    } else {
                        addMouseListener(window);
                    }
                    windows.add(window);
                }
            }
        }
    }
}


package com.ClipboardReader;

import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.IOException;



class ReadClipboard implements ClipboardOwner {
    //Write text to system clipyboard
    public static void writeToSysClipboard(String str) {
        Clipboard sysClip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable text = new StringSelection(str);
        sysClip.setContents(text, null);
    }

    //Get text from system clipboard
    public static String getSysClipboardText() {
        String ret = "";
        Clipboard sysClip = Toolkit.getDefaultToolkit().getSystemClipboard();
   
        // Get the content of clipboard
        Transferable clipTf = sysClip.getContents(null);

        if (clipTf != null) {
            // Check if the content in clipboad is text
            if (clipTf.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                try {
                    ret = (String) clipTf.getTransferData(DataFlavor.stringFlavor);
                } catch (UnsupportedFlavorException | IOException e) {
                }
            }
        }
        
        return ret;
    }

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

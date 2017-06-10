package org.cc16;

import java.awt.event.KeyEvent;

public final class Util {
    
    public static boolean validaCampoNumerico(KeyEvent e){
        return  (!((e.getKeyChar() >= KeyEvent.VK_0 && 
                               e.getKeyChar() <= KeyEvent.VK_9) || 
                              (e.getKeyChar() == KeyEvent.VK_ENTER || 
                               e.getKeyChar() == KeyEvent.VK_SPACE || 
                               e.getKeyChar() == KeyEvent.VK_BACK_SPACE))); 
    }
    
}

package com.sebp3t.wsD.oblak02.clib;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashMap;

public class Poehli_IsKeyPressed {
    private static boolean wPressed = false;
    private HashMap<Integer, Boolean> keys = new HashMap<Integer, Boolean>();
    public Poehli_IsKeyPressed() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {

            @Override
            public boolean dispatchKeyEvent(KeyEvent ke) {
                synchronized (Poehli_IsKeyPressed.class) {
                    switch (ke.getID()) {
                    case KeyEvent.KEY_PRESSED:
                        keys.put(ke.getKeyCode(), true);
                        break;

                    case KeyEvent.KEY_RELEASED:
                        keys.put(ke.getKeyCode(), false);
                        break;
                    }
                    return false;
                }
            }
        });
    }
    public static boolean isWPressed() {
        synchronized (Poehli_IsKeyPressed.class) {
            return wPressed;
        }
    }

    public boolean isPressed(int keyCode){
        synchronized (Poehli_IsKeyPressed.class) {
            if (keys == null)
                return false;
            if (keys.get(keyCode) == null)
                return false;
            return keys.get(keyCode);
        }
    }

}
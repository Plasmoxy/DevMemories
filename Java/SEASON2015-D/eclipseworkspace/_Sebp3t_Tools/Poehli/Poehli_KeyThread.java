package ;

import java.util.ArrayList;
import java.util.HashMap;

public class Poehli_KeyThread extends Thread{
    private int sleep = 3;
    ArrayList<Poehli_KeyActionListener> listener = new ArrayList<Poehli_KeyActionListener>();
    Poehli_IsKeyPressed isPressed = new Poehli_IsKeyPressed();
    HashMap<Poehli_KeyActionListener, Boolean> pressed = new HashMap<Poehli_KeyActionListener, Boolean>();
    public Poehli_KeyThread() {
        this.start();
    }
    public void run() {
        while (true){
            for (int i = 0; i < listener.size(); i++) {
                Poehli_KeyActionListener curListener = listener.get(i);
                if (isPressed.isPressed(curListener.getKeyCode()) && !pressed.get(curListener)){
                    curListener.onKeyDown();
                    pressed.put(curListener, true);
                } else if(!isPressed.isPressed(curListener.getKeyCode()) && pressed.get(curListener)) {
                    curListener.onKeyUp();
                    pressed.put(curListener, false);
                } 

                if(isPressed.isPressed(curListener.getKeyCode())){
                    curListener.onKeyHolding();
                }
                try{
                    Thread.sleep(sleep);
                } catch(InterruptedException e){

                }
            }
        }
    }

    public void addKeyActionListener(Poehli_KeyActionListener l){
        listener.add(l);
        pressed.put(l, false);
    }

}
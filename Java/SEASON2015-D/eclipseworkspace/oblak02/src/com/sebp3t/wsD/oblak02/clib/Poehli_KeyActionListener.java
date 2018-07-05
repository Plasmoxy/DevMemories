package com.sebp3t.wsD.oblak02.clib;

public abstract class Poehli_KeyActionListener {
    protected int keyCode;
    public Poehli_KeyActionListener(int keyCode) {
        this.keyCode = keyCode;
    }
    public void setKeyCode(int keyCode){
        this.keyCode = keyCode;
    }
    public int getKeyCode(){
        return this.keyCode;
    }
    public abstract void onKeyDown();
    public abstract void onKeyUp();
    public abstract void onKeyHolding();
}
package com.amazon.awdstoragefeemanager.exception;

public class AdapterDemo {
    public static void main(String[] args) {
        AndroidPhone phone = new AndroidPhone(new LightningAdapter());
        phone.playTypeC();
        phone.playLightning();

    }
}

interface TypeCInterface {
    void playTypeC();
}

class AndroidPhone implements TypeCInterface, LightningInterface{

    private LightningAdapter lightningAdapter;

    public AndroidPhone(LightningAdapter lightningAdapter) {
        this.lightningAdapter = lightningAdapter;
    }

    public void playTypeC() {
        System.out.println("playing type c");
    }

    public void playLightning() {
        lightningAdapter.playLightning();
    }
}

interface LightningInterface {
    void playLightning();
}

class LightningAdapter implements LightningInterface {

    @Override
    public void playLightning() {
        System.out.println("playing lightning");
    }
}

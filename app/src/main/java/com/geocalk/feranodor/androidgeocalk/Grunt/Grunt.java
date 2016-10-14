package com.geocalk.feranodor.androidgeocalk.Grunt;

import static java.lang.Math.round;

/**
 * Created by Feranodor on 2016-08-25.
 * abstrakcyjna klasa zawierajaca wspolne elementy grontow
 * spoistych i niespoistych wraz z getterami
 */
public abstract class Grunt {
    protected float gestWlasc;
    protected float gestObj;
    protected int wilgNat;
    protected float katTarciaWew;
    protected int modulEo;
    protected int modulMo;
    protected int modulM;

    public float getGestWlasc() {
        return gestWlasc;
    }

    public float getGestObj() {
        return gestObj;
    }

    public int getWilgNat() {
        return wilgNat;
    }

    public float getKatTarciaWew() {
        return (round(katTarciaWew*100f))/100f;
    }

    public int getModulEo() {
        return modulEo;
    }

    public int getModulMo() {
        return modulMo;
    }

    public int getModulM() {
        return modulM;
    }
}

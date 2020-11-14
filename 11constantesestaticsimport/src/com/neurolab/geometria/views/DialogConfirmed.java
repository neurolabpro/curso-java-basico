package com.neurolab.geometria.views;

public class DialogConfirmed {

    public static final int ORIGIN_NONE = 0;
    public static final int ORIGIN_USER = 1;
    public static final int ORIGIN_POST = 2;

    private int type = ORIGIN_NONE;

    public DialogConfirmed() {

    }

    public void show(int type) {
        this.type = type;
        switch (type) {
            case ORIGIN_USER:
                // visualizar mas botones
                break;
            case ORIGIN_POST:
                // visualuzar solo un boton
                break;
        }
    }
}

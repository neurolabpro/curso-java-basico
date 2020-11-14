package com.neurolab.geometria.views;

public class PostForm {

    private DialogConfirmed dialogConfirmed;
    public PostForm() {
        dialogConfirmed = new DialogConfirmed();

    }

    public void savePost() {
        dialogConfirmed.show(DialogConfirmed.ORIGIN_POST);
    }
}

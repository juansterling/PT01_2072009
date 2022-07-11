package com.example.pt01no4_2072009;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label urutan;

    public int i = 2;


    @FXML
    protected void next(){
        urutan.setText(String.valueOf(i++));
    }
    @FXML
    protected void reset(){
        urutan.setText(String.valueOf("1"));
        i = 2;
    }
}

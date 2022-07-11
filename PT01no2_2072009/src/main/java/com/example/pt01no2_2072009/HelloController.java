package com.example.pt01no2_2072009;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private TextField tampilan;
    @FXML
    private TextField hasil;


    public String operator = "";
    public String angka = "";
    public Integer angka1;
    public Integer angka2;

    public void number(ActionEvent ae){
        angka = ((Button)ae.getSource()).getText();
        hasil.setText(hasil.getText()+angka);
    }

    public void operate(ActionEvent ae){
        operator = ((Button)ae.getSource()).getText();
        tampilan.setText(hasil.getText()+operator);
        angka1 = Integer.parseInt(hasil.getText());
        angka = "";
        hasil.setText("");
    }

    public void olah(){
        angka2 = Integer.parseInt(hasil.getText());
        tampilan.setText(String.valueOf(angka1) + operator + String.valueOf(angka2));
        switch (operator){
            case"+":
                hasil.setText(String.valueOf(angka1+angka2));
                break;
            case"-":
                hasil.setText(String.valueOf(angka1-angka2));
                break;
            case"*":
                hasil.setText(String.valueOf(angka1*angka2));
                break;
            case"/":
                hasil.setText(String.valueOf(angka1/angka2));
                break;
        }
    }
    public void ulang(){
        tampilan.setText("");
        hasil.setText("");
        angka = "";
        operator = "";
    }
}
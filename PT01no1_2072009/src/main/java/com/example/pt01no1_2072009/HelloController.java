package com.example.pt01no1_2072009;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField a1;
    @FXML
    private TextField a2;
    @FXML
    private TextField hasil;

    @FXML
    protected void tambah() {
        String pertama = a1.getText();
        String kedua = a2.getText();
        int angka1 = Integer.parseInt(pertama);
        int angka2 = Integer.parseInt(kedua);
        int hasilnya = angka1 + angka2;
        String total = String.valueOf(hasilnya);
        hasil.setText(total);
    }
    @FXML
    protected void kurang() {
        String pertama = a1.getText();
        String kedua = a2.getText();
        int angka1 = Integer.parseInt(pertama);
        int angka2 = Integer.parseInt(kedua);
        int hasilnya = angka1 - angka2;
        String total = String.valueOf(hasilnya);
        hasil.setText(total);
    }
    @FXML
    protected void kali() {
        String pertama = a1.getText();
        String kedua = a2.getText();
        int angka1 = Integer.parseInt(pertama);
        int angka2 = Integer.parseInt(kedua);
        int hasilnya = angka1 * angka2;
        String total = String.valueOf(hasilnya);
        hasil.setText(total);
    }
    @FXML
    protected void bagi() {
        String pertama = a1.getText();
        String kedua = a2.getText();
        int angka1 = Integer.parseInt(pertama);
        int angka2 = Integer.parseInt(kedua);
        int hasilnya = angka1 / angka2;
        String total = String.valueOf(hasilnya);
        hasil.setText(total);
    }
}
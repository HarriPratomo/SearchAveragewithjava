package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int nilai1, nilai2, nilai3;
        int grade_average = 60;
        nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Pertama :"));
        nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai kedua:"));
        nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Ketiga:"));

        int ratanilai = (nilai1 + nilai2 + nilai3) / 3;

        if (ratanilai >= grade_average) {
            JOptionPane.showMessageDialog(null, ":-)");
        } else {
            JOptionPane.showMessageDialog(null, ":-(");
        }
    }
}

package com.mycompany.unisul24;
import javax.swing.JOptionPane;
public class Unisul24 {

    public static void main(String[] args) {
        int i = 14;
        do {
            i++;
            if (i % 2 == 0) {
                JOptionPane.showMessageDialog(null, i);
            }
            
        } while (i < 23);
    }
}

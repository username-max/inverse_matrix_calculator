package javaapplication5;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Matrix {

    public static void main(String[] args) {
        Menu a = new Menu();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        a.setLocation(dim.width/4, dim.height/4);
        a.setVisible(true);
    }
    
}

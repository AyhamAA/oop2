
package CalculaterPKJ;

import javax.swing.JOptionPane;

public class Util {
    public static void println(String msg) {
        System.out.println(msg);
    }
    public static int readNumber(String msg) {
        String str = JOptionPane.showInputDialog(msg);
        int number = Integer.parseInt(str);
        return number;
    }
    public static int readNumber() {
        return readNumber("Please enter number");
    }
}

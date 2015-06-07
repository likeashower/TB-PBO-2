
package RuangKelas;

import java.io.Serializable;

public class Cetakan_JmlKonPosisiSarana implements Serializable {
private String input;
private int input1;
private double hitung = 0;
    
     public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public double setHitung(double hitung) {
        return this.hitung = hitung;
    }

    public double getHitung() {
        return hitung;
    }

    public int getInput1() {
        return input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }
    
 }
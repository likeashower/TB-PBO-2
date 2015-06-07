
package RuangKelas;

import java.io.Serializable;


public class Cetakan_KenyamananRK implements Serializable{
    
   private String input;
   private double hitung = 0;
   
   public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public double getHitung() {
        return hitung;
    }

    public void setHitung(double hitung) {
        this.hitung = hitung;
    }
    
}
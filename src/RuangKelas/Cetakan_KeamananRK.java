
package RuangKelas;

import java.io.Serializable;

public class Cetakan_KeamananRK implements Serializable {

private String input;
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

    
    
}

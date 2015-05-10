package RuangKelas;
import java.text.DecimalFormat;
/**
 *
 * @author acer
 */
public class KemananRK extends SuperClass{
    Cetakan_KeamananRK[] apa = new Cetakan_KeamananRK[4];
    Cetakan_KeamananRK cm = new Cetakan_KeamananRK();
    

    static DecimalFormat df = new DecimalFormat("0.00");
    
        void InputKeamananRK(){
        String a, b, c,d;
        int j = 0;
        while (j < apa.length) {
            apa[j] = new Cetakan_KeamananRK();
            j++;
        }
        
        System.out.println("Apakah kelas anda kokoh? \n a. Ya \n b. Tidak");
        a = input.next();
        apa[0].setInput(a);
        System.out.println("Kunci Pintu :  \n a. Ada \n b. Tidak");
        b = input.next();
        apa[1].setInput(b);
        System.out.println("Kunci Jendela : \n a. Ada \n b. Tidak");
        c = input.next();
        apa[2].setInput(c);
        System.out.println("Apakah kelas anda aman? \n a. Ya \n b. Tidak");
        d = input.next();
        apa[3].setInput(d);
    }
        
        @Override
            boolean analisis_string1() {
            if (apa[i].getInput().equals("a")) { 
            t++;
            return true;
            } else {
            return false;
            }
   
    } 
    
     void OutputKeamananRK(){
            for (i=0; i <4 ;i++) {
            analisis_string1();}
            cm.setHitung(t);
            System.out.println("Persentase Keamanan : " + df.format((cm.getHitung() / apa.length) * 100) + "%");

       }
    
   
    }
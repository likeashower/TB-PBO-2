
package RuangKelas;
import java.text.DecimalFormat;
import java.io.*;

public class KeamananRK extends AnalisaRuangKelas implements AnalisaRuangKelas1{
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
            public boolean analisis_string1() {
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
     
     void File(){
         
         String File = "Keamanan.bin";
         
         try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(File));
            for (int n =0; n <4 ;n++) {
            os.writeObject(apa[n].getInput());}
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
          /*try {
                ObjectInputStream is = new ObjectInputStream(new FileInputStream(File));
                Cetakan_KeamananRK o = (Cetakan_KeamananRK) is.readObject();
                System.out.println(o.getInput());
                System.out.println("Apakah kelas anda kokoh? \n a. Ya \n b. Tidak - Jawab :" + o.getInput());
                System.out.println("Kunci Pintu :  \n a. Ada \n b. Tidak - Jawab :" + o.getInput());
                System.out.println("Kunci Jendela : \n a. Ada \n b. Tidak - Jawab : " + o.getInput());
                System.out.println("Apakah kelas anda aman? \n a. Ya \n b. Tidak - Jawab : " + o.getInput());
                is.close();
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        }*/
         
     }
    
   
    }
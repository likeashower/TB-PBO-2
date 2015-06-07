

package RuangKelas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class KondisiKelas extends AnalisaRuangKelas{
    
    Cetakan_KondisiKelas obj = new Cetakan_KondisiKelas();
    Cetakan_KondisiKelas[] arr = new Cetakan_KondisiKelas[5];
    int i;
    
    
    void InputKondisiKelas() {
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Cetakan_KondisiKelas();
        }
        
        int panjang, lebar, jml_kursi, jml_pintu, jml_jendela;
        //panjang
        System.out.println("Panjang ruang : ");
        panjang = input.nextInt();
        arr[0].setInput(panjang);
        //lebar
        System.out.println("Lebar ruang : ");
        lebar = input.nextInt();
        arr[1].setInput(lebar);
        //kursi
        System.out.println("Jumlah kursi : ");
        jml_kursi = input.nextInt();
        arr[2].setInput(jml_kursi);
        //pintu
        System.out.println("Jumlah pintu : ");
        jml_pintu = input.nextInt();
        arr[3].setInput(jml_pintu);
        //jendela
        System.out.println("Jumlah jendela : ");
        jml_jendela = input.nextInt();
        arr[4].setInput(jml_jendela);
        
    }
    
    int hitung_luas () {
        int luas = arr[0].getInput() * arr[1].getInput();
        return luas;
    }
    
    int hitung_rasio() {
        int rasio = hitung_luas() / arr[2].getInput();
        return rasio;
    }
    
        
        @Override
        boolean analisis_int1() {      
        if ( arr[0].getInput() > arr[1].getInput() ) {
            t++;
            return true;
        } else if (arr[0].getInput() < arr[1].getInput()){
            t++;
            return true;
        } else if (arr[0].getInput() == arr[1].getInput()){
            t++;
            return true;
        } else {
            return false;
        }
    }
                
        @Override
        boolean analisis_int2(){
            if ( hitung_rasio() >= 0.5 ) {
            t++;
            return true;
        } else {
           return false;
        }
    }
         
       @Override
       boolean analisis_int3(){
         if (arr[3].getInput() >= 2){
            t++;
            return true;
        } else {
            return false;
        }
     }
        
       @Override
       boolean analisis_int4(){        
        if (arr[4].getInput() >= 1 ) {
            t++;
            return true;
        } else {
            return false;
        }
       }
                          
        void OutputKondisiKelas() {
        analisis_int1();
        analisis_int2();
        analisis_int3();
        analisis_int4();
        
        obj.setHitung(t);
        System.out.println("Luas Ruangan : " + hitung_luas() + "m");        
        System.out.println("Persentase Kesesuaian Kondisi Kelas : " + (obj.getHitung()/4)*100 + "%");
  }
        
        void File(){
         
         String File = "Kondisi.bin";
         
         try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(File));
            for (int n =0; n <4 ;n++) {
            os.writeObject(obj.getInput());}
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           System.out.println("Done Writing");
           
          try {
                FileInputStream fl = new FileInputStream(File);
                ObjectInputStream is = new ObjectInputStream(fl);
                Object one = is.readObject();
                Cetakan_KondisiKelas o = (Cetakan_KondisiKelas) one;
                System.out.println("ini adalah input string " + o.getInput());
                is.close();
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        }
         
     }
}
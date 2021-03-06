package RuangKelas;

import java.io.*;

public class KebersihanRK extends AnalisaRuangKelas implements AnalisaRuangKelas1 {

    
    Cetakan_KebersihanRK obj = new Cetakan_KebersihanRK();
    Cetakan_KebersihanRK[] arr = new Cetakan_KebersihanRK[4];
    
 void InputKebersihanRK() {
     
     for (int i = 0; i < arr.length; i++){
            arr[i] = new Cetakan_KebersihanRK();
        }
     
     String sirkulasi_udara;
     int Nilai_pencahayaan, kelembapan, suhu;
 //input sirkulasi udara
     System.out.println("Apakah sirkulasi udara lancar? \n a. Lancar \n b. Tidak");
     sirkulasi_udara = input.nextLine();
     arr[0].setInput(sirkulasi_udara);
 //input nilai pencahayaan
     System.out.println("Masukkan nilai pencahayaan : ");
     Nilai_pencahayaan = input.nextInt();
     arr[1].setInput1(Nilai_pencahayaan);
 //input kelembapan
     System.out.println("Masukkan persentase kelembapan : ");
     kelembapan = input.nextInt();
     arr[2].setInput1(kelembapan);
 //input suhu
     System.out.println("Masukkan suhu (celcius) : ");
     suhu = input.nextInt();
     arr[3].setInput1(suhu);
     
}
    
     @Override
     public boolean analisis_string1() {
     if (arr[0].getInput().equals("a")) {
         t++;
         return true;
     } else {
         return false;
     }
     
     } 
     
     @Override
      boolean analisis_int1() {
        if (arr[1].getInput1() >= 250 && arr[1].getInput1() <= 350) {
         t++;
         return true;
     } else {
         return false;
     }
        
      }
      
      @Override
      boolean analisis_int2() {
        if (arr[2].getInput1() >= 70 && arr[2].getInput1() <= 80) {
         t++;
         return true;
     } else {
         return false;
     }
        
      }
     
     
     @Override
      boolean analisis_int3() {
    if (arr[3].getInput1() >= 25 && arr[3].getInput1() <= 35) {
         t++;
         return true;
     } else {
         return false;
     }
    }
      
       void OutputKebersihanRK(){
     analisis_string1();
     analisis_int1();
     analisis_int2();
     analisis_int3();
     obj.setHitung(t);
     System.out.println("Persentase Kebersihan Ruang Kelas : " + (obj.getHitung()/arr.length)*100 + "%");
}
       
       
       void File(){
         
         String File = "Kebersihan.bin";
         
         try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(File));
            for (int n =0; n <4 ;n++) {
            os.writeObject(obj.getInput());}
            for (int n =0; n <4 ;n++) {
            os.writeObject(obj.getInput1());}
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
                Object two = is.readObject();
                Cetakan_KebersihanRK o = (Cetakan_KebersihanRK) one;
                Cetakan_KebersihanRK a = (Cetakan_KebersihanRK) two;
                System.out.println("ini adalah input string " + o.getInput());
                System.out.println("ini adalah input int " + o.getInput1());
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


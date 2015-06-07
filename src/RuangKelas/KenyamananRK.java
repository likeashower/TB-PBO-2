

package RuangKelas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class KenyamananRK extends AnalisaRuangKelas implements AnalisaRuangKelas1{
    
   
   Cetakan_KenyamananRK obj = new Cetakan_KenyamananRK();
   Cetakan_KenyamananRK[] arr = new Cetakan_KenyamananRK[5];
   
  void InputKenyamanan(){
      
      for (int i = 0; i < arr.length; i++){
            arr[i] = new Cetakan_KenyamananRK();
        }
      
     String kebisingan, bau, kebocoran, kerusakan, keausan;
     System.out.println("Apakah kelas anda bising? \n a. Ya \n b. Tidak");
     kebisingan = input.nextLine();
     arr[0].setInput(kebisingan);
     System.out.println("Apakah kelas anda bau? \n a. Ya \n b. Tidak");
     bau = input.nextLine();
     arr[1].setInput(bau);
     System.out.println("Apakah ada kebocoran di kelas anda? \n a. Ya \n b. Tidak");
     kebocoran = input.nextLine();
     arr[2].setInput(kebocoran);
     System.out.println("Apakah ada kerusakkan di kelas anda? \n a. Ya \n b. Tidak");
     kerusakan = input.nextLine();
     arr[3].setInput(kerusakan);
     System.out.println("Apakah kelas anda aus? \n a. Ya \n b. Tidak");
     keausan = input.nextLine();
     arr[4].setInput(keausan);
     
  }
  
  @Override
            public boolean analisis_string1() {
            if (arr[i].getInput().equals("b")) { 
            t++;
            return true;
            } else {
            return false;
            }
   
    } 
        
  void OutputKenyamanan() {

          for (i=0; i <5 ;i++) {
            analisis_string1();}
            //cm.setHitung(t);
 
      obj.setHitung(t);
      System.out.println("Persentase Kenyamanan : " + (obj.getHitung()/arr.length)*100 + "%");
      
  }
  void File(){
         
         String File = "Kebersihan.bin";
         
         try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(File));
            for (int n =0; n <=5 ;n++) {
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
                Object two = is.readObject();
                Cetakan_KenyamananRK o = (Cetakan_KenyamananRK) one;
                Cetakan_KenyamananRK a = (Cetakan_KenyamananRK) two;
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

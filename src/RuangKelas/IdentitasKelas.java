


package RuangKelas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IdentitasKelas extends AnalisaRuangKelas{
    Cetakan_IdentitasKelas IDkelas = new Cetakan_IdentitasKelas();
    
    void insertdata_IDKELAS (){
         
       System.out.println("Nama Ruangan : ");
       IDkelas.setNama(input.nextLine());
        System.out.println("Lokasi: ");
       IDkelas.setLokasi(input.nextLine());
        System.out.println("Fakultas/Jurusan : ");
       IDkelas.setProdi_fakultas(input.nextLine());
    }
      
    public void cetakdata_IDKELAS (){
        System.out.println("Nama Ruangan : "+IDkelas.getNama());
        System.out.println("Lokasi : "+IDkelas.getLokasi());
        System.out.println("Fakultas/Jurusan: "+IDkelas.getProdi_fakultas()+"\n");
    }
    
    void File(){
         
         String File = "Identitas.bin";
         
         try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(File));
            os.writeObject(IDkelas.getNama());
            os.writeObject(IDkelas.getLokasi());
            os.writeObject(IDkelas.getProdi_fakultas());
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
                Object three = is.readObject();
                Cetakan_IdentitasKelas o = (Cetakan_IdentitasKelas) one;
                Cetakan_IdentitasKelas b = (Cetakan_IdentitasKelas) two;
                Cetakan_IdentitasKelas a = (Cetakan_IdentitasKelas) three;
                System.out.println("Nama Ruang: " + o.getNama());
                System.out.println("Lokasi : " + b.getLokasi());
                System.out.println("Prodi / Fakultas : " + a.getProdi_fakultas());
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
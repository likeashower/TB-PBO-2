package RuangKelas;
/*UPDATES
Sunday, 2015/04/19 Created by Ulfie.K.
Sunday, 2015/04/19 Updated by Nabillah.A. (Method input & output)
*/
import java.util.Scanner;

public class IdentitasKelas extends SuperClass{
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
}
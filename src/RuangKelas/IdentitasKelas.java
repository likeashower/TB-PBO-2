

package RuangKelas;

import java.util.Scanner;

public class IdentitasKelas {
    Cetakan_IdentitasKelas IDkelas = new Cetakan_IdentitasKelas();
    
    public void insertdata_IDKELAS (){
        Scanner ID = new Scanner (System.in);
        
         System.out.println("Nama Lengkap : ");
       IDkelas.setNama(input.nextLine());
        System.out.println("Alamat : ");
       IDkelas.setLokasi(input.nextLine());
        System.out.println("Fakultas/Jurusan : ");
       IDkelas.setProdi_fakultas(input.nextLine());
    }
      
    public void cetakdata_IDKELAS (){
        System.out.println("**************************************");
        System.out.println("Judul : "+IDkelas.getNama());
        System.out.println("Penulis : "+IDkelas.getLokasi());
        System.out.println("Jumlah Halaman : "+IDkelas.getProdi_fakultas()+"\n");
        System.out.println("**************************************");
        
    }
}



package RuangKelas;

import java.io.Serializable;

public class Cetakan_IdentitasKelas implements Serializable{
 
    private String nama;
    private String lokasi;
    private String prodi_fakultas;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getProdi_fakultas() {
        return prodi_fakultas;
    }

    public void setProdi_fakultas(String prodi_fakultas) {
        this.prodi_fakultas = prodi_fakultas;
    }
    
    
}

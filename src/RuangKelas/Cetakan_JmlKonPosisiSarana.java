package RuangKelas;

public class Cetakan_JmlKonPosisiSarana {
    
private int jml_steker;
private int kondisi_steker;
private String posisi_steker1;
private String posisi_steker2;

private int jml_kabelLCD;
private String kondisi_kabelLCD;
private String posisi_kabelLCD;

private int jml_lampu;
private int kondisi_lampu;
private String posisi_lampu;

private int jml_KipasAngin;
private int kondisi_KipasAngin;
private String posisi_KipasAngin;

private int jml_AC;
private String kondisi_AC;
private String posisi_AC;

private int SSID;
private int bandwidth;

private int jml_CCTV;
private int kondisi_CCTV;
private String posisi_CCTV;

    public int getJml_steker() {
        return jml_steker;
    }

    public void setJml_steker(int jml_steker) {
        this.jml_steker = jml_steker;
    }

    public int getKondisi_steker() {
        return kondisi_steker;
    }

    public void setKondisi_steker(int kondisi_steker) {
        this.kondisi_steker = kondisi_steker;
    }

    public String getPosisi_steker1() {
        return posisi_steker1;
    }

    public void setPosisi_steker1(String posisi_steker) {
        this.posisi_steker1 = posisi_steker;
    }
    
    public String getPosisi_steker2() {
        return posisi_steker2;
    }

    public void setPosisi_steker2(String posisi_steker) {
        this.posisi_steker2 = posisi_steker;
    }

    public int getJml_kabelLCD() {
        return jml_kabelLCD;
    }

    public void setJml_kabelLCD(int jml_kabelLCD) {
        this.jml_kabelLCD = jml_kabelLCD;
    }

    public String getKondisi_kabelLCD() {
        return kondisi_kabelLCD;
    }

    public void setKondisi_kabelLCD(String kondisi_kabelLCD) {
        this.kondisi_kabelLCD = kondisi_kabelLCD;
    }

    public String getPosisi_kabelLCD() {
        return posisi_kabelLCD;
    }

    public void setPosisi_kabelLCD(String posisi_kabelLCD) {
        this.posisi_kabelLCD = posisi_kabelLCD;
    }

    public int getJml_lampu() {
        return jml_lampu;
    }

    public void setJml_lampu(int jml_lampu) {
        this.jml_lampu = jml_lampu;
    }

    public int getKondisi_lampu() {
        return kondisi_lampu;
    }

    public void setKondisi_lampu(int kondisi_lampu) {
        this.kondisi_lampu = kondisi_lampu;
    }

    public String getPosisi_lampu() {
        return posisi_lampu;
    }

    public void setPosisi_lampu(String posisi_lampu) {
        this.posisi_lampu = posisi_lampu;
    }

    public int getJml_KipasAngin() {
        return jml_KipasAngin;
    }

    public void setJml_KipasAngin(int jml_KipasAngin) {
        this.jml_KipasAngin = jml_KipasAngin;
    }

    public int getKondisi_KipasAngin() {
        return kondisi_KipasAngin;
    }

    public void setKondisi_KipasAngin(int kondisi_KipasAngin) {
        this.kondisi_KipasAngin = kondisi_KipasAngin;
    }

    public String getPosisi_KipasAngin() {
        return posisi_KipasAngin;
    }

    public void setPosisi_KipasAngin(String posisi_KipasAngin) {
        this.posisi_KipasAngin = posisi_KipasAngin;
    }

    public int getJml_AC() {
        return jml_AC;
    }

    public void setJml_AC(int jml_AC) {
        this.jml_AC = jml_AC;
    }

    public String getKondisi_AC() {
        return kondisi_AC;
    }

    public void setKondisi_AC(String kondisi_AC) {
        this.kondisi_AC = kondisi_AC;
    }

    public String getPosisi_AC() {
        return posisi_AC;
    }

    public void setPosisi_AC(String posisi_AC) {
        this.posisi_AC = posisi_AC;
    }

    public int getSSID() {
        return SSID;
    }

    public void setSSID(int SSID) {
        this.SSID = SSID;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public int getJml_CCTV() {
        return jml_CCTV;
    }

    public void setJml_CCTV(int jml_CCTV) {
        this.jml_CCTV = jml_CCTV;
    }

    public int getKondisi_CCTV() {
        return kondisi_CCTV;
    }

    public void setKondisi_CCTV(int kondisi_CCTV) {
        this.kondisi_CCTV = kondisi_CCTV;
    }

    public String getPosisi_CCTV() {
        return posisi_CCTV;
    }

    public void setPosisi_CCTV(String posisi_CCTV) {
        this.posisi_CCTV = posisi_CCTV;
    }
    
    //METHODS KESESUAIAN SARANA
    
    void analisis_kelistrikan(){
       boolean kesesuaian_steker = false;
       String kondisi, posisi;
        if ( getJml_steker() >= 4){
            kesesuaian_steker = true;
        } 
        
        if ( getKondisi_steker() == getJml_steker() ) {
            kondisi = "sesuai";
        } else {
            kondisi = "tidak sesuai";
        }
        
        if ( getPosisi_steker1().equals("y") && getPosisi_steker2().equals("y")){
            posisi = "sesuai";
        }else if ( getPosisi_steker1().equals("t") && getPosisi_steker2().equals("y")) {
            posisi = "kurang sesuai";
        }else if ( getPosisi_steker1().equals("y") && getPosisi_steker2().equals("t")) {
            posisi = "kurang sesuai";
        }else if ( getPosisi_steker1().equals("t") && getPosisi_steker2().equals("t")) {
            posisi = "tidak sesuai";
        }
    }
    
    void analisis_LCD(){
        boolean kesesuaian_LCD = false;
        String kondisi, posisi;
        if ( getJml_kabelLCD() >= 1 ) {
            kesesuaian_LCD = true;
        }
        
        if ( getKondisi_kabelLCD().equals("a")) {
            kondisi = "sesuai";
        }else if (getKondisi_kabelLCD().equals("b")) {
            kondisi = "tidak sesuai";
        }
        
        if ( getPosisi_kabelLCD().equals("y")) {
            posisi = "sesuai";
        } else if ( getPosisi_kabelLCD().equals("t") ){
            posisi = "tidak sesuai";
        }
        
    }

    
    void analisis_lampu() {
        
        boolean kesesuaian_lampu = false;
        String kondisi, posisi;
        if ( getJml_lampu() >= 18 ) {
            kesesuaian_lampu = true;
        }
        
        if ( getKondisi_lampu() == getJml_lampu() ) {
            kondisi = "sesuai";
        } else {
            kondisi = "tidak sesuai";
        }
        
        if ( getPosisi_lampu().equals("y")) {
            kondisi = "sesuai";
        }else {
            kondisi = "tidak sesuai";
        }
        
    }
    
    void analisis_kipasangin() {
        boolean kesesuaian_kipasangin = false;
        String kondisi, posisi;
        if ( getJml_KipasAngin() >= 2 ) {
            kesesuaian_kipasangin = true;
        }
        
        if ( getKondisi_KipasAngin() == getJml_KipasAngin() ) {
            kondisi = "sesuai";
        } else {
            kondisi = "tidak sesuai";
        }
        
        if ( getPosisi_KipasAngin().equals("y")) {
            posisi = "sesuai";
        } else {
            posisi = "tidak sesuai";
        }
    }
    
    void analisis_AC () {
        boolean kesesuaian_ac = false;
        String kondisi, posisi;
        if ( getJml_AC() >= 1 ) {
            kesesuaian_ac = true;
        }
        
        if ( getKondisi_AC().equals("a") ) {
            kondisi = "sesuai";
        }else{
            kondisi = "tidak sesuai";
        }
        
        if ( getPosisi_AC().equals("a")) {
            posisi = "sesuai";
        }else if ( getPosisi_AC().equals("b") ) {
            posisi = "tidak sesuai";
        }else if ( getPosisi_AC().equals("c")) {
            posisi = "sesuai";
        }
    }

    void analisis_internet() {
        boolean login = false;
        int bw;
        if ( getSSID() == 2 ) {
            login = true;
        }
        
        if ( login == true ) {
            bw = getBandwidth();    
        }else if ( login == false ) {
            bw = 0; 
        }
        
    }
    
    void analisis_cctv() {
        boolean kesesuaian_cctv = false;
        String kondisi, posisi;
        if ( getJml_CCTV() == 2 ) {
            kesesuaian_cctv = true;
        }
        
        if ( getKondisi_CCTV() == getJml_CCTV() ) {
            kondisi = "sesuai";
        } else {
            kondisi = "tidak sesuai";
        }
        
        if ( getPosisi_CCTV().equals("a") ){
            kondisi = "sesuai";
        } else if ( getPosisi_CCTV().equals("b") ) {
            kondisi = "tidak sesuai";
        }
    }
   }
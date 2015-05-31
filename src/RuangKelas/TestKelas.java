package RuangKelas;

/**
 *
 * @author acer
 */
public class TestKelas {
    
    public static void main (String[] args) {
        
    IdentitasKelas id = new IdentitasKelas();
    JmlKonPosisiSarana jkps = new JmlKonPosisiSarana();
    KebersihanRK brs = new KebersihanRK();
    KeamananRK aman = new KeamananRK();
    KenyamananRK nym = new KenyamananRK();
    KondisiKelas kd = new KondisiKelas();
    LingRuangKelas ling = new LingRuangKelas();
    Cetakan_KenyamananRK obj = new Cetakan_KenyamananRK();
        
        //INPUT
//        id.insertdata_IDKELAS();
//        kd.InputKondisiKelas();
//        jkps.InputJKPSarana();
//        ling.InputLingRuangKelas();
//        brs.InputKebersihanRK();
//        nym.InputKenyamanan();
        aman.InputKeamananRK();
        
        //OUTPUT
//        id.cetakdata_IDKELAS();
//        kd.OutputKondisiKelas();
//        jkps.OutputJKPSarana();
//        ling.OutputLingRuangKelas();
//        brs.OutputKebersihanRK();
//        nym.OutputKenyamanan();
        aman.OutputKeamananRK();
       
        //FILE
        aman.File();
    }
}



package RuangKelas;

public class LingRuangKelas extends AnalisaRuangKelas implements AnalisaRuangKelas1{
    
    
    Cetakan_LingRuangKelas obj = new Cetakan_LingRuangKelas();
    Cetakan_LingRuangKelas[] arr = new Cetakan_LingRuangKelas[5];
    
    void InputLingRuangKelas(){
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Cetakan_LingRuangKelas();
        }
        
        //String input;
        String kondisi_lantai, kondisi_atap, kondisi_pintu, kondisi_jendela, kondisi_dinding;
        
        System.out.println("Kondisi Lantai : \n a. Bersih \n b. Kotor");
        kondisi_lantai = input.nextLine();
        arr[0].setInput(kondisi_lantai);
        System.out.println("Kondisi Atap : \n a. Bersih \n b. Kotor");
        kondisi_atap = input.nextLine();
        arr[1].setInput(kondisi_atap);
        System.out.println("Kondisi Pintu : \n a. Bersih \n b. Kotor");
        kondisi_pintu = input.nextLine();
        arr[2].setInput(kondisi_pintu);
        System.out.println("Kondisi Jendela : \n a. Bersih \n b. Kotor");
        kondisi_jendela = input.nextLine();
        arr[3].setInput(kondisi_jendela);
        System.out.println("Kondisi Dinding : \n a. Bersih \n b. Kotor");
        kondisi_dinding = input.nextLine();
        arr[4].setInput(kondisi_dinding);
       
                     
    }
      @Override
            public boolean analisis_string1() {
            if (arr[i].getInput().equals("a")) { 
            t++;
            return true;
            } else {
            return false;
            }
   
    } 
    void OutputLingRuangKelas(){
        
        for (i=0; i <arr.length ;i++) {
            analisis_string1();}
        
        obj.setHitung(t);
        System.out.println("Persentase Kebersihan Lingkungan Ruang Kelas: " + (obj.getHitung()/arr.length)*100 + "%");
    }
}

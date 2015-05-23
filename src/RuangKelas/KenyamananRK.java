

package RuangKelas;
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
}

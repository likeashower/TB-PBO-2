
package RuangKelas;

public class JmlKonPosisiSarana extends SuperClass{
    
    Cetakan_JmlKonPosisiSarana[] wa = new Cetakan_JmlKonPosisiSarana[19];
    Cetakan_JmlKonPosisiSarana jkp = new Cetakan_JmlKonPosisiSarana();
    
    
    
    void InputJKPSarana (){
        int jml_sk,jml_skBaik, jml_kLCD, jml_lampu;
        int jml_lampuBaik,jml_kipasangin, jml_kipasBaik,jml_kpBaik,jml_AC;
        int bandwidth,jml_cctv,jml_cctvBaik;
        String posisi_sk, posisi_lcd, posisi_lampu, posisi_kipas, ssid, posisi_ac, posisi_cctv, kondisi_lcd, kondisi_AC;
        
        
         int arr = 0;
        while (arr < wa.length) {
            wa[arr] = new Cetakan_JmlKonPosisiSarana();
            arr++;
        }
        
            
     //Stop Kontak
    System.out.println("Jumlah stop kontak: ");
    jml_sk = input.nextInt();  
    wa[0].setInput1(jml_sk);
    System.out.println("Jumlah stop kontak yang berkondisi baik: ");
    jml_skBaik = input.nextInt(); 
    wa[1].setInput1(jml_skBaik);
    System.out.println("Apakah posisi stop kontak di dekat meja dosen & pojok ruangan? \n a. Ya \n b. Tidak");
    posisi_sk = input.next(); 
    wa[0].setInput(posisi_sk);
    
        
    
    //Kabel LCD
    System.out.println("Jumlah kabel LCD: ");
    jml_kLCD = input.nextInt();  
    wa[2].setInput1(jml_kLCD);
    System.out.println("Kondisi kabel LCD: \n a. Baik \n b. Rusak ");
    kondisi_lcd= input.next();  
    wa[3].setInput(kondisi_lcd);
    System.out.println("Dekat dosen? \n a. Ya \n b. Tidak");
    posisi_lcd = input.next();  
    wa[4].setInput(posisi_lcd);
    
    
    //Lampu
    System.out.println("Jumlah lampu: ");
    jml_lampu = input.nextInt();  
    wa[5].setInput1(jml_lampu);
    System.out.println("Jumlah lampu berkondisi baik: ");
    jml_lampuBaik = input.nextInt();  
    wa[6].setInput1(jml_lampuBaik);
    System.out.println("Posisi lampu: \n a. Di atap ruangan \n b. Lainnya");
    posisi_lampu = input.next();  
    wa[7].setInput(posisi_lampu);
    
    

    //Kipas Angin
    System.out.println("Jumlah kipas angin: ");
    jml_kipasangin = input.nextInt();
    wa[8].setInput1(jml_kipasangin);
    System.out.println("Jumlah kipas angin berkondisi baik: ");
    jml_kipasBaik = input.nextInt();
    wa[9].setInput1(jml_kipasBaik);
    System.out.println("Posisi kipas: Di Atap ruangan? \n a. Ya \n b. Tidak");
    posisi_kipas = input.next();
    wa[10].setInput(posisi_kipas);
    
    
    //AC
    System.out.println("Jumlah AC: ");
    jml_AC = input.nextInt();
    wa[11].setInput1(jml_AC);
    System.out.println("Kondisi AC: \n a. Baik \n b. Rusak ");
    kondisi_AC = input.next();
    wa[12].setInput(kondisi_AC);
    System.out.println("Posisi AC: \n a. Belakang/Depan \n b. Samping");
    posisi_ac = input.next();
    wa[13].setInput(posisi_ac);
    
    
    //SSID
    System.out.println("Pilih SSID: \n a. UMMPremium \n b. UMMHotSpot \n c. 201410370311029 \n d. Other Networks ");
    ssid = input.next();
    wa[14].setInput(ssid);
    System.out.println("Masukkan Bandwidth (mbps): ");
    bandwidth = input.nextInt();
    wa[15].setInput1(bandwidth);
    
    
    
    //CCTV
    System.out.println("Jumlah CCTV: ");
    jml_cctv = input.nextInt();
    wa[16].setInput1(jml_cctv);
    System.out.println("Jumlah CCTV berkondisi baik: ");
    jml_cctvBaik = input.nextInt();
    wa[17].setInput1(jml_cctvBaik);
    System.out.println("Posisi CCTV: a. Depan & Belakang \n b. Samping");
    posisi_cctv = input.next();
    wa[18].setInput(posisi_cctv);
    
    }
    
        
        
        
            //Stop Kontak
            
       @Override
       boolean analisis_int1(){
         if (wa[0].getInput1() >=4 ) {
                
                t++;
                return true;
            } else {
               return false;
            }
        }
         
         @Override
         boolean analisis_int2(){
         if (wa[1].getInput1() == wa[0].getInput1() ) {
         t++;
         return true;
         } else {
          return false;
            }
         }
        
         @Override
         boolean analisis_string1(){
             if (wa[0].getInput().equals("a") ) {
                t++;
                return true;
            } else {
                return false;
            }
         }
         
         
          
    
          //kabel LCD
         
         @Override
         boolean analisis_int3(){
              if (wa[2].getInput1()>=1 ) {
                t++;
                return true;
            } else {
                return false;
            }
         }
           
         @Override
         boolean analisis_int4(){
             if (wa[3].getInput().equals("a") ) {
                t++;
                return true;
            } else {
                return false;
            }
         }
            
             
           @Override
           boolean analisis_string2(){
           if (wa[4].getInput().equals("a") ) {
             t++;
             return true;
            } else {
             return false;
            }
          }
            
             
             
             //lampu
           //Overload
           boolean analisis_int1(int b){
               b = wa[5].getInput1();
                if ( b >=18 ) {
                t++;
                return true;
            } else {
               return false;
            }
           }
             
              //Overload
              boolean analisis_int2(int b){
              b = wa[6].getInput1();
              if ( b == wa[5].getInput1() ) { 
              t++;
              return true;
            } else {
              return false;
            }
              }
              
              @Override
              boolean analisis_string3(){
             if (wa[7].getInput().equals("a") ) {
              t++;
             return true;
            } else {
             return false;
            }
              }
               
          
            
            //kipas angin
              
              //Overload
              boolean analisis_int3(int b){
                  b = wa[8].getInput1();
              if ( b >=2 ) {
               t++;
               return true;
            } else {
                return false;
                
            }
                  
              }
           
              //Overload
              boolean analisis_int4(int b){
                  b = wa[9].getInput1();
                if (b== wa[8].getInput1() ) {
                t++;
                return true;
            } else {
                return false;
            }  
              }
               
             @Override
             boolean analisis_string4(){
             if (wa[10].getInput().equals("a") ) {
             t++;
             return true;
            } else {
             return false;
            }
               }
            
            
            //AC
             //Overload
             boolean analisis_int1(double a){
                 a = wa[11].getInput1();
                 if (a >= 1) {
                     t++;
                     return true;
                 } else {
                     return false;
                 }
             }
            
              
            //Overload
             boolean analisis_string1(String b){
            b = wa[12].getInput();
            if (b.equals("a") ) {
            t++;
            return true;
            } else {
            return false;
            }
             }
              

           //Overload
        boolean analisis_string2(String b) {
        b = wa[13].getInput();
        if (b.equals("a") ) {
            t++;
            return true;
            } else {
            return false;
            }
             }
             
             //SSID
           //Overload
           boolean analisis_string3(String b){
               b = wa[14].getInput();
              if (b.equals("b") ) {
                t++;
                return true;
            } else {
                return false;
            }
           }
              
              //Overload
              boolean analisis_int2(double a){
               a = wa[15].getInput1();
                if (a >= 1 ) {
                t++;
                return true;
            } else {
                return false;
            }
           }
              
             
              
              //CCTV
              //Overload
              boolean analisis_int3(double a){
                  a = wa[16].getInput1();
                if ( a == 2 ) {
                t++;
                return true;
            } else {
                return false;
            }
              }
            
              //Overload
              boolean analisis_int4(double a){
                  a = wa[16].getInput1();
              if ( a ==2 ) {
              t++;
              return true;
            } else {
               return false;
            }
              }
              
              //Overload
              boolean analisis_string4(String b){
                  b = wa[18].getInput();
              if (b.equals("a") ) {
              t++;
              return true;
            } else {
             return false;
            }
            
              }
              
               
            void OutputJKPSarana(){
               analisis_int1();
               analisis_int2();
               analisis_string1();
               analisis_int3();
               analisis_int4();
               analisis_string2();
               analisis_int1(wa[5].getInput1());
               analisis_int2(wa[6].getInput1());
               analisis_string3();
               analisis_int3(wa[8].getInput1());
               analisis_int4(wa[9].getInput1());
               analisis_string3();
               analisis_int1(wa[11].getInput1());
               analisis_string1(wa[12].getInput());
               analisis_string2(wa[13].getInput());
               analisis_string3(wa[14].getInput());
               analisis_int2(wa[15].getInput1());
               analisis_int3(wa[16].getInput1());
               analisis_string4(wa[18].getInput());
             
               jkp.setHitung(t);
               System.out.println("Persentase Kesesuaian Sarana : " + (jkp.getHitung()/wa.length)*100 + "%");
              if (wa[14].getInput().equals("b") ) {
                   System.out.println("Login wi-fi berhasil!");
                   System.out.println("Bandwidth : " + wa[15].getInput1() + "mbps");
            } else {
                   System.out.println("Login wi-fi tidak berhasil.");
            }
              
    }
       
                
}

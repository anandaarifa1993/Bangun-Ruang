
package Inheritance;


public class Kubus extends BangunRuang {   
  float sisi;
   @Override
    float luas(){
        float luas = 6 * sisi * sisi;
        System.out.println("Luas kubus: " + luas + "cm");
        return luas;
    }

    @Override
    float volume(){
        float volume = 3 * sisi;
        System.out.println("volume kubus : " + volume + "cm3");
        return volume;
    }
        
    
    
}

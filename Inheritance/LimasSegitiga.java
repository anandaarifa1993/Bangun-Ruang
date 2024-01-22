
package Inheritance;

/**
 *
 * @author User
 */
public class LimasSegitiga extends BangunRuang {
    float t;
    float T;
    float a;
    
     
    
    @Override
    float volume(){
        float volume = (float) (1.0/3.0 * 0.5 * a * t * T );
        System.out.println("volume Limas Segitiga : " + volume + "cm3");
        return volume;
    }
    
}

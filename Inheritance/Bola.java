/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author User
 */
public class Bola extends BangunRuang{
    float r;
   
    
    @Override
    float luas(){
        float luas = (float) (4 * Math.PI * r * r) ;
        System.out.println("Luas bola :" + luas + "cm");
        return luas;
    }
    
    @Override
    float volume(){
        float volume = (float) (4/3 * Math.PI * r * r * r);
        System.out.println("volume bola : " + volume + "cm3");
        return volume;
    }
}

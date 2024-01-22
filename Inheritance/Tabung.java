/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author User
 */
public class Tabung extends BangunRuang{
     float r;
    float t;

    @Override
    float luas() {
        float luas = (float) (2 * Math.PI * r * (r+t));
        System.out.println("Luas tabung : " + luas + "cm");
        return luas;
    }   
     @Override
    float volume(){
        float volume = (float) ( Math.PI * r * r * t);
        System.out.println("volume tabung : " + volume + "cm3");
        return volume;
    }
}

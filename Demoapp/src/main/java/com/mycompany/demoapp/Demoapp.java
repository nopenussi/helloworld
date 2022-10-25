/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demoapp;

/**
 *
 * @author DELL
 */
public class Demoapp {

    
    public static void main(String [] args){
        int jmlh_looping = 5;
        int bi11 = 5;
        int bi12 = 2;
        
        DemoObjectOriented demo = new DemoObjectOriented();
        demo.helloWorld(jmlh_looping);
        System.out.println("-Pemanggilan Fungsi Tambah");
        System.out.println("Hasil  Operasi Tambah : " + demo.tambah(bi11, bi12));;
        
    }
    
}
    
  
}

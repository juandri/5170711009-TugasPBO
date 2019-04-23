/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juandri;

import java.util.Scanner;

/**
 *
 * @author MIKO
 */
public class Wanita extends manusia {

    Scanner scan = new Scanner(System.in);
    int b;

    @Override

    void sifat() {
        System.out.println("\n\nsifat wanita berdasarkan zodiak");
        System.out.println(" 1. aries ");
        System.out.println(" 2. taurus");
        System.out.print("\nmasukan pilihan sifat wanita :");
        b = scan.nextInt();
        System.out.println("______________________________");
        if (b == 1) {
            System.out.println("+ aries +");
            System.out.println("Sfiat-sifat Aries menunjukkan mereka adalah sosok yang energik dan bersemangat.Dia membutuhkan kemandiriannya jika dia ingin bahagia\n" +
"Seorang wanita Aries bukanlah orang yang terikat dan suka mengendalikan segala sesuatu di sekelilingnya.\n" +
"Dia sangat setia ketika datang ke teman dan keluarga, tetapi mungkin bisa saja mereka tidak siap untuk menikah.");
            
        } else if (b == 2) {
            System.out.println("taurus");
            System.out.println("Wanita Taurus adalah sosok yang mandiri dan kuat secara emosional.\n" +
"Dia ingin menjalani hidupnya dengan caranya sendiri.\n" +
"Sifat kepribadian wanita Taurus menunjukkan dia panda menjaga emosinya di sebagian besar waktu.\n" +
"Dan dia cenderung kreatif dan artistik.");
        }
    }
}

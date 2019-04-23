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
public class Laki extends manusia {

    Scanner scan = new Scanner(System.in);
    int a;

    @Override

    void sifat() {
        System.out.println("sifat pria berdasarkan zodiak");
        System.out.println(" 1. aries ");
        System.out.println(" 2. taurus");
        System.out.print("\nmasukan pilihan sifat pria :");
        a = scan.nextInt();
        System.out.println("______________________________");
        if (a == 1) {
            System.out.println("+ aries +");
            System.out.println("Pria Aries suka sekali menantang dirinya dalam segala hal, sayangnya mereka juga memiliki temperamen yang rendah dan cepat sekali marah.\n"
                    + "Pria Aries juga senang melakukan segala hal dengan caranya sendiri, karena itu dia bisa jadi akan merasa gusar jika Anda membuatnya menunggu terlalu lama untuk berdandan. "
                    + "\nMeskipun cepat marah, pria Aries juga bisa segera ditenangkan jika Anda segera melakukan apa yang dia inginkan.");
        } else if (a == 2) {
            System.out.println("taurus");
            System.out.println("Pria Taurus adalah orang yang memiliki kehidupan stabil, segala sesuatunya mudah diprediksi. Karena pria Taurus cenderung melakukan hal yang "
                    + "\nsama berulangkali, seperti makan di restoran yang sama, dan pergi ke bioskop yang sama.\n" +
"Karena sifatnya yang mudah diprediksi, hidup bersama pria Taurus bisa menjadi hal yang menentramkan. Akan tetapi, pria Taurus juga memiliki kelemahan. \nMereka sangat keras kepala, sehingga Anda perlu lebih "
                    + "banyak berkompromi dengan dirinya dibandingkan dia yang berkompromi dengan Anda.");
        }
    }
}

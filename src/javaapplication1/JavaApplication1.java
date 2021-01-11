/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        byte skaiciai nuo -128 iki 127;
//        short skaiciai nuo -32768 iki 32767;
//        int normalus skaicius nuo -2147483648 iki 2147483647;
//        long ilgas skaicius -9223372036854775808 iki 9223372036854775807;
//        float trumpena;
//        double didele;
//        boolean;
//        char simbolis;
//char c = '\u54ab';

//Scanner sc = new Scanner(System.in);
//        System.out.println("Ivesk 1 skaiciu:");    
//        int pirmas = sc.nextInt();
//        System.out.println("Ivesk 2 skaiciu:");
//        int antras = sc.nextInt();
//        int suma = pirmas + antras;
//        
//        System.out.println("suma: " + suma);
//        Scanner sc = new Scanner(System.in);
//
//        int sk = sc.nextInt();
//
//        if (sk > 0) {
//            System.out.println("teigiamas");
//        } else {
//            System.out.println("neigiamas");
//        }
//        System.out.println("pabaiga");
//    Scanner sc = new Scanner(System.in);
//    
//        System.out.println("nuo");
//        int nuo = sc.nextInt();
//        System.out.println("iki");
//        int iki = sc.nextInt();
//        
//        while (nuo <= iki) {
//            System.out.println(nuo);
//            nuo += 1;
//        }
//        System.out.println("pabaiga");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nuo");
//        int nuo = sc.nextInt();
//        System.out.println("iki");
//        int iki = sc.nextInt();
//        int init = nuo;
//        int mult = 1;
//        
//        while (mult <= 9 && nuo <= iki) {
//            System.out.print(nuo*mult + " ");
//            mult += 1;
//        }
//        nuo += 1;
//        mult = 1;
//        System.out.println();
//        while (mult <= 9 && nuo <= iki) {
//            System.out.print(nuo*mult + " ");
//            mult += 1;
//        }
//        nuo += 1;
//        mult = 1;
//        System.out.println();
//        while (mult <= 9 && nuo <= iki) {
//            System.out.print(nuo*mult + " ");
//            mult += 1;
//        }
//        nuo += 1;
//        mult = 1;
//        System.out.println();
//        while (mult <= 9 && nuo <= iki) {
//            System.out.print(nuo*mult + " ");
//            mult += 1;
//        }
//        nuo += 1;
//        mult = 1;
//        System.out.println();
//        while (mult <= 9 && nuo <= iki) {
//            System.out.print(nuo*mult + " ");
//            mult += 1;
//        }
//        nuo += 1;
//        mult = 1;
//        System.out.println();
//        while (mult <= 9 && nuo <= iki) {
//            System.out.print(nuo*mult + " ");
//            mult += 1;
//        }
//        nuo += 1;
//        mult = 1;
//        System.out.println();
//        while (mult <= 9 && nuo <= iki) {
//            System.out.print(nuo*mult + " ");
//            mult += 1;
//        }
//        nuo += 1;
//        mult = 1;
//        System.out.println();
//        while (mult <= 9 && nuo <= iki) {
//            System.out.print(nuo*mult + " ");
//            mult += 1;
//        }
//        nuo += 1;
//        mult = 1;
//        System.out.println();
//        while (mult <= 9 && nuo <= iki) {
//            System.out.print(nuo*mult + " ");
//            mult += 1;
//        }
////        
//        System.out.println();        
//        System.out.println("pabaiga");
//        int j = 0;
//        int i;
//        for (i = 15; i <=37; i++) {
//            j += i;
//        }
//        System.out.println(j);
        String[] galimybes = {"Akmuo", "Zirkles", "Popierius", "Pabaiga"};
        int i;
        int j = 1;
        int zm_akmuo_kartai = 0;
        int komp_akmuo_kartai = 0;
        int zm_zirkles_kartai = 0;
        int komp_zirkles_kartai = 0;
        int zm_popierius_kartai = 0;
        int komp_popierius_kartai = 0;
        int laimejoZmogus = 0;
        int laimejoKompiuteris = 0;
        int lygiosios = 0;
        int zmogaus_pasirinkimas = 0;

        while (zmogaus_pasirinkimas < 4) {
            j = 1;
        for (i = 0; i < galimybes.length; i++) {
            System.out.println(j++ + ". " + galimybes[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Jusu pasirinkimas:");
        zmogaus_pasirinkimas = sc.nextInt();
        if (zmogaus_pasirinkimas == 1) {
            zm_akmuo_kartai++;
        }
        if (zmogaus_pasirinkimas == 2) {
            zm_zirkles_kartai++;
        }
        if (zmogaus_pasirinkimas == 3) {
            zm_popierius_kartai++;
        }
        System.out.println(galimybes[zmogaus_pasirinkimas - 1]);
        System.out.println("Kompiuterio pasirinkimas: ");
        int kompiuterio_pasirinkimas = (int) (Math.random() * 3);
        if (kompiuterio_pasirinkimas == 0) {
            komp_akmuo_kartai++;
        }
        if (kompiuterio_pasirinkimas == 1) {
            komp_zirkles_kartai++;
        }
        if (kompiuterio_pasirinkimas == 2) {
            komp_popierius_kartai++;
        }
        System.out.println(galimybes[kompiuterio_pasirinkimas]);

        if (zmogaus_pasirinkimas > 0 && zmogaus_pasirinkimas == kompiuterio_pasirinkimas + 1) {
            System.out.println("Lygiosios");
            lygiosios++;
        };
        if (zmogaus_pasirinkimas == 1 && kompiuterio_pasirinkimas == 1) {
            System.out.println("Laimejo zmogus.");
            laimejoZmogus++;
        }
        if (zmogaus_pasirinkimas == 2 && kompiuterio_pasirinkimas == 0) {
            System.out.println("Laimejo kompiuteris.");
            laimejoKompiuteris++;
        }
        if (zmogaus_pasirinkimas == 3 && kompiuterio_pasirinkimas == 0) {
            System.out.println("Laimejo zmogus.");
            laimejoZmogus++;
        }
        if (zmogaus_pasirinkimas == 3 && kompiuterio_pasirinkimas == 1) {
            System.out.println("Laimejo kompiuteris.");
            laimejoKompiuteris++;
        }
        if (zmogaus_pasirinkimas == 1 && kompiuterio_pasirinkimas == 2) {
            System.out.println("Laimejo kompiuteris.");
            laimejoKompiuteris++;
        }
        if (zmogaus_pasirinkimas == 2 && kompiuterio_pasirinkimas == 2) {
            System.out.println("Laimejo zmogus.");
            laimejoZmogus++;
        }
        }
        if (zmogaus_pasirinkimas == 4) {
            System.out.println("Zmogus akmenys: " + zm_akmuo_kartai);
            System.out.println("Zmogus popierius: " + zm_popierius_kartai);
            System.out.println("Zmogus zirkles: " + zm_zirkles_kartai);
            System.out.println("Kompiuteris akmenys: " + komp_akmuo_kartai);
            System.out.println("Kompiuteris zirkles: " + komp_zirkles_kartai);
            System.out.println("Kompiuteris popierius: " + komp_popierius_kartai);
            System.out.println("Laimejo kompiuteris: " + laimejoKompiuteris);
            System.out.println("Laimejo zmogus: " + laimejoZmogus);
            System.out.println("Partiju skaicius: " + (laimejoZmogus + laimejoKompiuteris + lygiosios));
        }

    }
}

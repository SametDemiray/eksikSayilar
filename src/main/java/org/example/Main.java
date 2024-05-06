package org.example;
/*
Bir eksik sayı, tüm basamaklarının 0 veya 1 olması şartıyla oluşturulmuş bir tamsayıdır. Örneğin, 10, 11, 100, 101, 110, 111 gibi
sayılar eksik sayılara örnektir. Bu sayılar sadece 0 ve 1 rakamlarını içerir.Örneğin, 101 bir eksik sayıdır çünkü tüm basamakları
0 veya 1'dir. Ancak, 102 bir eksik sayı değildir çünkü 2 rakamını içerir.
Bu kavram genellikle bilgisayar biliminde veya sayısal hesaplamalarda kullanılır. Özellikle, bilgisayar mimarisinde veya
dijital elektronikte, 0 ve 1 bitlerinin temel olarak kullanılmasından dolayı eksik sayılar önemli bir rol oynar.


*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tamsayı girin: ");
        sayi = scanner.nextInt();

        if (eksikSayiKontrolu(sayi)) {
            System.out.println(sayi + " bir eksik sayıdır.");
        } else {
            System.out.println(sayi + " bir eksik sayı değildir.");
        }

        scanner.close();
    }

    // Eksik sayı kontrol fonksiyonu
    public static boolean eksikSayiKontrolu(int sayi) {
        // Sayının mutlak değerini al
        sayi = Math.abs(sayi);

        // Tamsayının rakamlarını kontrol et
        while (sayi > 0) {
            int sonBasamak = sayi % 10;
            sayi /= 10;
            if (sonBasamak != 0 && sonBasamak != 1) {
                return false; // 0 ve 1 dışındaki bir rakam bulundu, eksik sayı değil
            }
        }
        return true; // Tüm rakamlar 0 veya 1, eksik sayıdır
    }
}
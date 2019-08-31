package com.rizkykhapidsyah.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {
    public static void main(String[] args) {
        //Menampilkan Waktu Saat Ini:
        Calendar Kalender = Calendar.getInstance();
        System.out.println("Waktu Sekarang Adalah : " + Kalender.getTime());

        //Menampilkan Waktu 15 Hari Yang Lalu:
        Kalender.add(Calendar.DATE,-15);
        System.out.println("15 Hari Yang Lalu Adalah : " + Kalender.getTime());

        //Menampilkan Waktu 4 Bulan Yang Akan Datang:
        Kalender.add(Calendar.MONTH,4);
        System.out.println("Waktu 4 Bulan Yang Lalu Adalah : " + Kalender.getTime());

        //Menampilkan Waktu 2 Tahun Yang Akan Datang:
        Kalender.add(Calendar.YEAR,2);
        System.out.println("2 Tahun Kemudian : " + Kalender.getTime());
    }
}
/*
    Salah satu metode yang juga tersedia pada Calendar adalah add() yang memiliki 2 parameter yaitu calendar field dan
    banyaknya waktu yang ingin ditambahkan.  Seperti pada kode di atas untuk melihat waktu 15 hari yang lalu, kita bisa
    gunakan calendar.add(Calendar.DATE, -15) di mana -15 adalah 15 hari yang lalu dari waktu saat ini. Begitu juga untuk
    waktu bulan dan tahun.
 */


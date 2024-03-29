package com.rizkykhapidsyah.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSplitCalendar {
    public static void main(String[] args) {
        //Menampilkan Waktu Sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu Sekarang Adalah: " + calendar.getTime());

        //Menampilkan Waktu Spesifik Yang Diinginkan
        System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan   : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun   : " + calendar.get(Calendar.YEAR));
    }
}

/*
    Calendar memiliki kemampuan untuk menampilkan waktu/tanggal secara spesifik. Method get(Calendar.DATE) milik
    Calendar membutuhkan parameter untuk penggunaannya. Seluruh field dapat Anda cek di
    https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html.
 */

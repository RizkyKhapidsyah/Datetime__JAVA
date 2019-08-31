package com.rizkykhapidsyah.javafundamental.datetime;

/*
    SimpleDateFormat
    Dalam menampilkan suatu tanggal dan waktu, biasanya format tampilan di setiap kebutuhan akan berbeda-beda. Kalau
    hanya untuk sekedar menampilkan waktu dan tanggal , kita dapat menggunakan date atau calendar.

    Bagaimana bila menampilkan format yang tidak biasa? Atau Anda ingin parsing data dari sebuah String waktu dan
    tanggal dengan format yang tidak biasa? Di sini SimpleDateFormat memang berfokus pada memformat dan parsing data
    tanggal dan waktu serta normalisasi waktu.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateFormatted = sdf.format(new Date());

        //Tampilkan Ke Layar:
        System.out.println("Format Tanggal Default: " + new Date());
        System.out.println("Format Tanggal Dengan Format: " + dateFormatted);
    }
}
 /*
    Saat inisialisasi SimpleDateFormat, kita wajib mengisi parameter pattern. Pattern ini ("dd/M/yyyy") nantinya
    dijadikan acuan output dari waktu tanggal yang akan diparsing. Kita melakukan inisialisasi atas
    SimpleDateFormat new SimpleDateFormat("dd/M/yyyy"). Artinya output akan menampilkan
    (tanggal dalam 2 digit) / (Bulan 1 digit ) / (Tahun 4 digit).
  */
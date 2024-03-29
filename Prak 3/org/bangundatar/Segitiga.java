/*nama file : Segitiga.java*/
/*Penulis 	: Zahid Muhammad Mahfudz*/
/*NIM		: 24060121130043*/
/*Deskripsi	: representasi dasar dari objek segitiga, turunan kelas poligon*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public void printInfo() {
        System.out.println("Bangun segitiga dengan sisi sebanyak " + this.getJumlahSisi());
    }
}
/*nama file : Poligon.java*/
/*Penulis 	: Zahid Muhammad Mahfudz*/
/*NIM		: 24060121130043*/
/*Deskripsi	: driver class untuk poligon dan persegi panjang*/
package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(30, 50, 4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		
		Segitiga segitiga = new Segitiga(7, 9, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
	}
}
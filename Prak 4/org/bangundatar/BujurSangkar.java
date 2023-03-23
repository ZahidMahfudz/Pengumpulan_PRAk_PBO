/*Nama File : BujurSangkar.java*/
/*Penulis 	: Zahid Muhammad Mahfudz*/
/*NIM		: 24060121130043*/
/*Deskripsi	: representasi dasar dari objek bujur sangkar, turunan kelas poligon*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	protected double sisi;
	public BujurSangkar(double sisi, int jumlahSisi){
	this.sisi = sisi;
	this.jumlahSisi = jumlahSisi;
}

public double hitungLuas(){
	return sisi * sisi;
}

public double getPanjangSisi(){
	return 4 * sisi;
}

public void printInfo(){
	System.out.println("Bangun Bujur Sangkar bersisi "+this.getJumlahSisi());
}
}
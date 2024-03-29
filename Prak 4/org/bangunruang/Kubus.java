/*nama file : Kubus.java*/
/*Penulis 	: Zahid Muhammad Mahfudz*/
/*NIM		: 24060121130043*/
/*Deskripsi	: representasi dasar dari objek Kubus, turunan kelas BujurSangkar*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus extends BujurSangkar{
public Kubus(double sisi){
	super(sisi, 6);
}

public double hitungVolume(){
	return super.hitungLuas() * sisi;
}

public double hitungLuasAlas(){
	return 6 * super.hitungLuas();
}

public void printInfo(){
	System.out.println("Bangun Kubus dengan sisi "+sisi);
}
}
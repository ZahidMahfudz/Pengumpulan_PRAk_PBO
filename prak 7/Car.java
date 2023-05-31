/* 
*	File : Car.java 
*	Penulis : Zahid Muhammad Mahfudz - 24060121130043
*	Deskripsi mencari calRent pada Car
*/

package com.oracle.training;

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}


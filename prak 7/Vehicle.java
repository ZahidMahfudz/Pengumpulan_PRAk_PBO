/* 
*	File : Vehicle.java 
*	Penulis : Zahid Muhammad Mahfudz - 24060121130043
*	Deskripsi menghitung calRent dari Vehicle
*/

package com.oracle.training;

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}

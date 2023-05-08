/*Nama file : Lingkaran.java*/
/*Penulis 	: Zahid Muhammad Mahfudz*/
/*NIM*		: 24060121130043*/

 //mengambil konstanta yang ada di kelas java.lang.Math
 
 import static java.lang.Math.PI;
 
 class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
 }
 
 
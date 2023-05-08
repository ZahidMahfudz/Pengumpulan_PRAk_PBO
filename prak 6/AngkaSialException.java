/*Nama file : AngkaSialException.java*/
/*Penulis 	: Zahid Muhammad Mahfudz*/
/*NIM*		: 24060121130043*/
/*Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
 }
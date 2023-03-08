/*Nama 			 : Zahid Muhammad Mahfudz*/
/*NIM 			 : 24060121130043 */
/*deskripsi file : MTitik adalah class untuk menjalankan class Titik*/

import java.util.Scanner;
class MTitik{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Titik t1,t2,t3,t4;
		t1 = new Titik();
		t1.setAbsis(1);
		t1.setOrdinat(2);
		
		t2 = new Titik();
		t2.setAbsis(5);
		t2.setOrdinat(6);

		t3 = new Titik();
		
		t4 = new Titik();
		System.out.print("masukan nilai absis t4 : ");
		double absis = input.nextDouble();
		t4.setAbsis(absis);
		System.out.print("masukan nilai ordinat t4 : ");
		double ordinat = input.nextDouble();
		t4.setOrdinat(ordinat);



		System.out.println("Koordinat titik t1");
		System.out.println("t1 absis "+t1.getAbsis()+" t1 Ordinat "+t1.getOrdinat());
		/*System.out.println("Koordinat titik t2");
		System.out.println("t2 absis "+t2.getAbsis()+" t2 Ordinat "+t2.getOrdinat());
		System.out.println("Koordinat titik t3");
		System.out.println("t3 absis "+t3.getAbsis()+" t3 Ordinat "+t3.getOrdinat());
		System.out.println("Koordinat titik t4");
		System.out.println("t4 absis "+t4.getAbsis()+" t4 Ordinat "+t4.getOrdinat());*/

		System.out.println("titik setelah refleksi sb x : ");
		System.out.println("t4 absis "+t4.getAbsis()+" t4 Ordinat "+t4.getOrdinat());
		
	}
}
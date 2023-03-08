/*Nama 			 : Zahid Muhammad Mahfudz*/
/*NIM 			 : 24060121130043*/
/*Deskripsi file : Titik adalah class untuk menginisialisasi titik 
				   dan merefleksikan titik tersebtu dengan sumbu x maupun sumbu y*/

class Titik{
	double absis ;
	double ordinat;
	static int counterTitik;
	
	/*Konstruktor*/
	public Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	/*Method*/
	public void setAbsis(double a){
		absis = a;
	}
	
	public void setOrdinat(double o){
		ordinat = o;
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
	public int getcounterTitik(){
		return counterTitik;
	}
}
class OperasiTitik{
	public void refleksiSumbuX(Titik titik){
		double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);
	}
	public void refleksiSumbuY(Titik titik){
		double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
	}
}
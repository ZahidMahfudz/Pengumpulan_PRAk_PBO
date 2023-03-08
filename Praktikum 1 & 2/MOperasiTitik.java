/*Nama           : Zahid Muhammad Mahfudz */
/*NIM            : 24060121130043 */
/*Deskripsi file : MOperasiTitik adalah class untuk menjalankan class OperasiTitik*/

public class MOperasiTitik {
    public static void main (String[] args){
        Titik t = new Titik(4,4);
        OperasiTitik o = new OperasiTitik();
        System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
        o.refleksiSumbuX(t);
        System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
        o.refleksiSumbuY(t);
        System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
    }
}

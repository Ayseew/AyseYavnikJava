import java.sql.SQLOutput;
import java.util.Scanner;
public class Kdv {
    public static void main(String[] args){
        double tutar,kdvOran = 0.18 , kdvTutar, kdvliTutar;
        Scanner imp = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz:");
        tutar = imp.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        if (tutar <= 1000) kdvOran = 0.18;
        else kdvOran = 0.8;
        System.out.println("kdvsiz tutar:" + tutar);
        System.out.println("kdv oranı:" + kdvOran);
        System.out.println("kdv tutarı:" + kdvTutar);
        System.out.println("kdvli tutarı:" + kdvliTutar);

    }
}

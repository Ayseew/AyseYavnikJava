import java.util.Scanner;
public class Proje1 {
    public static void main(String[] args){

        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner imp=new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = imp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = imp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = imp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = imp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = imp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = imp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + muzik);
        double sonuc = toplam /6.0;
        System.out.print("Ortalaması:"+ sonuc);

        String  str = sonuc>=60 ? "Geçti" : "Kaldı";
        System.out.println("Sınıfı Geçme Durumu : " + str);
    }
}

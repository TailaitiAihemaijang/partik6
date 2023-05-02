import java.util.Scanner;

/**
 * ClassName: VucutKitleİndeksi
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/2/2023 10:13 AM
 * @Version 1.0
 */
// Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
// Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
public class VucutKitleİndeksi {
    public static void main(String[] args) {
        double b,k,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Meter Cinside Giriniz : ");
        b = input.nextDouble();
        System.out.print("Lütfen Kilunuzu Giriniz : ");
        k = input.nextDouble();
        i = k /(b * b);
        System.out.print("Vücut Kitle İndeksiniz: " + i);
    }

}

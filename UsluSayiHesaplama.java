import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        int n,k;
        int total = 1;

        Scanner imp = new Scanner(System.in);

        System.out.print("Tabanı giriniz : ");
        n = imp.nextInt();
        System.out.print("Üssü giriniz : ");
        k = imp.nextInt();

        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("Sonuç : " + total);
    }
}

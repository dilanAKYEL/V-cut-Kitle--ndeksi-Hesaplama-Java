import java.util.Scanner;
public class Main {
    public static void main (String[]args) {
double boy , kilo;
Scanner inp =  new Scanner (System.in);
System.out.println("Boyunuzu Metre Cinsinden Giriniz:");
boy= inp.nextDouble();
System.out.println("Kilonuzu Giriniz:");
kilo=inp.nextDouble();
double bki= kilo/ (boy*boy);
System.out.println("Vücut Kitle İndeksiniz:" + bki);

    }
}

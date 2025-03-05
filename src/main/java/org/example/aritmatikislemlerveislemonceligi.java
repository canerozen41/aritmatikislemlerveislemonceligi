import java.util.Scanner;

public class aritmatikislemlerveislemonceligi {
    public static void main (String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen a sayısnı girin");
        int a = scanner.nextInt();

        System.out.println("Lütfen b sayısını girin");
        int b = scanner.nextInt();

        System.out.println("Lütfen c sayısını girin");
        int c = scanner.nextInt();

        int sonuc = a + b * c - b;

        System.out.println("İslemin sonucu " + sonuc);

        scanner. close();
    }
}
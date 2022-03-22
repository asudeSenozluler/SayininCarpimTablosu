import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı girin: ");
        sayi = scanner.nextInt();
        if (sayi > 9) {
            System.out.println("Hatalı sayı girdiniz!");
        } else {
            for (int i = 0; i <= 9; i++) {
                System.out.println(sayi + "*" + i + "=" + i * sayi);

            }
            // write your code here
        }
    }
}

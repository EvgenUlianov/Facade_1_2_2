import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача Двоичный фасад");
        BinOps bins = new BinOps();
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the first binary number");
        String a = scanner.nextLine();
        System.out.println("type the second binary number");
        String b = scanner.nextLine();


        System.out.println(bins.sum(a, b));
    }
}

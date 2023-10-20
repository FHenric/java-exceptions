import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");

        String teste = sc.nextLine();
        System.out.println(teste);

        sc.close();
    }
}
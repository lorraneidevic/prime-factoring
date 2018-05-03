import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrimeFactoring primeFactoring = new PrimeFactoring();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type the number you want to generate its prime factors:");
        int number = scanner.nextInt();

        primeFactoring.printFactors(number);
    }
}

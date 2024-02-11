import java.util.Scanner;

// The Scanner is mostly used to receive user input and parse them into primitive data types such as int, double or default String.

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void Ruppe_to_other(double amt) {
        System.out.println("1 Ruppe = " +0.013 + " Dollar");
        System.out.println();

        System.out.println(amt+" Ruppe = "+(amt*0.013)+" Dollar");
        System.out.println();

        System.out.println("1 Ruppe = " +0.011 + " Euro");
        System.out.println();

        System.out.println(amt+" Ruppe = "+(amt*0.011)+" Euro");
        System.out.println();



        }

    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " +74.39 + " Ruppe");
        System.out.println();

        System.out.println(amt+" Dollar = "+(amt*74.39)+" Ruppe");
        System.out.println();

        System.out.println("1 Dollar = " +0.85 + " Euro");
        System.out.println();

        System.out.println(amt+" Dollar = "+(amt*0.85)+" Euro");
        System.out.println();

            }

        public static void Euro_to_other(double amt) {
        System.out.println("1 Euro = " +88.97 + " Ruppe");
        System.out.println();

        System.out.println(amt+" Euro = "+(amt*88.97)+" Ruppe");
        System.out.println();

        System.out.println("1 Euro = " +1.18 + " Dollar");
        System.out.println();

        System.out.println(amt+" Euro = "+(amt*1.18)+" Dollar");
        System.out.println();

        }
    }


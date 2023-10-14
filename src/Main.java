import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Dzień dobry, w czym mogę pomóc ?");
        System.out.println("1 - wpłata");
        System.out.println("2 - wypłata");
        System.out.println("3 - saldo");

        Scanner scanner = new Scanner(System.in);


        int zmienna = scanner.nextInt();
        switch (zmienna) {
            case 1:
                System.out.println("ile chcesz wpłacić ?");
                int kwota = scanner.nextInt();

            System.out.println("Twoje konto zostało zasilone kwotą " + kwota);
            PrintWriter plik = new PrintWriter("D://bank.txt");
            plik.println(kwota);
            plik.close();

            break;

            case 2:
                System.out.println("ile chcesz wypłacić ?");
                System.out.println("Z Twojego konta została pobrana kwota " + scanner.nextInt());

                break;

            case 3:

                File file = new File("D://bank.txt");
                Scanner in = new Scanner(file);
                String saldo = in.nextLine();
                System.out.println("Twoje saldo to: "+ saldo);

                break;

            default:
                System.out.println("Niprawidłowa komenda");
                break;

        }



    }
}

import java.util.Scanner;

public class so_ngay_trong_thang {
    public static void main(String[] args) {
        System.out.println("Which month that you want to count days? ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.print("The month '1' has 31 days!");
                break;
            case 2:
                System.out.print("The month '2' has 28 or 29 days!");
                break;
            case 3:
                System.out.print("The month '3' has 31 days!");
                break;
            case 4:
                System.out.print("The month '4' has 30 days!");
                break;
            case 5:
                System.out.print("The month '5' has 31 days!");
                break;
            case 6:
                System.out.print("The month '6' has 30 days!");
                break;
            case 7:
                System.out.print("The month '7' has 31 days!");
                break;
            case 8:
                System.out.print("The month '8' has 31 days!");
                break;
            case 9:
                System.out.print("The month '9' has 30 days!");
                break;
            case 10:
                System.out.print("The month '10' has 31 days!");
                break;
            case 11:
                System.out.print("The month '11' has 30 days!");
                break;
            case 12:
                System.out.print("The month '12' has 31 days!");
                break;
        }
    }
}

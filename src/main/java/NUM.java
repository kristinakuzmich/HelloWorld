import java.util.Scanner;
public class NUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n1,n2,n3.");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        if (n1 % 2 != 0)
            System.out.println(1);
        else if (n2 % 2 != 0)
            System.out.println(2);
        else if (n3 % 2 != 0)
            System.out.println(3);
        else System.out.println("Все четные!");
    }
}
import java.lang.String;
import java.util.Scanner;
public class StrMun {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        scanner.close();
        if(ch>=48&&ch<=57)
            if((ch)%2==0)
            System.out.println("Четное");
            else
                System.out.println("Нечетное");
        else
            System.out.println("Не число!");
    }
}
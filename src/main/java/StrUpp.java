import java.lang.String;
import java.util.Scanner;
public class StrUpp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        scanner.close();
        if(ch>=65&&ch<=90)
            System.out.println(ch);
        else
            System.out.println(ch+32);
    }
}
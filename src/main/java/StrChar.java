import java.lang.String;
import java.sql.SQLOutput;
import java.util.*;
public class StrChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String ch=scanner.nextLine();
        scanner.close();
        String[] letters = ch.split(" ");
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].charAt(letters[i].length() - 1) == letters[i].charAt(0))
                System.out.println(letters[i]+" ");
        }
    }
}
import java.util.Scanner;
public class Potato_counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x1,y1.");
        int x1= scanner.nextInt();
        int y1= scanner.nextInt();
        System.out.println("Input x2,y2.");
        int x2= scanner.nextInt();
        int y2= scanner.nextInt();
        if(x1==x2||y1==y2){
            System.out.println("Can.");
        }else if(Math.abs(x1-x2)==Math.abs(y1-y2)){
            System.out.println("Can.");
    }else System.out.println("Cannot.");
}}

import java.util.Scanner;
public class Massive {
    public static void main(String[] args) {
        int array[]=new int[10];
        for(int i=0;i<10;i++){
            Scanner scanner = new Scanner(System.in);
            array[i]=scanner.nextInt();
        }
        System.out.println("Length of the array: "+ array.length);
        System.out.print("Elements: ");
        for(int i=9;i!=-1;i--){
            if(array[i]>array[i-1])
                System.out.print(array[i]+", ");
    }
}}

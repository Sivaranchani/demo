package array;

import java.util.Scanner;
public class TestArray2{


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s = scan.next();
        Double d = scan.nextDouble();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
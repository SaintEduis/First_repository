import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi!");
        int num = in.nextInt();
        int num1 = in.nextInt();

        System.out.println(num + num1);
        in.close();
    }
}
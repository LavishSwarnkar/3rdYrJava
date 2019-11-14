//Custom Exceptions

import java.util.Scanner;

public class L21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        try{
            if(a+b > 99)
                throw new Main.MyException("Sum of integers is greater than 99");
            else
                System.out.print("Test passed!");
        }catch (Main.MyException e){
            e.printStackTrace();
        }
    }

    static class MyException extends Exception{
        MyException(String message) {
            super(message);
        }
    }

}
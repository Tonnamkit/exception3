package exception;

import java.sql.Array;
import java.util.Arrays;

public class lab3 {
    public static void main(String[] args) {
        int[] list = new int[5];
        try {
            System.out.println("Statement 1");
            System.out.println(list[10]);
            System.out.println("Statement 3");
        }
        catch (ArithmeticException ex){

        }
        catch (RuntimeException ex){

        }
        finally {
            System.out.println("Statement 4");
        }

        System.out.println("Statement 5");

    }
}

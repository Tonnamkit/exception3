package exception;

public class lab4 {
    public static void main(String[] args) {
        int[] list = new int[5];
        try {
            System.out.println("Statement 1");
            System.out.println(list[10]);
            System.out.println("Statement 3");
        }
        catch (ArithmeticException ex){

        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException");
            throw new RuntimeException();
        }
        finally {
            System.out.println("Statement 4");
        }

        System.out.println("Statement 5");

    }
}

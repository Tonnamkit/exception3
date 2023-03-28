package exception;

public class lab6 {
    public static void main(String[] args) {


        int[] list = new int[5];
        try {
            System.out.println("List 5: " + list[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//             e.printStackTrace();
            StackTraceElement[] s = e.getStackTrace();
//            System.out.println(s.length);

            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i].getClassName());
                System.out.println(s[i].getMethodName());
                System.out.println(s[i].getFileName());
                System.out.println(s[i].getLineNumber());
            }

        }
    }
}

package exception;

public class lab1 {
    public static void main(String[] args) {
//        testa();
//        testb();
//        testc();
//        testd();
//        teste();
        testf();
    }

    static void testa(){
        System.out.println(1/0);
    }

    static void testb(){
        int[] list = new int[5];
        System.out.println(list[5]);
    }

    static void testc(){
        String a ="ABC";
        System.out.println(a.charAt(3));
    }

    static void testd(){
        Object o = new Object();
        String d = (String) o;
    }

    static void teste(){
        Object o =null;
        System.out.println(o.toString());
    }

    static void testf(){
        System.out.println(1.0/0);
    }
}

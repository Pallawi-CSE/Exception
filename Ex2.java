package ExceptionHandling;

public class Ex2 {

    public static void m1(){
        System.out.println("inside m1()");
        int i = 9/0; // arithmetic exception hence program will terminate here
        System.out.println("leaving m1()");
    }
    public static void main(String[] args) {
        System.out.println("inside main()");
        m1();
        System.out.println("leaving main()");
    }

}

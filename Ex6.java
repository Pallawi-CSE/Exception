package ExceptionHandling;

public class Ex6 {

    void m1(){
        System.out.println("inside m1()");
        m2();
        System.out.println("leaving m1()");
    }
    void m2(){
        try{
            System.out.println("inside TRY m2()");
            m3();
        }catch(Exception e){
            System.out.println("inside CATCH m2()");
        }
        System.out.println("leaving m2()");
    }
    void m3(){
        System.out.println("inside m3()");
        int i = 9/0;
        System.out.println("leaving m3()");
    }

    public static void main(String[] args) {
        Ex6 o1 = new Ex6();
        o1.m1();
        System.out.println("leaving main()");
    }
}



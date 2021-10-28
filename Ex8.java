package ExceptionHandling;

public class Ex8 {
    void m1(){
        System.out.println("inside m1()");
        m2();
        System.out.println("leaving m1()");
    }
    void m2(){
        try{
            System.out.println("inside TRY m2()");
            System.out.println(9/0);
            // return; //even with return finally will defintely be called
        }finally{
            System.out.println("inside FINALLY m2()");
        }
    }
    public static void main(String[] args) {
        Ex8 o1 = new Ex8();
        o1.m1();
    }
}


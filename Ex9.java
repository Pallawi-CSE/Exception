package ExceptionHandling;

public class Ex9 {

    void m1(){
        System.out.println("inside m1()");
        int i = m2();
        System.out.println("leaving m1(); i = "+i);
        //return;
    }
    int m2(){
        System.out.println("inside m2()");
        try{
            System.out.println(9/0); //ARITHMETIC EXCEPTION
            return 10; //even with return finally will defintely be called
        }catch(Exception e){
        }finally{
            System.out.println("inside FINALLY m2()");
            return 18; // without this return CTE
        }
    }
    public static void main(String[] args) {
        Ex9 o1 = new Ex9();
        o1.m1();
    }
}

package ExceptionHandling;

class Ex3{
    public static void main(String[] args) {
        System.out.println("inside main()");
        try{
            System.out.println("inside try");



            int i = 9/0;
            System.out.println("leaving try");
        }catch(Exception e){
            System.out.println("inside CATCH");
        }

        System.out.println( "main() ends");
    }
}



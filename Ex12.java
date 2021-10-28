package ExceptionHandling;
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println("Inside TRY");
            System.exit(0);
            System.out.println("leaving TRY");
        }finally{
            System.out.println("Inside FINALLY");
        }
    }

}


package ExceptionHandling;

public class Ex16Exception extends Exception{

    String name;

    Ex16Exception(String s){
        name = s;
    }

    public String toString() {
        return name;
    }
}
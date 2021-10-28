package ExceptionHandling;

public class Ex16 {

    int divideBy(int d) throws Ex16Exception {
        int n = 10;
        if (d == 0) {
            throw new Ex16Exception("denominator is zero");
        } else {
            n = 10 / d;
        }
        return n;
    }

    int getMarks(int p) throws Ex16Exception {
        int[] marks = {11, 21, 31, 41, 51};
        if (p >= marks.length) {
            throw new Ex16Exception("Totsl no. of students is 5 only; you are enquiring about " + (p - 1) + "th student");
        }
        return marks[p];
    }

    public static void main(String[] args) {
        Ex16 o1 = new Ex16();
        try {
            int j = o1.divideBy(2);
            System.out.println("j = " + j);

            int k = o1.getMarks(7);
            System.out.println("k = " + k);
        } catch (Ex16Exception e) {
            System.out.println(e);
        } catch (Exception e) {

        }
    }
}
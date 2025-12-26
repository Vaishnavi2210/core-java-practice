package _02_operators;

public class _3_Assignment {
    public static void main(String[] args) {
        int a = 10; // direct value
        int b = 10 * 20; // expression
        int c = b; // another variable
        int d = Math.max(10,20);

        System.out.println(a); //10
        System.out.println(b); //200
        System.out.println(c); //200
        System.out.println(d); //20

        //System.out.println(10=20);//CTE
        System.out.println(a=123456);//123456`
    }
}

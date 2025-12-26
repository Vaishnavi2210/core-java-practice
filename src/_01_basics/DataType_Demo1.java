package _01_basics;

public class DataType_Demo1 {
    public static void main(String[] args) {

        //args ---> local reference variable

        System.out.println(System.identityHashCode(args));
        System.out.println("int data type range");
        System.out.println("min =" + Integer.MIN_VALUE);
        System.out.println("max = "+ Integer.MAX_VALUE);

    }

}



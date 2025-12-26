package _02_operators;

public class _4_Increment {
    public static void main(String[] args) {

        //       //Demo_1
        int a = 5;
        int b = ++a;
        System.out.println("a = " + a);//6
        System.out.println("b = " + b);//6

        int c = 5;
        int d = c++;
        System.out.println("c = " + c);//6
        System.out.println("d = " + d);//5

        int e = 5;
        int f = --e;
        System.out.println("e = " + e);//4
        System.out.println("f = " + f);//4

        int g = 5;
        int h = g--;
        System.out.println("g = " + g);//4
        System.out.println("h = " + h);//5

        //        //Demo_2
        int m= 1;
        int n = 2;
        int o = 3;
        System.out.println(++m + ++n + m++ + n++ + o--); //13
        System.out.println(m); //3
        System.out.println(n); //4
        System.out.println(o); //2

        //        //Demo_3
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println(++x + ++y + --x + y++ - z-- - --y); //3
        //2   + 3   +  1 + 3 - 3 - 3
        System.out.println(x); //1
        System.out.println(y); //3
        System.out.println(z); //2
    }
}

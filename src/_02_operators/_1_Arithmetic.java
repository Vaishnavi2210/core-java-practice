package _02_operators;

public class _1_Arithmetic {
    public static void main(String[] args) {

        //         // Demo_1
       System.out.println(10 + 20); //30
        System.out.println(10 - 20); //-10
        System.out.println(10 * 20); // 200
        System.out.println(10 / 20); // Quotient 0.5
        System.out.println(10 % 20); // Remainder 10

        //        // Demo_2
        System.out.println(1 / 10); //0
        System.out.println(1 % 10); //1
        System.out.println(10 / 1); //10
        System.out.println(10 % 1); //0

        //         // Demo_3
        System.out.println('A' + 'A'); //130
        System.out.println('A' + 5); //70
        System.out.println('A' - 'A');//0
        System.out.println('A' - 5);//60

        System.out.println(2025 % 400); //25
        System.out.println(2025 % 100); //25
        System.out.println(2025 % 4);//1


        // digit separation
        System.out.println(123 % 10); //3
        System.out.println(123 / 10); //12

        System.out.println(12 % 10); //2
        System.out.println(12 / 10); //1

        System.out.println(1 % 10); //1
        System.out.println(1 / 10); //0

        //        // Demo_4
        int chocolates = 1;
        int students = 20;
        System.out.println("chocolates per student: " + chocolates / students); // 0
        System.out.println("chocolates left over after distribution: " + chocolates % students); //10

        //        // Demo_5
        float chocolatess = 10;
        float studentss = 20;
        System.out.println("chocolates per student: " + chocolates / students); // 0.5
        System.out.println("chocolates left over after distribution: " + chocolates % students); //10.0

        //        // Demo_6
        int chocolatesss = 10;//LPV
        int studentsss = 0;//LPV
        System.out.println("chocolates per student: " + chocolates / students); // ArithmeticException : / by zero
        System.out.println("chocolates left over after distribution: " + chocolates % students); // ArithmeticException : / by zero

        //        // Demo_7
        System.out.println(10.0f / 0);//Infinity
        System.out.println(10.0f % 0);//NaN

        //        // Demo_8
        int a = 10;
        //a = a + 5;  //15 ---------> a +=5
        a += 5;  //15
        System.out.println("a = " + a);

        int b = 10;
        //b =b - 5; //5
        b -= 5;//5
        System.out.println("b = " + b);

        int c = 10;
        //c = c * 5; //50
        c *= 5; //50
        System.out.println("c = " + c);

        int d = 10;
        d /= 5;
        System.out.println("d = " + d);

        int e = 10;
        e %= 5;
        System.out.println("e = " + e);

        //        // Demo_9
        int number = 456;
        int sumOfDigits = 0;
        int digit = 0;

        digit = number % 10;
        sumOfDigits += digit; //sumOfDigits = sumOfDigits + digit;
        number /= 10; //number = number / 10;

        digit = number % 10;
        sumOfDigits += digit; //sumOfDigits = sumOfDigits + digit;
        number /= 10; //number = number / 10;


        digit = number % 10;
        sumOfDigits += digit; //sumOfDigits = sumOfDigits + digit;
        number /= 10; //number = number / 10;

        System.out.println("Sum of digits: " + sumOfDigits);


        // Demo_10
        int numbers = 123456789;
        int sumOfDigitss = 0;
        int digits = 0;

        while (numbers > 0) {
            digits = numbers % 10;
            sumOfDigitss += digits; //sumOfDigits = sumOfDigits + digit;
            numbers /= 10; //number = number / 10;

        }


        System.out.println("Sum of digits: " + sumOfDigitss);

        }
}

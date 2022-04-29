package Shape;

import java.util.Scanner;

public class tugiac extends point {
    private static int a, b, c, d ;

        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                setA(sc.nextInt());
            }
        }
        private static void setA(int nextInt) {
            
        }
        
        public static int getD() {
            return d;
        }
        public static int getC() {
            return c;
        }
        public static int getB() {
            return b;
        }
        public static int getA() {
            return a;
        }

    if ((a + b > c) || (a + c > b) || (b + c > a)) {
        System.out.println("Đây là tam giác !");
    }
    if ((a == b) || (b == c) || (c == d) || (d==a)) {
        System.out.println("Đây là tu gia can !");
    } else if ((a == b) && (b == c) && (c == a) && (d==a)) {
        System.out.println("Đây là tu giac deu!");
    } else if ((a * a == b * b + c * c + d * d) || (b * b == a * a + c * c + d * d) || (c * c == b * b + a * a + d * d) || (d * d== a*a +b*b +c*c)) {
        System.out.println("Đây là tu giac !");
    } else {
        System.out.println("Đây không phải tam giác");
    }
}
}




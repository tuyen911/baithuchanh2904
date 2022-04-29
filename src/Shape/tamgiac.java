package Shape;

public class tamgiac  extends point { 
    public static void main(String[] args) {
		double a = 13, b =19 , c = 15;

		if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("Đây là tam giác !");
		}
		if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Đây là tam giác cân !");
		} else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("Đây là tam giác đều !");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("Đây là tam giác vuông !");
		} else {
			System.out.println("Đây không phải tam giác");
		}
	}
    
}

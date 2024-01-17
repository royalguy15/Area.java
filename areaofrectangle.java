import java.util.*;

public class areaofrectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("length of the rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Breadth of the rectangle: ");
        double b = sc.nextDouble();

        double area = l * b;

        System.out.println("Area of Rectangle:" + area);
    }

}

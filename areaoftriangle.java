import java.util.*;

public class areaoftriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double h = sc.nextDouble();

        double area = 0.5 * b * h;

        System.out.println("The area of the triangle is: " + area);

    }

}

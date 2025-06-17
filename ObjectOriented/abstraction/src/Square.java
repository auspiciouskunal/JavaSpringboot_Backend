import java.util.Scanner;

public class Square extends Shapes{
    float length;
    float breadth;
    float area;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = scanner.nextFloat();

        System.out.println("Enter the breadth: ");
        breadth = scanner.nextFloat();

    }

    public void computeArea(){
        area = length*breadth;
        System.out.println("The area of the Square is: "+ area);
    }
}

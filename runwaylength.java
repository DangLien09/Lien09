import java.util.Scanner;

public class Exercise_02{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();

        double length = (speed * speed) / (2 * acceleration);

        System.out.printf("The minimum runway length for this airplane is %.2f\n", length);
    }

}
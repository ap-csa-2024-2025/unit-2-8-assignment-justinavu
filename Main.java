import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give positive int:");
    printRandom3(sc.nextInt());
    System.out.println("First x-coord:");
    double x1 = sc.nextDouble();
    System.out.println("Second x-coord:");
    double x2 = sc.nextDouble();
    System.out.println("First y-coord:");
    double y1 = sc.nextDouble();
    System.out.println("Second y-coord:");
    double y2 = sc.nextDouble();
    calcSlope(x1, x2, y1, y2);
    System.out.println("Enter two doubles");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
    System.out.println("Distance is " + roundedDist(a, b));
  }
  public static void printRandom3(int n) {
    n += 1;
    System.out.println("Random:");
    System.out.println((int)((Math.random() * n) + 2));
    System.out.println((int)((Math.random() * n) + 2));
    System.out.println((int)((Math.random() * n) + 2));
  }
  public static void calcSlope(double x1, double x2, double y1, double y2) {
    System.out.println("Slope is " + ((y2 - y1)/(x2-x1)));
  }
  public static int roundedDist(double a, double b) {
    return (int)(Math.abs(a-b) + 0.5);
  }
}

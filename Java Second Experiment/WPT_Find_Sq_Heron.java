import java.util.Scanner;

class WPT_Find_Sq_Heron {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    WPT_Find_Sq_Heron r = new WPT_Find_Sq_Heron();

    System.out.print("Enter a number:");
    int n = sc.nextInt();
    System.out.println("Square root of " + n + " is " + r.squareRoot(n));
  }

  double squareRoot(double a) {
    int l = 1;
    double x = (a + 1) / 2;
    while (l == 1) {
      if (x * x == a) {
        break;
      } else {
        x = 0.5 * (x + a / x);
      }
    }
    return x;
  }
}

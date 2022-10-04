import java.util.Scanner;
public class PairSumEquals {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a size of []:");
    int size = sc.nextInt();
    int[] Arr = new int[size];
    System.out.print("Enter Sum :");
    int sum = sc.nextInt();
    System.out.println("Enter "+size+" Elements");
    for (int i = 0; i < size; i++) {
      Arr[i] = sc.nextInt();
    }
    PairSumEquals ref = new  PairSumEquals();
    ref.getPair(Arr, sum, size);
  }
  void getPair(int[] Arr, int sum, int size)
  {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if ((Arr[i] + Arr[j]) == sum && i!=j) {
          System.out.println("(" + Arr[i] + "  " + Arr[j] + ")");
        }
      }
    }
  }
}

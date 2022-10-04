import java.util.Scanner;
public class WPT_FindMissingInSortedArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Size Of Array");
    int size = sc.nextInt();

    int Array[] = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.print("Enter A[" + i + "]"+"\t");
      Array[i] = sc.nextInt();
    }

    for (int i = 0; i < size; i++) {
      if (Array[i] != i) {
        System.out.println("Missing Number From Array Is :" + i);
        break;
      }
    }
  }
}
   


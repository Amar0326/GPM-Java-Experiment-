import java.util.*;
public class WPT_To_Check_Anagram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String 1:");
    String str1 = sc.nextLine();
    System.out.println("Enter String 2:");
    String str2 = sc.nextLine();
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    str1 = str1.replaceAll("\\s", "");
    str2 = str2.replaceAll("\\s", "");

    if (str1.length() != str2.length()) {
      System.out.println("Both String Are Not_anagram");
    }
    else {
      char[] arr_char1 = str1.toCharArray();
      char[] arr_char2 = str2.toCharArray();
      Arrays.sort(arr_char1);
      Arrays.sort(arr_char2);
      if (Arrays.equals(arr_char1, arr_char2) == true) {
        System.out.println("Both String Are Anagram");
      } else {
        System.out.println("Both String Are Not_anagram");
      }
    }
  }
}
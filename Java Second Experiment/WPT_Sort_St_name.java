import java.util.Arrays;
public class WPT_Sort_St_name {
 public static void main(String[] args) { 
 int length = args.length; 
 String Name[] = new String[length]; 
 for (int i = 0; i < length; i++) { 
 Name[i] = (args[i]); 
 } 
 Arrays.sort(Name); // Method Use For Sorting Array
 System.out.println("Sorted Names In Alphabetical Order"); 
 for (int i = 0; i < length; i++) { 
 System.out.println(Name[i]); 
 } 
 } 
}

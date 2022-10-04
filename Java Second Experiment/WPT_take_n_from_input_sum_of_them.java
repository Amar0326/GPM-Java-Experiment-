public class WPT_take_n_from_input_sum_of_them {
  public static void main(String[] args) { 
 int l = args.length; 
 int Arr[] = new int[100]; 
 int sum = 0; 
 System.out.println("Length Of Array Is :" + l); 
 for (int i = 0; i < l; i++) { 
 Arr[i] = Integer.parseInt(args[i]); 
 } 
 for (int j = 0; j <= (l / 2); j++) { 
 sum = sum + Arr[j] * Arr[l - 1]; 
 System.out.println(Arr[j] + "X" + Arr[l - 1]); 
 l--; 
 } 
 System.out.println("Final Sum Of Array:" + sum); 
 } 
   
}

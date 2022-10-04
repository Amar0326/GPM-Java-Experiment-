import java.util.Scanner; 
public class WPT_consider_two_sq_sum {
 int sq(int x) { 
 return (x * x); 
 } 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 WPT_consider_two_sq_sum r = new WPT_consider_two_sq_sum(); 
 System.out.println("Enter First Number:"); 
 int a = sc.nextInt(); 
 System.out.println("Enter Second Number:"); 
 int b = sc.nextInt(); 
 r.sq(a); 
 r.sq(b); 
 System.out.println((r.sq(a)) * (r.sq(b))); 
 }   
}

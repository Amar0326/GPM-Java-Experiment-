import java.util.Scanner;
public class WPT_Count_vovel_onsonants {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String ");
       String Str1 = sc.nextLine();
       int vCount = 0, cCount = 0;   
       Str1 = Str1.toLowerCase(); 
       for(int i = 0; i < Str1.length(); i++) {    
        //Checks whether a character is a vowel    
        if(Str1.charAt(i) == 'a' || Str1.charAt(i) == 'e' ||
           Str1.charAt(i) == 'i' || Str1.charAt(i) == 'o' ||
           Str1.charAt(i) == 'u') {    
         vCount++;    
        }      
        else if(Str1.charAt(i) >= 'a' && Str1.charAt(i)<='z') { 
            cCount++;    
        }    
    }    
    System.out.println("Number of vowels: " + vCount);    
    System.out.println("Number of consonants: " + cCount);    
}      
}

// import java.util.Random;
import java.util.Random;
import java.util.Scanner;
public class Number {

public static void main(String komal[]){
    Scanner sc=new Scanner(System.in);
    
    Random practice=new Random(); 
    int n=practice.nextInt(100)+1;
    
    int pr=-1;
    System.out.println("Enter a number between 1 to 100");
    while (pr!=n) {
        System.out.println("Enter guessing number");
        pr=sc.nextInt();
    
   if(pr>n){
        System.out.println("Number too high");
    }
    else if(pr<n){
       System.out.println("Number too low"); 
    }
    else{
        System.out.println("Guessed correct");
    }
    
    }
    sc.close();
}
}

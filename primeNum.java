//check if a number entered by useris prime or not. --by function
import java.util.*;
public class primeNum {
    //only for n>=2
    public static boolean isprime(int n){
       //corner cases
       if( n==2){
         return true;
       }
       for(int i=2;i<=n-1;i++){
         if(n%i==0){//completely dividing
            
            return false;
         }
       }
       return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
    }
}

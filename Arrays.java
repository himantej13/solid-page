import java.util.*;

public class Arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from  0-9");
        int n = sc.nextInt();
        System.out.println("Enter "+ n +" numbers");

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
            
        }
        System.out.println("Enter a given number to print the index of the number:");
        int x = sc.nextInt();
        for(int i = 0; i < numbers.length; i++ ){
             if(x == numbers[i]){
                System.out.println("Entered number is found at index:"+ i);
            }
        }
        sc.close();
    }
}
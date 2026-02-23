import java.util.Scanner;
public class factorial_recursion{
        static int factorial(int x){
            if(x == 0 || x == 1){
                return 1;
            }
            else{
                return x * factorial(x - 1);
            }
        }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);


        sc.close();  // which can cause resource leaks

    }
}
import java.util.Scanner;
public class sum_of_digits {
    static int sum_digits(int x){
        int sum = 0;
        while(x != 0){
            int dig = x % 10;
            sum += dig;
            x = x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value to find its sum : ");
        int num = sc.nextInt();
        int sum = sum_digits(num);
        System.out.println("The sum is : "+sum);

        sc.close();
    }
}

public class prime_number {
    static int prime_check(int x){
        int count = 0;
        int half = x/2;
        for(int i = 1 ; i <= half ; i++){
            if(x % i == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int check = prime_check(51);
        if(check == 1){
            System.out.println("It is prime!");
        }
        else{
            System.out.println("Not prime!");
        }
    }
}

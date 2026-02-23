public class fibonacci_recursion {
    static int fibonacci(int x){
        if(x == 0 ){
            return 0;
        }
        if(x == 1){
            return 1;
        }
        return fibonacci(x-1) + fibonacci(x-2);
        }
        public static void main(String[] args) {
            int x = 10;
            for(int i = 0 ; i < x; i++){
                System.out.println(fibonacci(i)+" ");
            }
        }
    }


public class maximum_sum_subarray{
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-2,6,7,-9,-2,4,7,1,2,1,3};
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0 ; i< arr.length ; i++){
            int sum = 0;
            for(int j = i ; j < arr.length  ; j++){
                sum = sum + arr[j];
                if(sum>maxValue){
                    maxValue=sum;
                }
            }
        }

        System.out.println("max sum = "+maxValue);
    }
}
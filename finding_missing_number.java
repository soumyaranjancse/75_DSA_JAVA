public class finding_missing_number {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int n = 7;

        int totalSum = n*(n+1)/2;

        int arraySum=0;

        for(int num : arr){
            arraySum += num ;
        }
        System.err.println("missign value is : "+(totalSum - arraySum));



    }
}

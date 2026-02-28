public class remove_duplicates_sorted {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,8,8,8,8,9,10};
        int j = 0;

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] != arr[j]){ 
            // 1 != 1, 
                j++;
                arr[j] = arr[i];
            }
        }
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

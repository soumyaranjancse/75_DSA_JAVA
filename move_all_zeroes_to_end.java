public class move_all_zeroes_to_end{
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,9,0,4,2,0,4,5,7};
        int j = 0; // it mainly counting the indexes of the zeroes

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] != 0 ){
                int temp = arr[i]; // temp = 1
                arr[i] = arr[j]; // arr[1] = 0
                arr[j] = temp; // arr[0] = 1 
                j = j+1; // j = 1
            }
        }
    }
}
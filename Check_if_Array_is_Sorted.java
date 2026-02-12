public class Check_if_Array_is_Sorted {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,0};
        boolean isSorted = true;


        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Yes it is sorted!");
        }
        else{
            System.out.println("No it is not sorted!");
        }

    }
}

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr= {5,1,9,2,10,0};
        int n = arr.length; // 5

        for ( int i = 0 ; i< n-1 ; i++){
            for (int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp;
                }
                
            }
        }
            for(int i = 0 ; i < n-1 ; i++){
                System.out.print("sorted array is : ");
                System.out.println(arr[i] + " ");
            }
        }
    }

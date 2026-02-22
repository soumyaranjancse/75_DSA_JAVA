public class binary_search{
    public static void main(String[] args){
        
        int[] arr = {2,5,8,12,16};
        int x = 16;

        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        int index = -1;
        
        while(low <=high){
            int mid = (low + high) /2;

            if(arr[mid] == x){ 
                found = true;
                index = mid;
                System.out.println("found at index :"+index);
                break;
            }
            else if(arr[mid] > x){
                high = mid-1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }

        }
        if(!found){
            System.out.println("Not Found!");
        }
        }

    }

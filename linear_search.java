public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int x = 1;
        int index =Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length;i++){
            if(x == arr[i]){
                index = i;
                System.out.println("index is: "+index);
            }
        }
        if(index == Integer.MIN_VALUE){
            System.out.println(-1);
        }
    }
}

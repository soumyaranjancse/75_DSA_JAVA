public class count_evenn_and_odd {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int even_count=0,odd_count = 0;
        for(int i = 0 ; i < array.length;i++){
            
            if (array[i] % 2 == 0){
                even_count+=1;
            }
            else{
                odd_count+=1;
            }
        }

        System.out.println("odd counts are: "+odd_count);
        System.out.println("even counts are: "+even_count);

    }
}

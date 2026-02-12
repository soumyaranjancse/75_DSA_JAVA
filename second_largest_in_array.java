public class second_largest_in_array {
    public static void main(String[] args) {
        int[] array = {110,1098,0,345,876,987};
        int max = Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        for(int i =0; i<array.length; i++){
            if(array[i] > max){
                //if current number is bigger than max, then:
                // Old max becomes second_largest
                // Current number becomes new max
                second_largest=max;
                max = array[i];
            }
            else if(array[i] > second_largest && array[i]!=max){
                //This runs when:
                //array[i] is NOT max
                //But bigger than second_largest

                second_largest=array[i];
            }

        }
        System.out.println("Second Largest = " + second_largest);
       
    }
}

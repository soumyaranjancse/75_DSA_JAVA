import java.util.HashSet;
public class intersection_2_arrays {
     public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int[] A = {1, 2, 3, 4};
        int[] B = {3, 4, 5, 6};

        for(int i : A){
            set.add(i);
        }

        for(int i : B){
            if(set.contains(i)){
                System.out.println(i+" ");
            }
        }

    }
}

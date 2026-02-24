import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = {2,2,1,2,3,2,2};

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num,0) + 1);
            if (map.get(num)>n/2) {
                System.out.println("Majority Element = " + num);
                break;
            }
        }
    }
}
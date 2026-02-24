import java.util.HashMap;

public class FirstRepeating {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,56,6,6,0,1,12,3,3,4,46,677,9,23,121,4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) > 1) {
                System.out.println("First Repeating: " + num);
                break;
            }
        }
    }
}
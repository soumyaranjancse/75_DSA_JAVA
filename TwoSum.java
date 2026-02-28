import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7,11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i]; // 9-2 = 7 , 9-7 = 2

            if (map.containsKey(complement)) { 
                //i : 0 (map is initially 0 , then it stores 2 , then after checking , we found that 2 is not in the map , so store 2=0)
                //i: 1 ( after the 2nd iteration it found that 2 is available on the map , so we perform the task given below)
                System.out.println("Pair: " + complement + " and " + arr[i]);
                break;
            }

            map.put(arr[i], i);
        }
    }
}
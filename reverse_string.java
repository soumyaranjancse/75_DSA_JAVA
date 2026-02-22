public class reverse_string {
    public static void main(String[] args) {
        // it told us that without using any inbuilt method .
        String str = "Soumya";
        String rev = "";
        int length = str.length();

        for(int i = length - 1 ;  i >=  0 ; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("rev :"+rev);
    }
}

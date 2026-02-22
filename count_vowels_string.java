public class count_vowels_string {
    public static void main(String[] args) {
        String str = "Soumya Ranjan Behera";
        int len = str.length();
        int vow = 0;
        for(int i = 0 ; i< len-1 ; i++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch =='u'){
                vow+=1;
            }
        }
        System.out.println("number of vowels are : "+vow);
    }
}

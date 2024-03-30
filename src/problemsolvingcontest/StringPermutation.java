package problemsolvingcontest;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str,"");

    }
    public static void printPermutation(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
        }
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            String a = str.substring(0,i)+str.substring(i+1);
            printPermutation(a,ans+ch);
        }
    }
}

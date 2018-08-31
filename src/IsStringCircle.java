public class IsStringCircle {

    public static void main(String [] args){

        String s1 = "aabbcccd";
        String s2 = "abbcccda";

        System.out.println(IsStringCircle(s1,s2));
    }
    public static boolean IsStringCircle(String s1,String s2) {
        for (int i = 0; i < s1.length(); i++) {
            s1 = s1.substring(s1.length()-1) + s1.substring(0,s1.length()-1 );
            if(s1.equals(s2)){
                return true;
            }
        }
        return false;
    }
}

public class recursion2 {
    public static void main(String[] args) {
//        //strings
//        //Q. remove the a from the string and print the string
//        //first approach
//        //skip a and store the new string into another variable and print it
//        skip("","baccda");
//        //second approach
//        //we will replace the same string with no a in it
//        System.out.println(skip1("baccda"));
//        System.out.println(skipapple("bcdfapplejde"));
//        System.out.println(skipappnotapple("bsdappgh"));
    }
    //first aproach
//    static void skip(String p,String up){
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        if (ch=='a'){
//            skip(p,up.substring(1));//substring removes the ch from the string at that index and make a new String from after that index
//        }
//        else {
//            skip(p+ch,up.substring(1));
//        }
//    }
//    //second approach
//    static String skip1(String up){
//        if (up.isEmpty()){
//            return "";
//        }
//        char ch = up.charAt(0);
//        if (ch =='a'){
//            return skip1(up.substring(1));
//        }
//        else{
//            return ch + skip1(up.substring(1));
//        }
//    }
//    static String skipapple(String up){
//        if (up.isEmpty()){
//            return "";
//        }
//
//        if (up.startsWith("apple")){
//            return skipapple(up.substring(5));
//        }
//        else{
//            return up.charAt(0) + skipapple(up.substring(1));
//        }
//    }
//    static String skipappnotapple(String up){
//        if (up.isEmpty()){
//            return "";
//        }
//
//        if (up.startsWith("app") && !up.startsWith("apple")){
//            return skipappnotapple(up.substring(3));
//        }
//        else{
//            return up.charAt(0) + skipappnotapple(up.substring(1));
//        }
//    }

}
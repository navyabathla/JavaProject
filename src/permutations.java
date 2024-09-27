import java.util.ArrayList;
import java.util.Locale;

public class permutations{
    public static void main(String[] args) {
//        permutations("","abc");
//        ArrayList<String> ans = permutationslist("","abc");
//        System.out.println(ans);
//        System.out.println(permutationscount("","abc"));  //3!


    }
//    static void permutations(String p, String up){
//        if (up.isEmpty()){
//            System.out.print(p+" ");
//            return;
//        }
//        char ch = up.charAt(0);
//        for (int i = 0; i <= p.length() ; i++){
//            String f = p.substring(0,i);
//            String s = p.substring(i, p.length());
//            permutations(f+ch+s,up.substring(1));
//        }
//    }
//    static ArrayList<String> permutationslist(String p, String up){
//        if (up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        char ch = up.charAt(0);
//        //local to this call
//        ArrayList<String> ans = new ArrayList<>();
//        for (int i = 0; i <= p.length() ; i++){
//            String f = p.substring(0,i);
//            String s = p.substring(i, p.length());
//            ans.addAll(permutationslist(f+ch+s,up.substring(1)));
//        }
//        return ans;
//   }
//    static int permutationscount(String p, String up){
//        if (up.isEmpty()){
//            return 1;
//        }
//        char ch = up.charAt(0);
//        int count = 0;
//        for (int i = 0; i <= p.length() ; i++){
//            String f = p.substring(0,i);
//            String s = p.substring(i, p.length());
//            count = count + permutationscount(f+ch+s,up.substring(1));
//        }
//        return count;
//    }

}
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subseq{
    public static void main(String[] args) {
        //recursion
//        subseq("","abc");
//        System.out.println(subseq1("","abc"));
//        //ascii value
//        char ch = 'a';
//        System.out.println(ch+0);
//        subseqascii("","abc");
//        System.out.println(subseqascii1("","abc"));

        //iteration
//        int[] arr = {1,2,3};
//        List<List<Integer>> ans = subset(arr);
//        for (List<Integer> list : ans){
//            System.out.println(list);
//        }
//        int[] arr = {1,2,2};
//        List<List<Integer>> ans = subsetduplicate(arr);  //wrong output
//        for (List<Integer> list : ans){
//            System.out.println(list);
//        }

    }
    //recursion
//    static void subseq(String p, String up){
//        if (up.isEmpty()){
//            System.out.print(p+" ");
//            return;
//        }
//        char ch = up.charAt(0);
//        subseq(p+ch,up.substring(1));
//        subseq(p,up.substring(1));
//    }
//    static ArrayList<String> subseq1(String p, String up){
//        if (up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//
//        }
//        char ch = up.charAt(0);
//        ArrayList<String> left = subseq1(p+ch,up.substring(1));
//        ArrayList<String> right = subseq1(p,up.substring(1));
//        left.addAll(right);
//        return left;
//    }
//      static void subseqascii(String p, String up){
//          if (up.isEmpty()){
//              System.out.print(p+" ");
//              return;
//          }
//          char ch = up.charAt(0);
//          subseqascii(p+ch,up.substring(1));
//          subseqascii(p,up.substring(1));
//          subseqascii(p + (ch+0),up.substring(1));
//
//      }
//        static ArrayList<String> subseqascii1(String p, String up){
//            if (up.isEmpty()){
//                ArrayList<String> list = new ArrayList<>();
//                list.add(p);
//                return list;
//
//            }
//            char ch = up.charAt(0);
//            ArrayList<String> first = subseqascii1(p+ch,up.substring(1));
//            ArrayList<String> second = subseqascii1(p,up.substring(1));
//            ArrayList<String> third = subseqascii1(p + (ch+0),up.substring(1));
//            first.addAll(second);
//            first.addAll(third);
//            return first;
//       }

    //iteration
//    static List<List<Integer>> subset(int[] arr){
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        for (int num : arr){
//            int n = outer.size();
//            for (int i = 0; i<n ;i++){
//                List<Integer> internal = new ArrayList<>(outer.get(i));
//                internal.add(num);
//                outer.add(internal);
//
//            }
//        }
//        return outer;
//    }
//    static List<List<Integer>> subsetduplicate(int[] arr){   //wrong output
//        Arrays.sort(arr);
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        int start = 0;
//        int end = 0;
//        for (int i = 0; i < arr.length ; i++){
//            start = 0;
//            //if y current and previous element is same then s = e+1
//            if (i>0 && arr[i]==arr[i-1]){
//                start = end+1;
//            }
//            end = outer.size() - 1;
//            int n = outer.size();
//            for (int j = start; j<n ;j++){
//                List<Integer> internal = new ArrayList<>(outer.get(j));
//                internal.add(i);
//                outer.add(internal);
//            }
//        }
//        return outer;
//    }
}
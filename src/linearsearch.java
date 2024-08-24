import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class linearsearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //search an element in an aray
//        int[] arr={12,2,56,-4,34,76,13};
//        //print min value of an array
//        System.out.println(min(arr));
//        int target=34;
//        search for an element in a range
//        System.out.println(searchinrange(arr,target,2,5));
//        int ans=linearsearchalgo(arr,target);
//        System.out.println(ans);

//        // search a char in a string...string is also like an array
//        String str = "Navya";
//        char target = 'y';
//        //System.out.println(search(str,target));
//        System.out.println(Arrays.toString(str.toCharArray()));

//        //search for an element in 2D array
//        int[][] arr2D = {
//                {1,34,56,93},
//                {45,1,69,21,32},
//                {49,2}
//        };
//        System.out.println(max(arr2D));
//        int target = 69;
//        int[] ans = search2D(arr2D,target);
//        System.out.println(Arrays.toString(ans));

//        //find how many elements of an array has evem number of digits
//        int[] nums = {12,3,456,-2345,765,3,45};
//        int ans = findNumbers(nums);
//        System.out.println(ans);


    }
//    static boolean search(String str,char target){
//        if (str.length()==0){
//            return false;
//        }
//        for (int i=0;i<str.length();i++){
//            if (target == str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    static boolean search2(String str,char target){
//        if (str.length()==0){
//            return false;
//        }
//        for (char ch : str.toCharArray()) {
//            if (ch == target) {
//                return true;
//            }
//        }
//        return false;
//    }
//    static int linearsearchalgo(int[] arr,int target){
//        if (arr.length==0){
//            return -1;
//        }
//        for (int index=0;index<arr.length;index++){
//            int element=arr[index];
//            if(element==target){
//                return index;
//            }
//        }
//        return  -1;
//    }

//    static int searchinrange(int[] arr,int target,int start,int end){
//        if (arr.length==0){
//            return -1;
//        }
//        for (int index=start;index<end;index++){
//            int element=arr[index];
//            if(element==target){
//                return index;
//            }
//        }
//        return  -1;
//    }

    //for printing the min value in an array
//    static int min(int[] arr){
//        if (arr.length==0){
//            System.out.println("Array is empty");
//        }
//        int minval=arr[0];
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]<minval){
//                minval=arr[i];
//            }
//        }
//        return minval;
//    }
//    //search in 2D array
//    static int[] search2D(int[][] arr,int target){
//        for (int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                if (arr[i][j]==target){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return new int[] {-1,-1};
//    }
//    //find max value in 2d array
//    static int max(int[][] arr){
//        int maxval=arr[0][0];
//        for (int i=0;i<arr.length;i++){
//            for (int j=0; j<arr[i].length;j++){
//                if (arr[i][j]>maxval){
//                    maxval=arr[i][j];
//                }
//            }
//        }
//        return maxval;
//    }

//    //finding how many elements in an array has even number of digits
//    static int findNumbers(int[] nums){
//        int count = 0;
//        for (int num : nums){
//            if (even(num)){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    //function to check even digits
//    static boolean even(int num){
//        int number_of_digits= digits(num);
//        return number_of_digits % 2 == 0;
//    }
//    //function to check number of digits
//    static int digits(int num){
//        if (num<0){
//            num=num * -1;
//        }
//        if (num==0){
//            return 1;
//        }
//        int count=0;
//        while (num>0){
//            count++;
//            num/=10;
//        }
//        return count;
//    }

//    public int maximumWealth(int[][] accounts) {
//        //person=row
//        //account=col
//        int ans=Integer.MIN_VALUE;
//        for (int person =0;person< accounts.length;person++){
//            int sum=0;
//            for (int account=0;account<accounts[person].length;account++){
//            sum+=accounts[person][account];
//            }
//
//            //now we have sum of accounts of person i.e.rows
//            //now we will compare whose wealth is most
//            if (sum>ans){
//                ans=sum;
//            }
//        }
//        return ans;
//    }

//    public int maximumWealth(int[][] accounts) {
//        //person=row
//        //account=col
//        int ans=Integer.MIN_VALUE;
//        for (int[] ints : accounts) {
//            int sum = 0;
//            for (int anInt : ints) {
//                sum += anInt;
//            }
//
//            //now we have sum of accounts of person i.e.rows
//            //now we will compare whose wealth is most
//            if (sum > ans) {
//                ans = sum;
//            }
//        }
//        return ans;
//    }


}
import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class binarysearch2d{
    public static void main(String[] args) {
//        //array is sorted in row wise and column wise manner
//        int[][] arr = {
//                {10,20,30,40},
//                {11,24,35,46},
//                {15,26,37,49},
//                {19,27,39,50}
//        };
//        int target = 39;
//        System.out.println(Arrays.toString(search(arr, target)));
//        //array is strictly sorted
//        int[][] arr1 ={
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12}
//        };
//        System.out.println(Arrays.toString(search(arr1,10)));


    }
//    static int[] search(int[][] arr,int target){
//        int r = 0;
//        int c = arr.length-1;
//        while (r < arr.length && c >=0){
//            if (arr[r][c] == target){
//                return new int[]{r,c};
//            }
//            if (arr[r][c] < target){
//                r++;
//            }
//            else {
//                c--;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//    //search in the row provided and the cols provided
//    static int[] binarysearch(int[][] matrix,int row,int cs,int ce,int target){
//        while (ce<=ce){
//            int m = cs+(ce-cs)/2;
//            if (matrix[row][m] == target){
//                return new int[]{row,m};
//            }
//            if (matrix[row][m] < target){
//                cs=m+1;
//            }
//            else {
//                ce=m-1;
//            }
//        }
//        return new int[]{-1,-1};
//
//    }
//    //
//    static int[] search(int[][] matrix,int target){
//        int r = matrix.length;
//        int c = matrix[0].length;
//        if (r==1){
//            return binarysearch(matrix,0,0,c-1,target);
//        }
//        int rs = 0;
//        int re = r-1;
//        int cm = c/2;
//        while (rs<(re-1)){ //while this is true it will have more than two rows
//            int rm = rs + (re-rs)/2;
//            if (matrix[rm][cm] == target){
//                return new int[]{rm,cm};
//            }
//            if (matrix[rm][cm] < target){
//                rs = rm;
//            }
//            else {
//                re = rm;
//            }
//
//        }
//        //now we have two rows
//        //check whether the target is in the mid col of two rows
//        if (matrix[rs][cm]==target){
//            return new int[]{rs,cm};
//        }
//        if (matrix[rs+1][cm]==target){
//            return new int[]{rs+1,cm};
//        }
//        //search in 1st half
//        if (target <= matrix[rs][cm-1]){
//            return binarysearch(matrix,rs,0,cm-1,target);
//        }
//        //search in 2nd half
//        if (target >= matrix[rs][cm+1] && target <= matrix[rs][c-1]){
//            return binarysearch(matrix,rs,cm+1,c-1,target);
//        }
//        //search in 3rd half
//        if (target <= matrix[rs+1][cm-1]){
//            return binarysearch(matrix,rs+1,0,cm-1,target);
//        }
//        else {
//            return binarysearch(matrix,rs+1,cm+1,c-1,target);
//        }
//    }
}
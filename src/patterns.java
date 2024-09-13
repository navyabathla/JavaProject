public class patterns{
    public static void main(String[] args) {
//        pattern2(4);
//        pattern1(4);
//        pattern3(4);
//        pattern4(4);
//        pattern5(4);
//        pattern28(5);
//        pattern30(5);
//        pattern31(4);

    }
//    static void pattern31(int n){
//        n=2*n;
//        for (int row = 1 ;row < n;row++){
//            for (int col = 1 ;col < n;col++){
//                int atEveryIndex = Math.min(Math.min(row,col),Math.min(n-row,n-col));
//                System.out.print(atEveryIndex+" ");
//
//            }
//            System.out.println();
//        }
//    }
//    static void pattern30(int n){
//        for (int row = 1;row<=n;row++){
//            for (int space = 0; space<n-row;space++){
//                System.out.print("  ");
//            }
//            for (int col = row; col>=1;col--){
//                System.out.print(col+" ");
//            }
//            for (int col = 2 ; col<=row;col++){
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }
//    }


//    //pattern1
//    //* * * *
//    //* * * *
//    //* * * *
//    //* * * *
//    static void pattern1(int n){
//        for (int row = 1; row <= n;row++){
//            for (int col = 1; col <= n; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    //pattern2
//    //*
//    //* *
//    //* * *
//    //* * * *
//    static void pattern2(int n){
//        for (int row = 1; row <= n;row++){
//            for (int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    //pattern3
//    //* * * *
//    //* * *
//    //* *
//    //*
//    static void pattern3(int n){
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= n-row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    //pattern4
//    //1
//    //1 2
//    //1 2 3
//    //1 2 3 4
//    static void pattern4(int n){
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= row; col++){
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }
//    }

//    //pattern5
////    *
////    * *
////    * * *
////    * * * *
////    * * *
////    * *
////    *
//    static void pattern5(int n) {
//        for (int row = 0; row < (2 * n); row++) {
//            int TotalColsInRow = row > n ? 2*n-row-1:row;
//            for (int col = 0; col < TotalColsInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//   //pattern28
////       *
////      * *
////    * * *
////   * * * *
////     * * *
////      * *
////       *
//     static void pattern28(int n) {
//         for (int row = 0; row < (2 * n); row++) {
//             int TotalColsInRow = row > n ? 2*n-row-1:row;
//             int noOfSpaces = n-TotalColsInRow;
//             for (int s = 0; s< noOfSpaces; s++){
//                 System.out.print(" ");
//             }
//             for (int col = 0; col < TotalColsInRow; col++) {
//                 System.out.print("* ");
//             }
//        System.out.println();
//    }
//}
}
import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. convert temp in C to temp in F
//        System.out.print("Enter temp in C: ");
//        float tempC = sc.nextFloat();
//        float tempF = (tempC * 9/5) + 32;
//        System.out.println(tempF);

//        //2. check if a year is leap year or not
//        System.out.print("Enter year: ");
//        int year = sc.nextInt();
//        if((year % 4 ==0 && year % 100!=0) || year % 400==0){
//            System.out.println("year is leap year");
//        }
//        else{
//            System.out.println("year is not leap year");
//        }

//        //3. print multiplication table for a number
//        System.out.print("Enter number: ");
//        int a = sc.nextInt();
//        for(int i=1; i<=10; i++){
//            System.out.println(a + "X" + i + "=" + (a*i));
//        }

//        //4. take two numbers as input and calculate hcf and lcm
//        System.out.print("Enter first number: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = sc.nextInt();
//        int a = num1;
//        int b = num2;
//        while(b!=0){
//            int temp = b;
//            b = a % b;
//            a = temp;
//
//        }
//        int hcf = a;
//        int lcm = (num1*num2) / hcf;
//        System.out.println("hcf is: "+ hcf);
//        System.out.println("lcm is: "+ lcm);

//        //5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
//        int sum = 0;
//        while(true){
//            System.out.print("Enter a number or x to stop: ");
//            String input = sc.next();
//        if(input.equalsIgnoreCase("x")){
//            break;
//        }
//        int number = Integer.parseInt(input);
//        sum+=number;
//        }
//        System.out.println("sum is: "+ sum);

    }
}
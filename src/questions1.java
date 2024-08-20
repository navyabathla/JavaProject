import java.util.Scanner;

public class questions1 {
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
//        //6. Write a program to print whether a number is even or odd, also take input from the user.
//        System.out.print("Enter number: ");
//        int number = sc.nextInt();
//        if(number%2==0){
//            System.out.println("Number is even");
//        }
//        else{
//            System.out.println("Number is odd");
//        }
//        //7. Take name as input and print a greeting message for that particular name.
//        System.out.print("Enter name: ");
//        String name = sc.next();
//        System.out.println("Welcome "+name);
//        //8. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        System.out.print("Enter principal: ");
//        float p = sc.nextFloat();
//        System.out.print("Enter rate: ");
//        float r = sc.nextFloat();
//        System.out.print("Enter time(in years): ");
//        float t = sc.nextFloat();
//        float i = (p*r*t)/100;
//        System.out.println("Simple Interest is; "+i);
//        //9. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter second number: ");
//        int b = sc.nextInt();
//        System.out.print("Enter operator(+,-,*,/): ");
//        char op = sc.next().charAt(0);
//        if (op=='+'){
//            System.out.println("Result is: "+ (a+b));
//        } else if(op=='-'){
//            System.out.println("Result is: "+ (a-b));
//        } else if(op=='*'){
//            System.out.println("Result is: "+ (a*b));
//        } else if(op=='/'){
//            System.out.println("Result is: "+ (a/b));
//        }
//        //10. Take 2 numbers as input and print the largest number.
//        System.out.println("Enter first number: ");
//        int a = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int b = sc.nextInt();
//        if(a>b){
//            System.out.println(a+" is greater than "+b);
//        }
//        else if(a<b){
//            System.out.println(a+" is smaller than "+b);
//        }
//        else{
//            System.out.println(a+" is equal to "+b);
//        }
//        //11. Input currency in rupees and output in USD.
//        System.out.println("Enter amount in rupees: ");
//        double amt = sc.nextDouble();
//        double usd= amt*0.012 ;
//        System.out.println("Amount in usd: "+usd);
//        //12. To calculate Fibonacci Series up to n numbers.
//        System.out.print("Enter the number of values for fibonacci series: ");
//        int n = sc.nextInt();
//        int first = 0, second = 1;
//        System.out.print("Fibonacci series: " + first);
//        for(int i=1; i<n; i++){
//            System.out.print(" "+second);
//            int next = first + second;
//            first=second;
//            second=next;
//     }
//        //13. To find out whether the given String is Palindrome or not.
//        System.out.print("Enter String: ");
//        String a = sc.nextLine();
//        boolean isPalindrome = true;
//        int length = a.length();
//        for (int i = 0; i < length / 2; i++) {
//            if ((a.charAt(i)) != (a.charAt(length - i - 1))) {
//                isPalindrome = false;
//                break;
//            }
//        }
//        if (isPalindrome) {
//            System.out.println(a + " is a palindrome");
//        } else {
//            System.out.println(a + " is not a palindrome");
//
//        }
//        //14. To check whether a given number is amstrong number or not
//        System.out.print("Enter number: ");
//        int number = sc.nextInt();
//        int original_number = number;
//        int sum = 0;
//        int digits = String.valueOf(number).length();
//        while(number!=0){
//            int r = number%10;
//            sum+= Math.pow(r,digits);
//            number/=10;
//        }
//        if(sum==original_number){
//            System.out.println(original_number+" is an amstrong number");
//        }
//        else{
//            System.out.println(original_number+" is not an amstrong number");
//        }
//        //15.find the nth fibonacci number
//        int a= 0;
//        int b=1;
//        int n=sc.nextInt();
//        int count=2;
//        while (count<=n){
//            int temp=b;
//            b=b+a;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);


            }
        }

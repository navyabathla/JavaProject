import javax.naming.spi.StateFactory;
import java.util.Scanner; //importing package util and class scanner
public class Main{
    public static void main(String[] args){
//        System.out.println("Hello World!"); //prints hello world
//        System.out.println("My first java program!");
          Scanner sc= new Scanner(System.in); //scanner class is used to take input from the user
//        System.out.println(sc.nextInt()); //takes integer input
//        System.out.println(sc.nextDouble()); // takes double as input
//        System.out.println(sc.next()); //takes string input
//        System.out.println(sc.nextLine()); //give an empty line
//        //primitive datatypes
//        int rollno = 113; // integer value
//        char letter = 'r'; // charachter
//        float marks = 45.67f; //decimal value
//        double no = 345678.98765432; //larger decimal values
//        long num = 3456789074658587973L; //larger int values
//        boolean check = false; //true or false value
//
//        System.out.print("Enter your rollno:");
//        int rollno =  sc.nextInt();
//        System.out.println("Your rollno is: " + rollno);
//        int a = 23_000_000; //underscore instead of commas
//        String name = sc.next():

//        print sum of two numbers
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter second number: ");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("Sum is: "+sum);

//        typecasting
//        int a = (int)(67.45f);
//        byte b = (byte)(a);
//        int num = 'A';

//        //if
//        if(true){
//            System.out.println("Hello world!");
//        }
//        int a = 10;
//        if(a==10){
//            System.out.println("a is 10");
//        }
//
//        //while
//        int count = 1;
//        while(count!=5){
//            System.out.println(count);
//            count++;
//        }
//
//        //for
//        for(int i=1; i<5; i++){
//            System.out.println(i);
//        }
//
//        //convert temp in C to temp in F
//        System.out.println("Enter temp in C: ");
//        float tempC = sc.nextFloat();
//        float tempF = (tempC * 9/5) + 32;
//        System.out.println(tempF);


        // print numbers from 1 t
//        for (int i=1;i<=5;i++){
//            System.out.println(i);
//        }

//        int i=1;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }
//        int i= 1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=5);

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        // find the largest number
//        int max = a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.println(max);

//        int max=0;
//        if (a>max){
//            max=a;
//        }else{
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.println(max);
//
//        int max= Math.max(c,Math.max(a,b));
//        System.out.println(max);
//        char ch= sc.next().trim().charAt(0);
//        if(ch >= 'a' && ch<= 'z'){
//            System.out.println("lowercase");
//        }else{
//            System.out.println("uppercase");
//        }

//        //fibonacci series
//        int a=0;
//        int b=1;
//        int n= sc.nextInt();
//        int count=2;
//        while (count<=n){
//            int temp = b;
//            b=b+a;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);

        String fruit = sc.next();
        switch (fruit) {
            case "mango":
                System.out.println("sweet yellow fruit");
                break;
            case  "apple":
                System.out.println("red fruit");
                break;
            case "banana":
                System.out.println("yellow long fruit");
                break;
            case "grapes":
                System.out.println("small green fruit");
                break;
            default:
                System.out.println("enter valid fruit");
        }



    }
}

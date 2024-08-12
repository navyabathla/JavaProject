import java.util.Scanner; //importing package util and class scanner
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World!"); //prints hello world
        System.out.println("My first java program!");
        Scanner sc= new Scanner(System.in); //scanner class is used to take input from the user
        System.out.println(sc.nextInt()); //takes integer input
        System.out.println(sc.nextDouble()); // takes double as input
        System.out.println(sc.next()); //takes string input
        System.out.println(sc.nextLine()); //give an empty line
    }
}
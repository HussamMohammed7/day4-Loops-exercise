import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Exercise (Loop)
//        1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that
//        number.
//        If the number is a multiple of 5, you need to print "Buzz" instead of that
//        number.
//        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
//        instead of that number.

        System.out.println("*************************************************");

        for (int i = 1; i <=100 ; i++) {

            if (i %3==0 && i%5==0 ){
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else if (i%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println("number : " + i);

            }

        }






//        2.Write a Java program to reverse a string.
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse
//        string: xof nworb kciuq ehT
           System.out.println("*************************************************");

        Scanner input2 = new Scanner(System.in) ;

        System.out.println("Enter a word to reverse it : ");
        String string_reverse = input2.nextLine();
        String new_string = "";
        for (int i = string_reverse.length(); i !=0 ; i--) {
            new_string = new_string+string_reverse.charAt(i-1);
        }

        System.out.println("reversed String : "+new_string);

//        3.Write a program to find the factorial value of any number entered
//        through the keyboard.
        System.out.println("*************************************************");
        Scanner input3 = new Scanner(System.in) ;
        System.out.print("Enter a number to find the factorial : ");
        int num = input3.nextInt();
        int fac= 1;
        for (int i = 1; i <=num; i++) {
            fac = fac*i;

        }
        System.out.println("The factorial value " + fac);

//        4.Two numbers are entered through the keyboard. Write a program to find
//        the value of one number raised to the power of another. (Do not use Java
//        built-in method)

        System.out.println("*************************************************");
        Scanner input4 = new Scanner(System.in) ;
        System.out.print("Enter a number raised: ");
        int number = input4.nextInt();
        System.out.print ("Enter the power of :");
        int power = input4.nextInt();
      int sum = number;

        for (int i = 1; i <power; i++) {
            sum = sum * number ;

        }
        System.out.println("The result is : "+ sum);




//        5.Write a program that reads a set of integers, and then prints the sum of
//        the even and odd integers.
        System.out.println("*************************************************");

        Scanner input5 = new Scanner(System.in) ;
        int even_sum = 0 ;
        int odd_sum = 0 ;
        System.out.print("Enter how many number you want : ");
        int user_number = input5.nextInt();
        for (int i = 1; i <=user_number ; i++) {
            System.out.print("Enter number "+i+": ");
            int numbers = input5.nextInt();
            if (numbers%2==0){
                even_sum = even_sum+numbers;
            }else {
                odd_sum = odd_sum +numbers;
            }
        }
        System.out.println("Sum of odd numbers is : "+ odd_sum);
        System.out.println("Sum of even numbers is : "+ even_sum);








//        6.Write a program that prompts the user to input a positive integer. It
//        should then output a message indicating whether the number is a prime
//        number.
        System.out.println("*************************************************");

        Scanner input6 = new Scanner(System.in) ;
        System.out.print("Enter a positive number : ");
        int counter =0;
        int positive_num = input6.nextInt();
        if (positive_num <=0){
            System.out.println("The number should be positive ");
        }else{
            for(int i = 1; i <= positive_num; i++) {
                if (positive_num %i==0){
                    counter++;
                }

            }
            if (counter ==2){
                System.out.println("Number is prime");
            }else{
                System.out.println("Number is Composite ");
            }
        }



//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//        another for loop to print the days (Days 1 -7) for each week.
//        Expected Output:
//        Week 1
//        Day1
//                Day2
//        Day3
//                Day4
//        Day5
//                Day6
//        Day7
//        Week 2
//        Day1
//                Day2
        System.out.println("*************************************************");

        for (int i = 1; i <=4; i++) {
            System.out.println("Week "+i);
            for (int j = 1; j <=7; j++) {
                System.out.println("Day "+j);
            }
        }

//...
//        8.Write a program thats check if the word is a palindrome or not. hint: A
//        string is said to be a palindrome if it is the same if we start reading it from
//        left to right or right to left.
        System.out.println("*************************************************");

        Scanner input8 = new Scanner(System.in) ;
        System.out.println("Enter the string to check if it palindrome or not ");
        String palindrome = input8.nextLine();
        String reverse = "";
        for (int i = palindrome.length(); i !=0 ; i--) {
            reverse = reverse+palindrome.charAt(i-1);
        }
        if (palindrome.equals(reverse)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is NOT palindrome");
        }





    }
}
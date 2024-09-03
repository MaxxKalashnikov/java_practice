
package n;
import java.util.Random;
import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    public void task1() {
        // Ask the user for two integers. By using separate variables print 
        // the sum, product and quotient of the numbers to the console.
        System.out.print("Enter the first number: ");
        Double firstNum = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        Double secondNum = scanner.nextDouble();

        Double sum = firstNum + secondNum;
        Double prod = firstNum * secondNum;

        String quot;

        if(secondNum != 0){
            quot = String.valueOf(firstNum / secondNum);
        }
        else{
            quot = "i can't divide by zero :(";
        }

        System.out.println("The sum of the numbers: " + sum + '\n' + "The product of the numbers: " +
        prod + "\n" + "The quotient of the numbers: " + quot);
    }

    public void task2(){
        // Ask the user for name and age. Print to the console 
        // "Hey <name>! You are <age> years old" (replace with the given information).
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        System.out.println("Hey " + name + "! You are " + age + " years old");
    }

    public void task3(){
        // Use the variables given by the user in task 1 directly in the println method, 
        // so that the program prints both the invoice and the result. E.g. "3 + 2 = 5"
        System.out.print("Enter the first number: ");
        Double firstNum = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        Double secondNum = scanner.nextDouble();

        Double sum = firstNum + secondNum;
        Double prod = firstNum * secondNum;

        String quot;

        if(secondNum != 0){
            quot = String.valueOf(firstNum / secondNum);
        }
        else{
            quot = "i can't divide by zero :(";
        }

        System.out.println(firstNum + " + " + secondNum + " = " + sum + '\n' + firstNum + " * " + secondNum +
        " = " + prod + "\n" + firstNum + " / " + secondNum + " = " + quot);
    }

    public void task4(){
        // Write a program that asks for an amount in dollars and converts it to euros. 
        // Find the exchange rate online and define it as constant (keyword final).
        System.out.print("This is money converter.\nPlease enter the amount of money in dollars to convert to euros: ");
        Double dollar = scanner.nextDouble();

        final double rate = 0.89727;

        System.out.println("You will get " + (dollar * rate) + " euros");
    }

    public void task5(){
        // Write a program that calculates a person's body mass index. Find the necessary formula online, 
        // and first, store the values ​​used in variables. Print the body mass index to the console. 
        // Use fractional number (floating point data type) variables.
        System.out.print("BMI calculator.\nEnter your weight: ");
        Float weight = scanner.nextFloat();

        System.out.print("Enter your height (in meters): ");
        Float height = scanner.nextFloat();

        Float bmi = weight / (float)Math.pow(height, 2);

        System.out.println("Your BMI is " + bmi);
    }

    public void task6(){
        // Write a program that calculates and prints the area of ​​a rectangle, square and circle. 
        // Give the variables the values ​​of your choice. (Constant for Pi is defined in Math.PI)
        int width = 10;
        int height = 5;
        int side = 4;
        int radius = 7;

        int rect = width * height;
        int square = side * side;
        double circle = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the rectangle is " + rect + ", square - " + square + ", circle - " + circle);
    }
    public void task7(){
        // Ask the user the number of apples. Print how many apples are left, 
        // when they are divided equally among five people (modulo operator).
        System.out.print("How many apples do you have? ");
        int apples = scanner.nextInt();

        int left = apples % 5;
        System.out.print("There are " + left + " apples left after we divided them among five people");
    }

    public void task8(){
        // Ask Matt how much money he has and how many children he has. 
        // Then Matt divides the money equally among the children to the nearest euro, 
        // but he keeps the remainder (cents) for himself. Print out how much money Matt has. 
        System.out.print("Hello Matt! How much money do you have? ");
        Double money = scanner.nextDouble();

        System.out.print("How many children do you have? ");
        int child = scanner.nextInt();

        // Modify the previous task in such a way that Matt keeps the amount of money that goes over 
        // 50 euros and splits the rest among the children equally. Print out how much money Matt now has.
        if(money > 50){
           double newMoney = money - 50;
           int newRem = 50 % child;
           newMoney += newRem;

           System.out.println("Matt now keeps: " + newMoney + " euros, while the rest 50 euros are divided between children");
        }else{
            int moneyChild = (int)(money/child);

            double remain = money % child;

            String formattedNumber = String.format("%.2f", remain);

            System.out.println("Each child gets: " + moneyChild + " euros");
            System.out.println("Matt keeps: " + formattedNumber + " euros");
        }
    }

    public void task9(){
        // Generate a random number between 0-100, but in such a way that the number is 
        // divisible by five. E.g. allowed random numbers are 0, 5, 10, 15, .., 100
        Random rnd = new Random();

        int num = rnd.nextInt(21)*5;
        System.out.println(num);
    }
        // task10
        // Which of the following statements are true:
        // 5 == 6 false
        // 5 > 6 false
        // 4 <= 4 true
        // 6 > 0 true
        // (5 == 6) || (6 == 6) true
        // (5 > 6) && (7 > 5) false
        // (4 <= 4) && (2 < 1) false
        // (6 > 0) && (1 == 0)false
        
        // task11
        // What condition should you use to test whether a number is between 0-10?
        // if((x >= 0) && (x <= 10))

        // task12
        // What condition should you use to test if the number is negative or greater than 100?
        // if((x < 0) || (x > 100))

        // task13
        // Matt's score is M, Sara's score is S and Tina's score is T. 
        // Make a logical expression that returns true if Sara's score is not 
        // greater than anyone's score, and also Tina's score is greater  
        // than Matt's score and no two scores must be the same.
        // (s <= m) && (s <= t) && (t > m) && (s != m) && (s != t) (m != t)
        
        public void task10(){
            // Ask the user for a score. If the score is less than 10, 
            // "Your result could be improved" is printed. Otherwise, 
            // "Good result!" is printed.
            System.out.print("Enter your p1 score: ");
            Integer scoreP1 = scanner.nextInt();

            System.out.print("Enter your p2 score: ");
            Integer scoreP2 = scanner.nextInt();

            if(scoreP1 > scoreP2){
                System.out.print("P1 wins!");
            }else if(scoreP1 < scoreP2){
                System.out.print("P2 wins1");
            }else System.out.print("It is a tie game!");
        }

        public void task11(){
            // Print the word "Welcome" three times.
            // Print numbers 1-3.
            // The multiplication table of five (1*5 ...9*5) is printed.
            for(int i = 0; i < 3; i++){
                System.out.println("Welcome");
            }
            System.out.println();
            for(int i = 0; i < 3; i++){
                System.out.println(i+1);
            }
            System.out.println();
            for(int i = 0; i < 9; i++){
                System.out.println((i+1) + " * " + 5 + " = " + ((i + 1)*5));
            }
            System.out.println();
            // Print the even numbers between 0 and 20 using a while loop.
            Integer x = 0;
            while(x <= 20){
                if(x % 2 == 0){
                    System.out.println(x);
                }
                x++;
            }
        }
        public void task12(){
        // Ask the user for a number until he gives the value 0.
            int num;  

            do {
                System.out.print("Enter a number: ");
                num = scanner.nextInt();  
            } while (num != 0);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose the task (1-9): ");
        Integer choice = scanner.nextInt();

        App app = new App();

        switch (choice) {
            case 1:
            app.task1();
                break;
            case 2:
            app.task2();
                break;
            case 3:
            app.task3();
                break;
            case 4:
            app.task4();
                break;
            case 5:
            app.task5();
                break;
            case 6:
            app.task6();
                break;
            case 7:
            app.task7();
                break;
            case 8:
            app.task8();
                break;
            case 9:
            app.task9();
                break;
            case 10:
            app.task10();
                break;
            case 11:
            app.task11();
                break;
            case 12:
            app.task12();
                break;
            default:
                break;
        }
    }
}

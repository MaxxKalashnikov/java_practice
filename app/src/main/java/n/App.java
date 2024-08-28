
package n;
import java.util.Scanner;

public class App {
    public void task1() {
        // Ask the user for two integers. By using separate variables print 
        // the sum, product and quotient of the numbers to the console.
        Scanner scanner = new Scanner(System.in);
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        System.out.println("Hey " + name + "! You are " + age + " years old");
    }

    public void task3(){
        // Use the variables given by the user in task 1 directly in the println method, 
        // so that the program prints both the invoice and the result. E.g. "3 + 2 = 5"
        Scanner scanner = new Scanner(System.in);
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("This is money converter.\nPlease enter the amount of money in dollars to convert to euros: ");
        Double dollar = scanner.nextDouble();

        final double rate = 0.89727;

        System.out.println("You will get " + (dollar * rate) + " euros");
    }

    public void task5(){
        // Write a program that calculates a person's body mass index. Find the necessary formula online, 
        // and first, store the values ​​used in variables. Print the body mass index to the console. 
        // Use fractional number (floating point data type) variables.
        Scanner scanner = new Scanner(System.in);
        System.out.print("BMI calculator.\nEnter your weight: ");
        Float weight = scanner.nextFloat();

        System.out.print("Enter your height (in meters): ");
        Float height = scanner.nextFloat();

        Float bmi = weight / (float)Math.pow(height, 2);

        System.out.println("Your BMI is " + bmi);
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
            default:
                break;
        }
    }
}

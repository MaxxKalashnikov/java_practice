
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
        
            default:
                break;
        }
    }
}

package program;

import java.util.Scanner;

import exceptions.NumbersAreSameException;
import exceptions.SizeNumberException;
import tools.Counter;

public class Application {

    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();
        Scanner input = new Scanner(System.in);
        
        System.out.println("The first number must be greater than the second \n Enter two numbers \n");

        System.out.print("Number one: ");
        Integer numberOne = input.nextInt();
        input.nextLine();

        System.out.print("Number two: ");
        Integer numberTwo = input.nextInt();
        input.nextLine();

        try {
            counter.printNumbers(numberOne, numberTwo);
            
        } catch(SizeNumberException e) {
            System.out.println(e.getMessage());

        } catch(NumbersAreSameException e){
            System.out.println(e.getMessage());
        }
    }
}

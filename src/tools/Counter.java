package tools;

import exceptions.SizeNumberException;
import exceptions.NumbersAreSameException;

public class Counter {

    public void printNumbers(Integer numberOne, Integer numberTwo) throws SizeNumberException, NumbersAreSameException {

        Integer number = countNumbers(numberOne, numberTwo);

        for(int index = 1; index <= number; index++) {
            System.out.printf("imprimindo número " + index + "\n");
        }

    }
    
    private Integer countNumbers(Integer numberOne, Integer numberTwo) throws SizeNumberException, NumbersAreSameException{
        
        validateNumbers(numberOne, numberTwo);

        return numberOne - numberTwo;
        
    }

    private void validateNumbers(Integer numberOne, Integer numberTwo) throws SizeNumberException, NumbersAreSameException{
        if (numberOne < numberTwo) {
            throw new SizeNumberException("The first number bigger then second number!");
        }
        if (numberOne.equals(numberTwo)) {
            throw new NumbersAreSameException("The numbers are the same!");
        }
    }
}

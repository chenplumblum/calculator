package command;

import lombok.Data;

@Data
public class CalculatorCommand extends Command{
    
    private Calculator calculator;
    
    private char operator;

    private int number;

    CalculatorCommand(Calculator calculator, char operator, int number) {
        super();
        this.calculator = calculator;
        this.operator = operator;
        this.number = number;
    }



    @Override
    public void execute() {
        calculator.operation(operator, number);

    }

    @Override
    public void unexecute() {
        calculator.operation(undo(operator), number);

    }

    /**
     * @param operator2
     * @return
     */
    private char undo(char operator2) {
        char ch = 0;
        switch(operator2) {
            case '+':ch='-';break;
            case '-':ch='+';break;
            case '*':ch='/';break;
            case '/':ch='*';break;
        }
        return ch;
    }
}

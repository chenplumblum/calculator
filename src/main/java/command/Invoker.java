package command;

import java.util.ArrayList;

public class Invoker {

    /**
     * 计算类
     */
    private final Calculator calculator=new Calculator();
    /**
     * 存储命令
     */
    private ArrayList<Command> commands=new ArrayList<Command>();
    /**
     * 计算次数
     */
    private static  int current=0;

    public void redo(int levels) {
        System.out.println(levels);
        for(int i=0;i<levels;i++) {
            if(current<commands.size()-1) {
                commands.get(i).execute();
                current++;
            }
        }
    }
    public void undo(int levels) {
        System.out.println(levels);
        for(int i=0;i<levels;i++) {
            if(current>0) {
                --current;
                commands.get(i).execute();
            }
        }
    }

    /**
     * 进行计算
     * @param operator 操作符号
     * @param number  数字
     */
    public void compute(char operator,int number) {
        Command command =new CalculatorCommand(calculator, operator, number);
        command.execute();

        commands.add(command);
        current++;
    }

}

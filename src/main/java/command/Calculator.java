package command;


/**
 * 计算工具类
 */
public class Calculator {

    private int total=0;

    public void operation(char operator,int number) {
        int start = total;

        switch(operator) {
            case '+':total+=number;
                break;
            case '-':total-=number;
                break;
            case '*':total*=number;
                break;
            case '/':total/=number;
                break;
        }
        System.out.println(start+" "+operator+" "+number+" ="+total);
    }
}

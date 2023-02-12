package command;


public class Main {
    public static void main(String[] args) {
        Invoker invoker=new Invoker();
        //初始化为0
        invoker.compute('+', 500);
        invoker.compute('-', 50);
        invoker.compute('*', 20);
        invoker.compute('/', 2);

        invoker.redo(3);
        invoker.undo(2);
    }
}

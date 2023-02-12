package command;


public class Main {
    public static void main(String[] args) {
        User user =new User();
        //初始化为0
        user.compute('+', 500);
        user.compute('-', 50);
        user.compute('*', 20);
        user.compute('/', 2);

        user.redo(3);
        user.undo(2);
    }
}

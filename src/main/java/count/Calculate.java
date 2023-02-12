package count;

import com.googlecode.aviator.AviatorEvaluator;

import java.util.LinkedList;

public class Calculate {

    public static  final UndoableImpl undoable = new UndoableImpl();


    public  Long add(Long num1,Long num2){
        String s = num1 + "+" + num2;
        Object execute = AviatorEvaluator.execute(s, null, true);


        String undoLog = "+" + num2;
        String redoLog = "-" + num2;

        undoable.undo(execute+undoLog,undoLog);
        undoable.redo(execute+redoLog,redoLog);

        return (Long) execute;
    }

    public  Long undo(){
        LinkedList<String> undoList = undoable.getUndoList();
        String s = undoList.getLast();

        Object execute = AviatorEvaluator.execute(s, null, true);

        String undoLog = undoable.getUndo();
        String redoLog = undoable.getRedo();

        undoable.undo(execute+undoLog,undoLog);
        undoable.redo(execute+redoLog,redoLog);

        return (Long) execute;
    }

    public  Long redo(){
        LinkedList<String> redoList = undoable.getRedoList();
        String redo = redoList.removeLast();
        Object execute = AviatorEvaluator.execute(redo, null, true);


        String undoLog = undoable.getUndo();
        String redoLog = undoable.getRedo();
        undoable.undo(execute+undoLog,undoLog);
        undoable.redo(execute+redoLog,redoLog);
        return (Long) execute;
    }



    public  Long reduce(Long num1,Long num2){
        Object execute = AviatorEvaluator.execute(num1 + "-" + num2, null, true);
        return (Long) execute;
    }

    public  Long multiply(Long num1,Long num2){
        Object execute = AviatorEvaluator.execute(num1 + "+" + num2, null, true);
        return (Long) execute;
    }
    public  Long divide(Long num1,Long num2){
        Object execute = AviatorEvaluator.execute(num1 + "/" + num2, null, true);
        return (Long) execute;
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Long add = calculate.add(1L, 2L);
        Long admijgn = calculate.add(1L, 3L);
//        Long undo = calculate.undo();
//        Long undo1 = calculate.undo();

        Long redo = calculate.redo();
        Long redo1 = calculate.redo();

        System.out.println();
    }
}

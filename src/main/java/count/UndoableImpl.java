package count;

import lombok.Data;

import java.util.LinkedList;

@Data
public class UndoableImpl {

    public static final LinkedList<String> undoList = new LinkedList<>();

    public static final LinkedList<String> redoList = new LinkedList<>();

    public String undo;

    public String redo;

    public void undo(String test,String undo) {
        this.undo = undo;
        undoList.add(test);
    }


    public void redo(String test,String redo) {
        this.redo = redo;
        redoList.add(test);
    }

    /**
     *
     * @param test
     * @param redo
     */
    public void doList(String test,String undo,String redo) {
        this.redo = redo;
        redoList.add(test);
    }

    public static LinkedList<String> getUndoList() {
        return undoList;
    }

    public static LinkedList<String> getRedoList() {
        return redoList;
    }
}

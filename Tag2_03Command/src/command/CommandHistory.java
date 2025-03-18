package command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {

    private Deque<Command> undoStack = new ArrayDeque<Command>();
    private Deque<Command> redoStack = new ArrayDeque<Command>();
    public void addCommand(Command command) {
        if(command == null) return;
        if(! command.isUndoable()) return;
        redoStack.clear();
        undoStack.push(command);
    }

    public void undo() {
        if(undoStack.isEmpty()) {
            System.out.println("can't undo");
        } else {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void redo() {
        if(redoStack.isEmpty()) {
            System.out.println("can't redo");
        } else {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        }
    }

}

package command;

public class CommandHistory {

    public void addCommand(Command command) {
        if(command == null) return;
        if(! command.isUndoable()) return;
        // Implementieren des Hinzufuegens
    }

    public void undo() {
        System.out.println("can't undo");
    }

    public void redo() {
        System.out.println("can't redo");
    }

}

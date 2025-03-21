package main;

import command.Command;
import command.CommandFactory;
import command.CommandHistory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("#>");
            String zeile = scanner.nextLine();
            if (zeile.equals("ende")) break;
            if (zeile.equals("undo")) {
                history.undo();
                continue;
            }
            if (zeile.equals("redo")) {
                history.redo();
                continue;
            }
            Command command = CommandFactory.createCommand(zeile);
            if(command == null) continue;
            command.execute();
            history.addCommand(command);
        }
    }
}
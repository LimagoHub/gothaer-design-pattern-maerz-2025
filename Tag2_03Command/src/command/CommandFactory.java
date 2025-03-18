package command;

public class CommandFactory {

    public static Command createCommand(String zeile) {
        try {
            Command command = null;
            String [] tokens = zeile.split(" ");
            if(tokens.length == 0) return null;
            if(tokens[0].equals("Add")) {
                command = new AddCommand();
                command.parse(tokens);
            }
            if(tokens[0].equals("Print")) {
                command = new PrintCommand();
                command.parse(tokens);
            }
            return command;
        } catch (Throwable e) {
            System.out.println("Unbekannter Befehl: " + zeile);
            return null;
        }
    }
}

package command;

public class CommandFactory {

    private static final String PREFIX = "command.";
    private static final String SUFFIX = "Command";

    public static Command createCommand(String zeile) {
        try {
            Command command = null;
            String [] tokens = zeile.split(" ");
            if(tokens.length == 0) return null;
            command = (Command) Class.forName(PREFIX + tokens[0] + SUFFIX).getConstructor().newInstance();
            command.parse(tokens);
            return command;
        } catch (Throwable e) {
            System.out.println("Unbekannter Befehl: " + zeile);
            return null;
        }
    }
}

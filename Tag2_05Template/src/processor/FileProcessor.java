package processor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    private List<CharacterHandler> handlers = new ArrayList<>();

    public void addCharacterHandler(final CharacterHandler handler) {
        handlers.add(handler);
    }

    public void removeCharacterHandler(final CharacterHandler handler) {
        handlers.remove(handler);
    }

    public final void run(String fileName) {


        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            init();
            int c;
            while ((c = br.read()) != -1) {
                process((char) c);
            }
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {
        handlers.forEach(CharacterHandler::init);
    }
    private void dispose() {
        handlers.forEach(CharacterHandler::dispose);
    }
    private void process(final char c){
        handlers.forEach(handler -> handler.process(c));
    }
}

package processor;

import java.io.BufferedReader;
import java.io.FileReader;

public abstract class AbstractFileProcessor {

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

    public void init() {/*Ok*/}
    public void dispose() {/*Ok*/}
    public abstract void process(char c);
}

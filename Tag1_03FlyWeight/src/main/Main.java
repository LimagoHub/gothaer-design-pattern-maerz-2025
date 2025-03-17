package main;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        StringBuilder stringBuffer = new StringBuilder();
        System.out.println("Start");
        Instant start = Instant.now();
        for(int i = 0; i < 2_000_000; i++) {
            stringBuffer.append( "A");
        }
        String string = stringBuffer.toString();
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println(duration.toMillis());
    }
}
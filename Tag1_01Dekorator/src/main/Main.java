package main;


import client.CalcClient;
import math.Calculator;
import math.CalculatorImpl;
import math.CalculatorLogger;
import math.CalculatorSecure;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {


        Instant start = Instant.now();

        // ...
        Instant ende = Instant.now();

        Duration duration = Duration.between(start, ende);
        System.out.println(duration.toMillis());



        Calculator calculator = new CalculatorImpl();
        calculator = new CalculatorLogger(calculator);
        calculator = new CalculatorSecure(calculator);
        CalcClient client = new CalcClient(calculator);
        client.go();
    }
}
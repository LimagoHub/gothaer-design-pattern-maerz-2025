package main;


import client.CalcClient;
import math.*;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        CalculatorFactory.setLogger(true);
        CalculatorFactory.setSecure(true);
        Calculator calculator = CalculatorFactory.createCalculator();
        CalcClient client = new CalcClient(calculator);
        client.go();
    }
}
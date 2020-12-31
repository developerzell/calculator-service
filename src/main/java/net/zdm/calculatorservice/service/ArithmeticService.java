package net.zdm.calculatorservice.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {

    public Float add(Float a, Float b) { return a + b; }
    public Float subtract(Float a, Float b) { return a - b; }
    public Float multiply(Float a, Float b) {
        return a * b;
    }
    public Float divide(Float a, Float b) {
        return a / b;
    }
}

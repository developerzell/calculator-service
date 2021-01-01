package net.zdm.calculatorservice.service;

import net.zdm.calculatorservice.ArithmeticConstants;
import net.zdm.calculatorservice.domain.ArithmeticHistoryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class ArithmeticService {

    @Autowired
    ArithmeticHistoryService arithmeticHistoryService;

    public Float add(Float a, Float b) {
        Float value = a + b;
        arithmeticHistoryService.updateHistory(ArithmeticConstants.ADDITION_CHARACTER, a, b, value);
        return value;
    }
    public Float subtract(Float a, Float b) {
        Float value = a - b;
        arithmeticHistoryService.updateHistory(ArithmeticConstants.SUBTRACTION_CHARACTER, a, b, value);
        return value;
    }
    public Float multiply(Float a, Float b) {
        Float value = a * b;
        arithmeticHistoryService.updateHistory(ArithmeticConstants.MULTIPLICATION_CHARACTER, a, b, value);
        return value;
    }
    public Float divide(Float a, Float b) {
        Float value = a / b;
        arithmeticHistoryService.updateHistory(ArithmeticConstants.DIVISION_CHARACTER, a, b, value);
        return value;
    }

    public Stack<ArithmeticHistoryRecord> getHistory() {
        return arithmeticHistoryService.getHistory();
    }
}

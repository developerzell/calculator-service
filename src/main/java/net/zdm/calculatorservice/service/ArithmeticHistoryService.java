package net.zdm.calculatorservice.service;

import net.zdm.calculatorservice.domain.ArithmeticHistoryRecord;
import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class ArithmeticHistoryService {

    private Stack<ArithmeticHistoryRecord> arithmeticHistoryStack = new Stack<>();

    protected void updateHistory(Character operand, Float a, Float b, Float result) {
        arithmeticHistoryStack.add(new ArithmeticHistoryRecord(operand, a, b, result));
    }

    protected Stack<ArithmeticHistoryRecord> getHistory() {
        System.out.println(arithmeticHistoryStack.toString());
        return arithmeticHistoryStack;
    }
}

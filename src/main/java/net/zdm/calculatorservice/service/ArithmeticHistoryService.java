package net.zdm.calculatorservice.service;

import net.zdm.calculatorservice.domain.ArithmeticHistoryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArithmeticHistoryService {

    @Autowired
    private ArithmeticHistoryRecord arithmeticHistoryRecord;

    public void updateHistory(Character operand, Float a, Float b, Float result) {

    }
}

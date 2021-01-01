package net.zdm.calculatorservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
public class ArithmeticHistoryRecord {

    private Character operand;
    private Float leftOperand;
    private Float rightOperand;
    private Float value;
}

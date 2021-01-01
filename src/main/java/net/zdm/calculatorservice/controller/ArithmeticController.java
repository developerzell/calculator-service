package net.zdm.calculatorservice.controller;

import net.zdm.calculatorservice.domain.ArithmeticHistoryRecord;
import net.zdm.calculatorservice.service.ArithmeticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Stack;

@RestController
@CrossOrigin("*")
@RequestMapping("arithmetic")
public class ArithmeticController {
    @Autowired
    ArithmeticService arithmeticService;

    @GetMapping("add")
    public Float add(
            @RequestParam(value = "a", defaultValue = "0") Float left,
            @RequestParam(value = "b", defaultValue = "0") Float right)
    {
        Float result = arithmeticService.add(left, right);
        System.out.printf("%s + %s = %s\n", left, right, result);
        return result;
    }

    @GetMapping("subtract")
    public Float subtract(
            @RequestParam(value = "a", defaultValue = "0") Float left,
            @RequestParam(value = "b", defaultValue = "0") Float right)
    {
        Float result = arithmeticService.subtract(left, right);
        System.out.printf("%s - %s = %s\n", left, right, result);
        return result;
    }

    @GetMapping("multiply")
    public Float multiply(
            @RequestParam(value = "a", defaultValue = "0") Float left,
            @RequestParam(value = "b", defaultValue = "0") Float right)
    {
        Float result = arithmeticService.multiply(left, right);
        System.out.printf("%s x %s = %s\n", left, right, result);
        return result;
    }

    @GetMapping("divide")
    public Float divide(
            @RequestParam(value = "a", defaultValue = "0") Float left,
            @RequestParam(value = "b", defaultValue = "0") Float right)
    {
        Float result = arithmeticService.divide(left, right);
        System.out.printf("%s / %s = %s\n", left, right, result);
        return result;
    }

    @GetMapping("history")
    public Stack<ArithmeticHistoryRecord> getHistory() {
        return arithmeticService.getHistory();
    }
}

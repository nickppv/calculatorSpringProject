package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exception.DivideByZeroException;

@Service
public class CalculatorService implements CalculatorServiceInterface {

    public String calculatorMain() {
        return "<h1 style='color: hotpink'>Добро пожаловать в калькулятор!</h1>";
    }

    public String calculatorSum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ("Ошибка".repeat(60) + "\n").repeat(80);
        }
        return String.format("<h3>Результат сложения %d и %d равен %d</h3>", num1, num2, num1 + num2);
    }

    public String calculatorDiff(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ("Ошибка".repeat(60) + "\n").repeat(80);
        }
        return String.format("<h3>Результат вычитания %d и %d равен %d</h3>", num1, num2, num1 - num2);
    }

    public String calculatorMul(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ("Ошибка".repeat(60) + "\n").repeat(80);
        }
        return String.format("<h3>Результат умножения %d и %d равен %d</h3>", num1, num2, num1 * num2);
    }

    public String calculatorDiv(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ("Ошибка".repeat(60) + "\n").repeat(80);
        }
        if (num2 == 0) {
            throw new DivideByZeroException("Деление на ноль.");
        }
        return String.format("<h3>Результат деления %d и %d равен %d</h3>", num1, num2, num1 / num2);
    }
}


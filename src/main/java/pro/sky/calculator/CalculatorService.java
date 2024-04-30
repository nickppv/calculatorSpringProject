package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface{

    public String calculatorMain() {
        return "<h1 style='color: hotpink'>Добро пожаловать в калькулятор!</h1>";
    }

    public String calculatorSum(int num1, int num2) {
        return String.format("<h3>Результат сложения %d и %d равен %d</h3>", num1, num2, num1 + num2);
    }

    public String calculatorDiff(int num1, int num2) {
        return String.format("<h3>Результат вычитания %d и %d равен %d</h3>", num1, num2, num1 - num2);
    }

    public String calculatorMul(int num1, int num2) {
        return String.format("<h3>Результат умножения %d и %d равен %d</h3>", num1, num2, num1 * num2);
    }

    public String calculatorDiv(int num1, int num2) {
        double result;
        try {
            result = num1 / (double)num2;
            if (Double.isInfinite(result)) {
                throw (new ArithmeticException());
            }
            return String.format("<h3>Результат деления " + result);
        } catch (ArithmeticException exception) {
            return "Ошибка. Деление на ноль.".repeat(1000);
        }
    }
}


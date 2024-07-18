package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.DivideByZeroException;
import pro.sky.calculator.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    void calculatorMain() {
        String expectedString = "<h1 style='color: hotpink'>Добро пожаловать в калькулятор!</h1>";
        String getString = calculatorService.calculatorMain();
        assertEquals(expectedString, getString);
    }

    @Test
    void calculatorSum() {
        int num1 = 8;
        int num2 = 4;
        String expectedResult = "<h3>Результат сложения 8 и 4 равен 12</h3>";
        String getResult = calculatorService.calculatorSum(num1, num2);
        assertEquals(expectedResult, getResult);
    }

    @Test
    void calculatorDiff() {
        int num1 = 8;
        int num2 = 4;
        String expectedResult = "<h3>Результат вычитания 8 и 4 равен 4</h3>";
        String getResult = calculatorService.calculatorDiff(num1, num2);
        assertEquals(expectedResult, getResult);
    }

    @Test
    void calculatorMul() {
        int num1 = 8;
        int num2 = 4;
        String expectedResult = "<h3>Результат умножения 8 и 4 равен 32</h3>";
        String getResult = calculatorService.calculatorMul(num1, num2);
        assertEquals(expectedResult, getResult);
    }

    @Test
    void calculatorDiv() {
        int num1 = 8;
        int num2 = 4;
        String expectedResult = "<h3>Результат деления 8 и 4 равен 2</h3>";
        String getResult = calculatorService.calculatorDiv(num1, num2);
        assertEquals(expectedResult, getResult);
    }

    @Test
    void calculatorDivByZero() {
        int num1 = 8;
        int num2 = 0;
        assertThrows(DivideByZeroException.class, () -> calculatorService.calculatorDiv(num1, num2));
    }
}
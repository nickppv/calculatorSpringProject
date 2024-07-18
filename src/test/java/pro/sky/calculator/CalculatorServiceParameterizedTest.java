package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import pro.sky.calculator.service.CalculatorService;

import java.util.stream.Stream;

public class CalculatorServiceParameterizedTest {
    private final CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> provideArguments() {
        return Stream.of(
            Arguments.of(9, 3),
            Arguments.of(12, 4),
            Arguments.of(5, 1),
            Arguments.of(200, 100),
            Arguments.of(-9, 3));
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void calculateSumParameterizedTest(int num1, int num2) {
        String expectedResult = String.format("<h3>Результат сложения %d и %d равен %d</h3>", num1, num2, num1 + num2);
        String result = calculatorService.calculatorSum(num1, num2);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void calculateDiffParameterizedTest(int num1, int num2) {
        String expectedResult = String.format("<h3>Результат вычитания %d и %d равен %d</h3>", num1, num2, num1 - num2);
        String result = calculatorService.calculatorDiff(num1, num2);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void calculateMulParameterizedTest(int num1, int num2) {
        String expectedResult = String.format("<h3>Результат умножения %d и %d равен %d</h3>", num1, num2, num1 * num2);
        String result = calculatorService.calculatorMul(num1, num2);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void calculateDivParameterizedTest(int num1, int num2) {
        String expectedResult = String.format("<h3>Результат деления %d и %d равен %d</h3>", num1, num2, num1 / num2);
        String result = calculatorService.calculatorDiv(num1, num2);
        assertEquals(expectedResult, result);
    }
}

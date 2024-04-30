package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculator() {
        return calculatorService.calculatorMain();
    }

    @GetMapping(path = "/plus")
    public String calculatorSum(@RequestParam(value = "num1", required = false) Integer num1,
                                @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.calculatorSum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculatorDiff(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.calculatorDiff(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMul(@RequestParam(value = "num1", required = false) Integer num1,
                                @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.calculatorMul(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculatorDiv(@RequestParam(value = "num1", required = false) Integer num1,
                                @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.calculatorDiv(num1, num2);
    }
}

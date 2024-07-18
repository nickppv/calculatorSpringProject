package pro.sky.calculator.exception;

public class DivideByZeroException extends IllegalArgumentException{
    public DivideByZeroException(String str) {
        super(str);
    }

}

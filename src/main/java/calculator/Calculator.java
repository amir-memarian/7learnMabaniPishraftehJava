package calculator;

public class Calculator {

    public String add(final String adadAval, final String adadDovom) {
        final double num1 = Double.parseDouble(adadAval);
        final double num2 = Double.parseDouble(adadDovom);
        final double result = num1 + num2;
        return String.valueOf(result);
    }
}

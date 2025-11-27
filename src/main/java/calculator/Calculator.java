package calculator;

public class Calculator {

    public String add(String adadAval, String adadDovom) {
        double num1 = Double.parseDouble(adadAval);
        double num2 = Double.parseDouble(adadDovom);
        double result = num1 + num2;
        return String.valueOf(result);
    }
}

package calculator;

public class Calculator {

    public String add(final String adadAval, final String adadDovom) {
        double num1,num2;
        try{
            num1 = Double.parseDouble(adadAval);
            num2 = Double.parseDouble(adadDovom);

        } catch (NumberFormatException nfe){
            System.out.println("Adade vared shode ghabel gabol nist.");
            throw nfe;
        }
        final double result = num1 + num2;
        return String.valueOf(result);
    }
}

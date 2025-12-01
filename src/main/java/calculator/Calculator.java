package calculator;

import java.io.IOException;

public class Calculator {

    public String add(final String adadAval, final String adadDovom) {
        double num1, num2;
        try {
            num1 = Double.parseDouble(adadAval);
            num2 = Double.parseDouble(adadDovom);

//        } catch (NumberFormatException | IndexOutOfBoundsException nfe) {
        } catch (NumberFormatException nfe) {
            System.out.println("Adade vared shode ghabel gabol nist.");
            throw nfe;
        } catch (Exception e){
            System.out.println("Yek khataye ghayer ghabel pishbini r system rokh dad.");
            throw e;
        }finally {
            System.out.println("lotfan Dobareh emtehan konid..");
        }
        final double result = num1 + num2;
        return String.valueOf(result);
    }
}

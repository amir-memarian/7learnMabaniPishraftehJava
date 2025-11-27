package calculator;

import javax.swing.*;

public class CalculatorUI {

    private static JTextField result;
    private static String adadAval;

    public static void main(String[] args) {
        JFrame mashinHesab = new JFrame("Mashin Hesab");

        //JTextField result = new JTextField();
        result = new JTextField();
        result.setBounds(0,0,150,50);
        result.setEditable(false);

        JButton cancle = getJButton("C", 150, 0);
        JButton one = getJButton("1", 0, 50);
        JButton two = getJButton("2", 50, 50);
        JButton three = getJButton("3", 100, 50);
        JButton plus = getJButton("+", 150, 50);
        JButton four = getJButton("4", 0, 100);
        JButton five = getJButton("5", 50, 100);
        JButton six = getJButton("6", 100, 100);
        JButton minus = getJButton("-", 150, 100);
        JButton seven = getJButton("7", 0, 150);
        JButton eight = getJButton("8", 50, 150);
        JButton nine = getJButton("9", 100, 150);
        JButton multiply = getJButton("*", 150, 150);
        JButton point = getJButton(".", 0, 200);
        JButton zero = getJButton("0", 50, 200);
        JButton equal = getJButton("=", 100, 200);
        JButton division = getJButton("/", 150, 200);

        mashinHesab.add(result);
        mashinHesab.add(cancle);
        mashinHesab.add(one);
        mashinHesab.add(two);
        mashinHesab.add(three);
        mashinHesab.add(plus);
        mashinHesab.add(four);
        mashinHesab.add(five);
        mashinHesab.add(six);
        mashinHesab.add(minus);
        mashinHesab.add(seven);
        mashinHesab.add(eight);
        mashinHesab.add(nine);
        mashinHesab.add(multiply);
        mashinHesab.add(point);
        mashinHesab.add(zero);
        mashinHesab.add(equal);
        mashinHesab.add(division);


        mashinHesab.setSize(600,600);
        mashinHesab.setVisible(true);
        mashinHesab.setLayout(null);


    }

    private static JButton getJButton(String lable, int xPosition, int yPosition) {
        JButton button = new JButton(lable);
        button.setBounds(xPosition, yPosition, 50, 50);
        if(lable.equals("C")){
            button.addActionListener(event -> result.setText(""));

        }else if(lable.equals("+")) {
            button.addActionListener(event -> {
                adadAval = result.getText();
                result.setText("");

            });
        }else if(lable.equals("=")) {
            Calculator calculator = new Calculator();
            String total = calculator.add(adadAval,result.getText());
            result.setText(total);

        }else{
            button.addActionListener(event -> result.setText(result.getText() + button.getText()));
        }
        return button;
    }

}

package calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorUI {

    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;


    private static JTextField result;
    private static String adadAval;

    public static void main(String[] args) {
        JFrame mashinHesab = new JFrame("Mashin Hesab");
        mashinHesab.setLayout(null);

        result = new JTextField();
        result.setBounds(0,0,WIDTH*3,HEIGHT);
        result.setEditable(true);
        result.setText("");

        JButton cancle = getJButton("C", WIDTH*3, 0);
        JButton one = getJButton("1", 0, HEIGHT);
        JButton two = getJButton("2", WIDTH, HEIGHT);
        JButton three = getJButton("3", WIDTH*2, HEIGHT);
        JButton plus = getJButton("+", WIDTH*3, HEIGHT);
        JButton four = getJButton("4", 0, HEIGHT*2);
        JButton five = getJButton("5", WIDTH, HEIGHT*2);
        JButton six = getJButton("6", WIDTH*2, HEIGHT*2);
        JButton minus = getJButton("-", WIDTH*3, HEIGHT*2);
        JButton seven = getJButton("7", 0, HEIGHT*3);
        JButton eight = getJButton("8", WIDTH, HEIGHT*3);
        JButton nine = getJButton("9", WIDTH*2, HEIGHT*3);
        JButton multiply = getJButton("*", WIDTH*3, HEIGHT*3);
        JButton point = getJButton(".", 0, HEIGHT*4);
        JButton zero = getJButton("0", WIDTH, HEIGHT*4);
        JButton equal = getJButton("=", WIDTH*2, HEIGHT*4);
        JButton division = getJButton("/", WIDTH*3, HEIGHT*4);


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
    }

    private static JButton getJButton(String lable, int xPosition, int yPosition) {
        JButton button = new JButton(lable);
        button.setBounds(xPosition, yPosition, WIDTH, HEIGHT);
        if(lable.equals("C")){
            button.addActionListener(event -> result.setText(""));
        } else if(lable.equals("+")) {
            button.addActionListener(event -> {
                adadAval = result.getText();
                result.setText("");

            });
        } else if (lable.equals("=")) {
            button.addActionListener(event -> {
                final Calculator calculator = new Calculator();
                String total = calculator.add(adadAval,result.getText());
                result.setText(total);
            });

        } else {
            button.addActionListener(event ->
                result.setText(result.getText() + button.getText()));
        }
        return button;
    }

}

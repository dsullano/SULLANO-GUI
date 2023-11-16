package SimpleCalculator;

import LeapYearChecker.LYear;

import javax.swing.*;

public class Calculator extends JFrame {

    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField result;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JPanel jpanel;

    public Calculator() {
        btnCompute.addActionListener(e -> {
            int x = Integer.parseInt(tfNumber1.getText());
            int y = Integer.parseInt(tfNumber2.getText());
            int op = cbOperations.getSelectedIndex();

            switch(op) {
                case 0:
                result.setText(String.valueOf(x + y));
                break;
                case 1:
                    result.setText(String.valueOf(x - y));
                    break;
                case 2:
                    result.setText(String.valueOf(x * y));
                    break;
                case 3:
                    result.setText(String.valueOf(x / y));
                    break;
                default:
                    break;
            }
        });
    }
    public static void main(String[] args) {
        Calculator app = new Calculator();

        app.setContentPane(app.jpanel);
        app.setSize(500,250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");

    }
}

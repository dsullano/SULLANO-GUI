package FoorOrderingSystem;

import javax.swing.*;

public class FoodOrder extends JFrame {
    private JPanel jpanel;
    private JButton btnOrder;
    private JCheckBox sundaeCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox pizzaCheckBox;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton a15OffRadioButton;

    public FoodOrder() {
        btnOrder.addActionListener(e -> {
            double total = 0;
            double discount;
            if(pizzaCheckBox.isSelected()){
                total += 100;
            }
            if(burgerCheckBox.isSelected()){
                total += 80;
            }
            if(friesCheckBox.isSelected()){
                total += 65;
            }
            if(softDrinksCheckBox.isSelected()){
                total += 55;
            }
            if(teaCheckBox.isSelected()){
                total += 50;
            }
            if(sundaeCheckBox.isSelected()){
                total += 40;
            }
            if(rbNone.isSelected()) {
                discount = 0;
            } else if(rb5.isSelected()) {
                discount = 0.05;
            } else if(rb10.isSelected()) {
                discount = 0.1;
            } else {
                discount = 0.15;
            }
            double amount = total - (total * discount);
            JOptionPane.showMessageDialog(null,"The total price is Php " + amount);
        });
    }

    public static void main(String[] args) {
        FoodOrder app = new FoodOrder();

        app.setContentPane(app.jpanel);
        app.setSize(500,250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}

package LeapYearChecker;

import javax.swing.*;

public class LYear extends JFrame {
    private JTextField tfYear;
    private JPanel panel1;
    private JButton btnCheckYear;


    public LYear() {
        btnCheckYear.addActionListener(e -> {
            int year = Integer.parseInt(tfYear.getText());

            if (year % 400 == 0){
                JOptionPane.showMessageDialog(null,"Leap Year");
            } else if (year % 100 == 0){
                JOptionPane.showMessageDialog(null,"Not Leap Year");
            }else if (year % 4 == 0){
                JOptionPane.showMessageDialog(null,"Leap Year");
            } else {
                JOptionPane.showMessageDialog(null,"Not Leap Year");
            }
        });
    }
    public static void main(String[] args) {
            LYear day = new LYear();

            day.setContentPane(day.panel1);
            day.setSize(500,250);
            day.setDefaultCloseOperation(EXIT_ON_CLOSE);
            day.setVisible(true);
            day.setTitle("Leap Year Checker");

    }
}

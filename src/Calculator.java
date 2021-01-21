import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class Calculator extends JFrame {

    public void start() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 100, 400, 400);


        JPanel panel = new JPanel(new FlowLayout());


        JTextField firstNum = new JTextField(5);
        JTextField secondNum = new JTextField(5);
        firstNum.setBounds(3,5,200,100);
        JLabel label1 = new JLabel("  ");
        JLabel label2 = new JLabel(" = ");
        JLabel result = new JLabel("0");
        panel.setBackground(Color.green);
        JButton button = new JButton("RESULT");
        JButton sum = new JButton("+");
        JButton sub = new JButton("-");
        JButton mult = new JButton("*");
        JButton div = new JButton("/");


        final Integer[] output = {(0)};
        panel.setLayout (new FlowLayout(FlowLayout.CENTER));

        button.addActionListener(e -> result.setText(String.valueOf(output[0])));







        sum.addActionListener(e -> {
            int x = 0;
            int y = 0;
            try {
                x = Integer.parseInt(firstNum.getText());
                y = Integer.parseInt(secondNum.getText());
                label1.setText(("+"));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(panel, "Некорректный ввод!");
            }
            output[0] =x+y;
        });
        sub.addActionListener(e -> {
            int x = 0;
            int y = 0;
            try {
                x = Integer.parseInt(firstNum.getText());
                y = Integer.parseInt(secondNum.getText());
                label1.setText(("-"));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(panel, "Некорректный ввод!");
            }
            output[0] =x-y;
        });
        mult.addActionListener(e -> {
            int x = 0;
            int y = 0;
            try {
                x = Integer.parseInt(firstNum.getText());
                y = Integer.parseInt(secondNum.getText());
                label1.setText(("*"));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(panel, "Некорректный ввод!");
            }
            output[0] =x*y;
        });
        div.addActionListener(e -> {
            int x = 0;
            int y = 0;
            try {
                x = Integer.parseInt(firstNum.getText());
                y = Integer.parseInt(secondNum.getText());
                label1.setText(("/"));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(panel, "Некорректный ввод!");
            }
            output[0] =x/y;
        });

        panel.add(firstNum);
        panel.add(label1);
        panel.add(secondNum);
        panel.add(label2);
        panel.add(result);
        panel.add(sum);
        panel.add(sub);
        panel.add(mult);
        panel.add(div);
        panel.add(button);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator().start();
    }
}
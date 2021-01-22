import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame {
    public Calculator() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 230);
        setLocation(400, 130);
        // контейнер
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        container.setBackground(Color.WHITE);
        setResizable(false);
        // компоненты
        JLabel name = new JLabel("           calculator           ");
        name.setFont(new Font("Serif", Font.PLAIN, 40));
        name.setBackground(new java.awt.Color(116, 238, 177, 153));
        name.setOpaque(true);
        container.add(name);
        JTextField firstNum = new JTextField(15);
        firstNum.setHorizontalAlignment(JTextField.CENTER);
        container.add(firstNum);
        JLabel label = new JLabel("  ");
        container.add(label);
        JTextField secondNum = new JTextField(15);
        secondNum.setHorizontalAlignment(JTextField.CENTER);
        container.add(secondNum);
        JButton sum = new JButton("+");
        container.add(sum);
        sum.setBackground(Color.lightGray);
        JButton sub = new JButton("-");
        container.add(sub);
        sub.setBackground(Color.lightGray);
        JButton mult = new JButton("*");
        container.add(mult);
        mult.setBackground(Color.lightGray);
        JButton div = new JButton("/");
        container.add(div);
        div.setBackground(Color.lightGray);
        JButton exp = new JButton("^");
        container.add(exp);
        exp.setBackground(Color.lightGray);
        JTextField itog = new JTextField(31);
        itog.setHorizontalAlignment(JTextField.CENTER);
        container.add(itog);
        div.setBackground(Color.lightGray);
        JLabel expression = new JLabel();
        expression.setFont(new Font("Serif", Font.PLAIN, 20));
        expression.setBackground(new java.awt.Color(116, 238, 177, 153));
        expression.setOpaque(true);
        container.add(expression);

        sum.addActionListener(e -> {
            double rez;
            try {
                rez = Double.parseDouble(firstNum.getText()) + Double.parseDouble(secondNum.getText());
                label.setText(("+"));
                if (rez % 1 != 0) {
                    itog.setText(Double.toString(rez));
                } else {

                    int res = (int) rez;
                    itog.setText(Integer.toString(res));
                }
                expression.setText("     DONE!     ");
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(container, "Некорректный ввод!");
            }


        });

        sub.addActionListener(e -> {
            double rez;
            try {
                rez = Double.parseDouble(firstNum.getText()) - Double.parseDouble(secondNum.getText());
                label.setText(("-"));
                if (rez % 1 != 0) {
                    itog.setText(Double.toString(rez));
                } else {

                    int res = (int) rez;
                    itog.setText(Integer.toString(res));
                    expression.setText("     DONE!     ");
                }
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(container, "Некорректный ввод!");
                expression.setText("     DONE!     ");
            }
        });


        mult.addActionListener(e -> {
            double rez;
            try {
                rez = Double.parseDouble(firstNum.getText()) * Double.parseDouble(secondNum.getText());
                label.setText(("*"));
                if (rez % 1 != 0) {
                    itog.setText(Double.toString(rez));
                } else {

                    int res = (int) rez;
                    itog.setText(Integer.toString(res));
                }
                expression.setText("     DONE!     ");
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(container, "Некорректный ввод!");
            }
        });

        div.addActionListener(e -> {
            double rez;
            try {
                rez = Double.parseDouble(firstNum.getText()) / Double.parseDouble(secondNum.getText());
                label.setText(("/"));
                if (rez % 1 != 0) {
                    itog.setText(Double.toString(rez));
                } else {
                    int res = (int) rez;
                    itog.setText(Integer.toString(res));
                }
                expression.setText("     DONE!     ");
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(container, "Некорректный ввод!");
            }
        });

        exp.addActionListener(e -> {
            double rez;
            try {
                rez = Math.pow(Double.parseDouble(firstNum.getText()), Double.parseDouble(secondNum.getText()));
                label.setText(("^"));
                if (rez % 1 != 0) {
                    itog.setText(Double.toString(rez));
                } else {

                    int res = (int) rez;
                    itog.setText(Integer.toString(res));
                }
                expression.setText("     DONE!     ");
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(container, "Некорректный ввод!");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
    public Calculator()
    {
        super("Calculator");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(400, 130);
        setLocation(400, 130);
        // контейнер
        Container container = getContentPane();
        container.setLayout (new FlowLayout(FlowLayout.CENTER));
        container.setBackground(Color.WHITE);
        // добавляю компоненты


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
        JTextField itog = new JTextField(20);
        itog.setHorizontalAlignment(JTextField.CENTER);
        container.add(itog);
        div.setBackground(Color.lightGray);

       

        sum.addActionListener(e -> {
            int rez = 0;
            try {
                rez = Integer.parseInt(firstNum.getText()) + Integer.parseInt(secondNum.getText());
                label.setText(("+"));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(container, "Некорректный ввод!");
            }
            itog.setText(Integer.toString(rez));
        });

        sub.addActionListener(e -> {
            int rez = 0;
            try {
                rez = Integer.parseInt(firstNum.getText()) - Integer.parseInt(secondNum.getText());
                label.setText(("-"));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(container, "Некорректный ввод!");
            }
            itog.setText(Integer.toString(rez));
        });

        mult.addActionListener(e -> {
            int rez = 0;
            try {
                rez = Integer.parseInt(firstNum.getText()) * Integer.parseInt(secondNum.getText());
                label.setText(("*"));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(container, "Некорректный ввод!");
            }
            itog.setText(Integer.toString(rez));
        });

        div.addActionListener(e -> {
            int rez = 0;
            try {
                int var=Integer.parseInt(secondNum.getText());
                if (var==0) {
                    JOptionPane.showMessageDialog(container, "На 0 делить нельзя!");
                } else{
                    rez = Integer.parseInt(firstNum.getText()) / Integer.parseInt(secondNum.getText());
                    label.setText(("/"));
                }

            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(container, "Некорректный ввод!");
            }
            itog.setText(Integer.toString(rez));
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
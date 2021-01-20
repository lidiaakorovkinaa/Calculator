import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    public void start() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 100, 400, 400);
        setBackground(Color.blue);


        JPanel panel = new JPanel(new FlowLayout());
        JTextField firstNum = new JTextField(5);

        JTextField secondNum = new JTextField();
        firstNum.setBounds(3,5,200,100);
        JLabel label1 = new JLabel(" * ");
        JLabel label2 = new JLabel(" = ");
        JLabel result = new JLabel("0");
        panel.setBackground(Color.green);
        JButton button = new JButton("Calc");

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int x = 0;
                int y = 0;
                try {
                    x = Integer.parseInt(firstNum.getText());
                    y = Integer.parseInt(secondNum.getText());
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(panel, "Некорректный ввод!");
                }
                result.setText(String.valueOf(x*y));
            }



        });



        panel.add(firstNum);
        panel.add(label1);
        panel.add(secondNum);
        panel.add(label2);
        panel.add(result);
        panel.add(button);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator().start();
    }
}
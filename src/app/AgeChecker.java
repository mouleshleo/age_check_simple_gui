package app;

import javax.swing.*;
import java.awt.*;

public class AgeChecker {
    JTextField age,result;
    JFrame frame;
    JLabel enter_age;
    JButton check_button;

    AgeChecker() {
        frame = new JFrame("age checker");
        check_button = new JButton("click");
        enter_age = new JLabel("Enter your age:");
        age = new JTextField("18");
        result = new JTextField();
        frame.setSize(500, 500);

        enter_age.setBounds(160, 100, 150, 30);
        age.setBounds(160, 140, 150, 30);
        check_button.setBounds(180, 200, 100, 60);
        result.setBounds(160, 270, 150, 30);


        frame.add(enter_age);
        frame.add(check_button);
        frame.add(age);
        frame.add(result);
        check_button.setFocusable(false);
        check_button.setFont(new Font("Arial", Font.PLAIN, 23));
        check_button.addActionListener(e -> ageChecker());
        check_button.setForeground(Color.blue);
        check_button.setBackground(Color.yellow);


        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void ageChecker() {
        int Age = Integer.parseInt(age.getText());
        if (Age >= 18) {
            result.setText("yes you can enter");
        } else {
            result.setText("no you can't");
        }
    }


}

package Igor.second;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VisualMenu extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 8);
    private JLabel label = new JLabel("");

    public VisualMenu() {
        super("Symbol Cheker");
        this.setBounds(500, 500, 500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

        class ButtonEventListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
    }
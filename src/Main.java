import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class Main {
    int i = 0;

    public static void main(String[] args) {
        Main m = new Main();
        m.go();
    }

    public void go() {
        System.out.println("Create window!");
        JFrame frame = new JFrame("Основной Курсовой");

        final JButton button = new JButton("click me");
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
//        int i=0;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                System.out.println("Button pressed! "+i+" times!");
                button.setText("I've been clicked  "+i+" times!");
            }
        });
    }
}
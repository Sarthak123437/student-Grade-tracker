import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGradeGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Grade Tracker");
        frame.setSize(420, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // ===== Heading =====
        JLabel heading = new JLabel("Student Grade Tracker", JLabel.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 18));
        heading.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(heading, BorderLayout.NORTH);

        // ===== Center Panel =====
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JLabel l1 = new JLabel("Marks 1:");
        JTextField t1 = new JTextField();

        JLabel l2 = new JLabel("Marks 2:");
        JTextField t2 = new JTextField();

        JLabel l3 = new JLabel("Marks 3:");
        JTextField t3 = new JTextField();

        JLabel avgLabel = new JLabel("Average: ");
        JLabel highLabel = new JLabel("Highest: ");
        JLabel lowLabel = new JLabel("Lowest: ");

        JButton btn = new JButton("Calculate");

        panel.add(l1);
        panel.add(t1);

        panel.add(l2);
        panel.add(t2);

        panel.add(l3);
        panel.add(t3);

        panel.add(avgLabel);
        panel.add(highLabel);

        panel.add(lowLabel);
        panel.add(btn);

        frame.add(panel, BorderLayout.CENTER);

        // ===== Button Logic =====
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int m1 = Integer.parseInt(t1.getText());
                int m2 = Integer.parseInt(t2.getText());
                int m3 = Integer.parseInt(t3.getText());

                int total = m1 + m2 + m3;
                double avg = total / 3.0;

                int highest = Math.max(m1, Math.max(m2, m3));
                int lowest = Math.min(m1, Math.min(m2, m3));

                avgLabel.setText("Average: " + avg);
                highLabel.setText("Highest: " + highest);
                lowLabel.setText("Lowest: " + lowest);
            }
        });

        frame.setVisible(true);
    }
}

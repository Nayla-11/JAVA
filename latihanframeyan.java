import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class latihanframeyan {

    public latihanframeyan() {

        // Frame
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(600, 600);
        frame.setTitle("LATIHAN FRAME");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label
        JLabel label = new JLabel("Judul");
        label.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 20));
        frame.add(label);

        // Button
        JButton button1 = new JButton("Tambah");
        button1.setBackground(Color.RED);
        frame.add(button1);

        JButton button2 = new JButton("Kurang");
        button2.setBackground(Color.GREEN);
        frame.add(button2);

        JButton button3 = new JButton("Kali");
        button3.setBackground(Color.BLUE);
        frame.add(button3);

        JButton button4 = new JButton("Bagi");
        button4.setBackground(Color.YELLOW);
        frame.add(button4);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        latihanframeyan gui = new latihanframeyan();
    }
}

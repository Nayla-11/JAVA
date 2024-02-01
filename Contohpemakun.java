import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Contohpemakun {

    public Contohpemakun() {

        // Frame
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(600, 600);
        frame.setTitle("Aplikasi Pencatatan Transaksi Keuangan");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label
        JLabel label1 = new JLabel("Tanggal");
        JLabel label2 = new JLabel("Deskripsi");
        JLabel label3 = new JLabel("Jumlah");
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        // Text field
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        JTextField text3 = new JTextField();
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);

        // Button
        JButton button = new JButton("Tambah");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementasi fungsi untuk menambahkan transaksi keuangan
            }
        });
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Contohpemakun gui = new Contohpemakun();
    }
}

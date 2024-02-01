import javax.swing.JFrame;

public class MingguTigaBelasFrame {
    public MingguTigaBelasFrame() {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setTitle("My first Java GUI"); // Perbaikan typo di sini
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true); // Tambahkan titik koma di sini
    }

    public static void main(String[] args) {
        MingguTigaBelasFrame gui = new MingguTigaBelasFrame();
    }
}

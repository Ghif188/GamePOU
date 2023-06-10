import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelMovementExample {
    private JFrame frame;
    private JButton stopButton;
    private JButton restartButton;
    private ActionListener restartActionListener;

    public JLabelMovementExample() {
        // Inisialisasi komponen GUI
        frame = new JFrame("GUI Stop and Restart Example");
        stopButton = new JButton("Stop");
        restartButton = new JButton("Restart");

        // Tambahkan ActionListener untuk tombol Stop
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Hentikan GUI dengan menghapus JFrame
            }
        });

        // Buat ActionListener untuk tombol Restart
        restartActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Buat instance baru dari GUI saat tombol Restart ditekan
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new JLabelMovementExample();
                    }
                });
            }
        };
        restartButton.addActionListener(restartActionListener);

        // Tambahkan komponen ke dalam JFrame
        frame.setLayout(new FlowLayout());
        frame.add(stopButton);
        frame.add(restartButton);

        // Konfigurasi JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JLabelMovementExample();
            }
        });
    }
}

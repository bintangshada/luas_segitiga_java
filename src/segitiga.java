import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class segitiga {
    private JTextField tfAlas;
    private JTextField tfTinggi;
    private JPanel luasSegitiga;
    private JTextField tfHasil;
    private JButton hitungButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("segitiga");
        frame.setContentPane(new segitiga().luasSegitiga);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton keluarButton;
public segitiga() {
    hitungButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double alas,tinggi;
            double luas;

            alas = Double.parseDouble(tfAlas.getText());
            tinggi = Double.parseDouble(tfTinggi.getText());
            luas = alas*tinggi/2;
            tfHasil.setText(String.valueOf(luas));
        }
    });
    keluarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
}
}

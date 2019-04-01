import javax.swing.*;
import java.awt.*;

public class Tugas{

    public static void main(String[] args){
        JFrame frame = new JFrame("Septiyan");
        frame.setSize(300,300);
        frame.setLayout(new BorderLayout());

        JLabel lblNim = new JLabel();
        lblNim.setText("17090105");

        JLabel lblNama = new JLabel();
        lblNama.setText("Septiyan Adi Nugroho");
        //frame.add(lblNama, BorderLayout.WEST);

        JLabel lblKls = new JLabel();
        lblKls.setText("4D");


        JButton btnSimpan = new JButton("Simpan");
        frame.add(btnSimpan, BorderLayout.SOUTH);

        JPanel westPanel = new JPanel();
        westPanel.setLayout (new GridLayout(3,1));
        frame.add(westPanel, BorderLayout.WEST);
        westPanel.add(lblNama);
        westPanel.add(lblNim);
        westPanel.add(lblKls);


        frame.setVisible(true);
    }
}


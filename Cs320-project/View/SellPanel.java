import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellPanel extends JFrame {
    void initialize(){
        String[] types = {" ","For Sale","For Rent"};
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel id = new JLabel("ID");
        JTextField textID = new JTextField();
        JButton sell = new JButton("SELL");
        sell.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                RealEstate.delete(Integer.parseInt(textID.getText()));
                Operators op = new Operators();
                op.initialize();
            }
        });
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Operators().initialize();
            }
        });
        JLabel space3 = new JLabel("");
        JLabel space4 = new JLabel("");


        panel.setLayout(new GridLayout(3,2));
        panel.add(id);
        panel.add(textID);
        panel.add(space3);
        panel.add(space4);
        panel.add(back);
        panel.add(sell);


        frame.setSize(390,180);
        frame.add(panel);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
        frame.setVisible(true);
    }
}

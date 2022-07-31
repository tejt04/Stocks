import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

public class Toolbar extends JPanel {

    JTextArea search;

    public Toolbar()
    {
        search = new JTextArea();
        search.setBorder(BorderFactory.createLineBorder(Color.black));
        search.setPreferredSize(new Dimension(100,20));
        setLayout(new FlowLayout());

        add(search);
    }
}

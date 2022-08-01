import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.*;

public class Toolbar extends JPanel implements MouseListener{

    JTextArea search;
    JButton okButton;

    boolean wasClickedAlready=false;

    public Toolbar()
    {
        search = new JTextArea();
        okButton = new JButton();

        okButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                search.setText("");
                Graph.points[0][0]=20;
                Graph.points[0][1]=20;
                Graph.points[1][0]=40;
                Graph.points[1][1]=40;
                Graph.points[2][0]=60;
                Graph.points[2][1]=60;
                Graph.points[3][0]=80;
                Graph.points[3][1]=80;

            }
        });

        search.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(!wasClickedAlready)
                {
                    search.setText("");
                }
                search.setForeground(Color.black);
                wasClickedAlready=true;
            }
            @Override
            public void mouseEntered(MouseEvent e){
                search.setEditable(true);
            }
        });

        search.setBorder(BorderFactory.createLineBorder(Color.black));
        search.setPreferredSize(new Dimension(100,20));

        search.setText("Enter coords");
        search.setForeground(Color.gray);
        search.setCaretPosition(search.getText().length());
        search.setEditable(false);

        okButton.setText("OK");

        setLayout(new FlowLayout());

        add(search);
        add(okButton);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}

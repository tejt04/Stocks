import java.awt.*;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main implements ComponentListener
{
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static int width = (int)screenSize.getWidth();
    static int height = (int)screenSize.getHeight();

    public static int appWidth=800;
    public static int appHeight=600;

    public static int graphWidth;
    public static int graphHeight;

    JFrame frame;
    JPanel panel;
    static Graph graph;
    Toolbar toolbar;
    static JPanel leftMenuBar;
    JPanel rightMenuBar;
    JPanel bottomMenuBar;



public Main()
{



    frame = new JFrame();
    panel = new JPanel();
    graph = new Graph();
    toolbar = new Toolbar();
    leftMenuBar = new JPanel();
    rightMenuBar = new JPanel();
    bottomMenuBar = new JPanel();

    leftMenuBar.setPreferredSize(new Dimension(appWidth/4, appHeight));
    toolbar.setPreferredSize(new Dimension(appWidth,appHeight/16));
    rightMenuBar.setPreferredSize(new Dimension(appWidth/4,appHeight));
    bottomMenuBar.setPreferredSize(new Dimension(appWidth,appHeight/32));

    graphWidth=appWidth/2;
    graphHeight=appHeight-(toolbar.getPreferredSize().height+bottomMenuBar.getPreferredSize().height);

    graph.setPreferredSize(new Dimension(graphWidth,graphHeight));
    panel.setPreferredSize(new Dimension(appWidth,appHeight));

    leftMenuBar.setBackground(Color.decode("#3d5a80"));
    rightMenuBar.setBackground(Color.decode("#3d5a80"));
    bottomMenuBar.setBackground((Color.decode("#FFBF00")));
    toolbar.setBackground(Color.decode("#FFBF00"));

    panel.setLayout(new BorderLayout());
    panel.add(graph,BorderLayout.CENTER);
    panel.add(leftMenuBar, BorderLayout.WEST);
    panel.add(rightMenuBar, BorderLayout.EAST);
    panel.add(bottomMenuBar, BorderLayout.SOUTH);
    panel.add(toolbar,BorderLayout.NORTH);

    frame.add(panel, BorderLayout.CENTER);
    frame.addComponentListener(this);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocation(width/2-(appWidth/2),height/2-(appHeight/2));
    frame.setResizable(false);
    frame.setTitle("Stocks");
    frame.pack();
    frame.setVisible(true);

    
}

public static void main(String[] args) {
    new Main();
}

@Override
public void componentMoved(ComponentEvent e) {
    // TODO Auto-generated method stub
    
}

@Override
public void componentShown(ComponentEvent e) {
    // TODO Auto-generated method stub
    
}

@Override
public void componentHidden(ComponentEvent e) {
    // TODO Auto-generated method stub
    
}
@Override
public void componentResized(ComponentEvent e) {
    
}

}
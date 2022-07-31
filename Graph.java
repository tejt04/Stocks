import java.awt.*;
import javax.swing.JPanel;

public class Graph extends JPanel {
    
    int[][] points = {

        {0,0},
        {10,25},
        {40,40},
        {60,60},
        {80,80},
        {100,100}

    };

    public Graph()
    {
    }

    @Override
    public void paintComponent(Graphics g)
    {

        g.setColor(Color.white );
        g.fillRect(0, 0, Main.graphWidth-1, Main.graphHeight-1);
        g.setColor(Color.decode("#3d5a80") );
        g.drawRect(0, 0, Main.graphWidth-1, Main.graphHeight-1);

        for(int i=0; i<Main.graphWidth;i+=((double)Main.graphWidth/10.0))
        {
            g.drawLine(i, 0, i, Main.graphHeight);
        }
        for(int i=0; i<Main.graphHeight;i+=((double)Main.graphHeight/10.0))
        {
            g.drawLine(0,i,Main.graphWidth,i);
        }

        for(int i=0; i<points.length-1; i++)
        {
            g.drawLine(points[i][0], Main.graphHeight-points[i][1], points[i+1][0], Main.graphHeight-points[i+1][1]);
        }
    }
}

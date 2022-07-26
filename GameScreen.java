import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;


public class GameScreen extends JPanel{
    
    GameScreen(){

    }

    public void paintComponents(Graphics g){
        super.paintComponents(g);

        g.setColor(Color.BLACK);
        g.drawRect(100, 100, 50, 50);


    }
}

import javax.swing.JFrame;

public class Game extends JFrame{
    
    private GameScreen gameScreen;

    Game(){
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gameScreen = new GameScreen();
        add(gameScreen);
    }

    public static void main(String[] args) {
        Game game = new Game();
    }
}

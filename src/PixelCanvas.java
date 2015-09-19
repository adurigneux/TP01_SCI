import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class PixelCanvas extends Canvas implements Observer {

    //valeurs à modier via la ligne de commande
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final int PIXEL_SIZE = 4;

    //a supprimer et laisser la couleur du pixel a desiner
    private static final Random random = new Random();

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(WIDTH, HEIGHT);
        frame.add(new PixelCanvas());
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    @Override
    public void update(Observable observable, Object objectConcerne) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //clear everything
        g.clearRect(0, 0, WIDTH, HEIGHT);


        //bornes de x->y verifier tout selon la taille et les emplacements des pixels etc
        for (int x = 0; x < WIDTH; x += PIXEL_SIZE) {
            for (int y = 0; y < HEIGHT; y += PIXEL_SIZE) {

                //use color of pixel
                g.setColor(randomColor());
                //ici dessiner tous les pixels
                g.fillRect(x, y, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }

    private Color randomColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}
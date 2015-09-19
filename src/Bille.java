import java.awt.Color;
import java.util.Random;

public class Bille extends Agent {

    private int numero;
    private int vitesse; //(vitesse = nombre de cases par "tour")
    private int sens;
    private Color couleur;

    public static final int UPPER_LEFT = 1;
    public static final int UPPER_RIGHT = 2;
    public static final int UPPER_CENTER = 3;
    public static final int LOWER_LEFT = 4;
    public static final int LOWER_RIGHT = 5;
    public static final int LOWER_CENTER = 6;
    public static final int RIGHT = 7;
    public static final int LEFT = 8;

    public Bille(Environnement env, int numero, int vitesse, int x, int y, int sens) {
        super(env, x, y);
        this.numero = numero;
        this.vitesse = vitesse;
        this.sens = sens;
    }

    public Bille(Environnement env, int numero) {
        super(env, 0, 0);
        Random random = new Random();

        this.x = random.nextInt(env.getTailleX());
        this.y = random.nextInt(env.getTailleY());

        this.numero = numero;
        this.vitesse = random.nextInt(9) + 1; //retirer le 0
        this.sens = random.nextInt(7) + 1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getSens() {
        return sens;
    }

    public void setSens(int sens) {
        this.sens = sens;
    }


    @Override
    public void decide() {
        int newX, newY;

        switch (sens) {
            case Bille.UPPER_CENTER:

                newY = y + vitesse;

                if (this.getEnv().estEnDehors(x, newY) || !this.getEnv().estVide(x, newY)) {
                    sens = Bille.LOWER_CENTER;
                    y = y - vitesse;
                } else {
                    y = newY;
                }

                break;
            case Bille.UPPER_LEFT:

                newX = x - vitesse;
                newY = y - vitesse;

                if (this.getEnv().estEnDehors(newX, newY) || !this.getEnv().estVide(newX, newY)) {
                    sens = Bille.LOWER_RIGHT;
                    x = x + vitesse;
                    y = y + vitesse;
                } else {
                    x = newX;
                    y = newY;
                }

                break;
            case Bille.UPPER_RIGHT:

                newX = x - vitesse;
                newY = y + vitesse;

                if (this.getEnv().estEnDehors(newX, newY) || !this.getEnv().estVide(newX, newY)) {
                    sens = Bille.LOWER_LEFT;
                    x = x + vitesse;
                    y = y - vitesse;
                } else {
                    x = newX;
                    y = newY;
                }

                break;
            case Bille.LOWER_CENTER:

                newY = y - vitesse;

                if (this.getEnv().estEnDehors(x, newY) || !this.getEnv().estVide(x, newY)) {
                    sens = Bille.UPPER_CENTER;
                    y = y + vitesse;
                } else {
                    y = newY;
                }

                break;
            case Bille.LOWER_LEFT:

                newX = x - vitesse;
                newY = y + vitesse;

                if (this.getEnv().estEnDehors(newX, newY) || !this.getEnv().estVide(newX, newY)) {
                    sens = Bille.UPPER_RIGHT;
                    x = x + vitesse;
                    x = y - vitesse;
                } else {
                    x = newX;
                    y = newY;
                }

                break;
            case Bille.LOWER_RIGHT:

                newX = x + vitesse;
                newY = y - vitesse;

                if (this.getEnv().estEnDehors(newX, newY) || !this.getEnv().estVide(newX, newY)) {
                    sens = Bille.UPPER_LEFT;
                    x = x - vitesse;
                    x = y + vitesse;
                } else {
                    x = newX;
                    y = newY;
                }

                break;
            case Bille.RIGHT:

                newY = y + vitesse;

                if (this.getEnv().estEnDehors(x, newY) || !this.getEnv().estVide(x, newY)) {
                    sens = Bille.LEFT;
                    y = y - vitesse;
                } else {
                    y = newY;
                }


                break;
            case Bille.LEFT:

                newY = y - vitesse;

                if (this.getEnv().estEnDehors(x, newY) || !this.getEnv().estVide(x, newY)) {
                    sens = Bille.LEFT;
                    y = y + vitesse;
                } else {
                    y = newY;
                }

                break;
        }

    }

}

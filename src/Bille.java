import java.awt.Color;

public class Bille extends Agent {

    private int numero;
    private int vitesse;
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

                newY = y + 1;

                if (this.getEnv().estEnDehors(x, newY) || !this.getEnv().estVide(x, newY)) {
                    sens = Bille.LOWER_CENTER;
                    y = y - 1;
                } else {
                    y = newY;
                }

                break;
            case Bille.UPPER_LEFT:

                newX = x - 1;
                newY = y - 1;

                if (this.getEnv().estEnDehors(newX, newY) || !this.getEnv().estVide(newX, newY)) {
                    sens = Bille.LOWER_RIGHT;
                    x = x + 1;
                    y = y + 1;
                } else {
                    x = newX;
                    y = newY;
                }

                break;
            case Bille.UPPER_RIGHT:

                newX = x - 1;
                newY = y + 1;

                if (this.getEnv().estEnDehors(newX, newY) || !this.getEnv().estVide(newX, newY)) {
                    sens = Bille.LOWER_LEFT;
                    x = x + 1;
                    y = y - 1;
                } else {
                    x = newX;
                    y = newY;
                }

                break;
            case Bille.LOWER_CENTER:

                newY = y - 1;

                if (this.getEnv().estEnDehors(x, newY) || !this.getEnv().estVide(x, newY)) {
                    sens = Bille.UPPER_CENTER;
                    y = y + 1;
                } else {
                    y = newY;
                }

                break;
            case Bille.LOWER_LEFT:

                newX = x - 1;
                newY = y + 1;

                if (this.getEnv().estEnDehors(newX, newY) || !this.getEnv().estVide(newX, newY)) {
                    sens = Bille.UPPER_RIGHT;
                    x = x + 1;
                    x = y - 1;
                } else {
                    x = newX;
                    y = newY;
                }

                break;
            case Bille.LOWER_RIGHT:

                newX = x + 1;
                newY = y - 1;

                if (this.getEnv().estEnDehors(newX, newY) || !this.getEnv().estVide(newX, newY)) {
                    sens = Bille.UPPER_LEFT;
                    x = x - 1;
                    x = y + 1;
                } else {
                    x = newX;
                    y = newY;
                }

                break;
            case Bille.RIGHT:

                newY = y + 1;

                if (this.getEnv().estEnDehors(x, newY) || !this.getEnv().estVide(x, newY)) {
                    sens = Bille.LEFT;
                    y = y - 1;
                } else {
                    y = newY;
                }


                break;
            case Bille.LEFT:

                newY = y - 1;

                if (this.getEnv().estEnDehors(x, newY) || !this.getEnv().estVide(x, newY)) {
                    sens = Bille.LEFT;
                    y = y + 1;
                } else {
                    y = newY;
                }

                break;
        }

    }

}

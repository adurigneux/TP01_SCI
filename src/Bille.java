public class Bille extends Agent {

    private int numero;
    private int vitesse;
    private int sens;

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
        // TODO Auto-generated method stub
    }

}

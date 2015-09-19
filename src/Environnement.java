public class Environnement {

    private Agent[][] espace;
    private int tailleX;
    private int tailleY;

    public Environnement(int tailleX, int tailleY) {
        this.tailleX = tailleX;
        this.tailleY = tailleY;

        this.espace = new Agent[tailleX][tailleY];
    }


    public boolean put(int x, int y, Agent agent) {
        if (!this.estVide(x, y) || this.estEnDehors(x, y)) return false;
        this.espace[x][y] = agent;
        return true;
    }

    public Agent get(int x, int y) {
        return this.espace[x][y];
    }

    public boolean estEnDehors(int x, int y) {
        return !(x >= 0 && x < this.tailleX && y >= 0 && y < tailleY);
    }

    public boolean estVide(int x, int y) {
        return this.get(x, y) == null;
    }

}

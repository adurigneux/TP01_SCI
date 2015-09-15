public class Environnement {

    private Agent[][] espace;

    public Environnement(int tailleX, int tailleY) {
        this.espace = new Agent[tailleX][tailleY];
    }

    public Agent get(int x, int y) {
        return this.espace[x][y];
    }

}

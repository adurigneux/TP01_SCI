
public abstract class Agent {

    private Environnement env;
    private int x;
    private int y;

    public Agent(Environnement env, int x, int y) {
        this.env = env;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }

    public Environnement getEnv() {
        return env;
    }

    public void setEnv(Environnement env) {
        this.env = env;
    }

    public abstract void decide();

}

import java.util.List;


public abstract class SMA {

    protected Environnement env;
    protected List<Agent> agents;

    public abstract void init(int tailleX, int tailleY, int nombreAgents);

    public abstract void run(int nbTour);

}

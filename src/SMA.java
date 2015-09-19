import java.util.List;
import java.util.Observable;


public abstract class SMA extends Observable {
	
	protected Environnement env;
	protected List<Agent> agents;
	
	public abstract void init(int tailleX, int tailleY, int nombreAgents);
	public abstract void run(int nbTour);

}

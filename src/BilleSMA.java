import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class BilleSMA extends SMA {

	public void init(int tailleX, int tailleY, int nombreAgents) {
		this.env = new Environnement(tailleX, tailleY);
		this.agents = new ArrayList<Agent>(nombreAgents);

		Random random = new Random();

		for(int i = 0; i < nombreAgents; i++) {

			int vitesse = random.nextInt(10);

			//TODO
			//Bille b = new Bille(env, i, vitesse)

		}
	}

	@Override
	public void run(int nbTour) {

		Collections.shuffle(agents);
		for(Agent a : agents) {
			a.decide();
		}
	
		setChanged();
		notifyObservers();

	}

}

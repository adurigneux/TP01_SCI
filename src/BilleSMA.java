import java.util.ArrayList;
import java.util.Collections;


public class BilleSMA extends SMA {

    public BilleSMA() {
    }

    public void init(int tailleX, int tailleY, int nombreAgents) {
        this.agents = new ArrayList<Agent>(nombreAgents);
        this.env = new Environnement(tailleX, tailleY);
    }

    @Override
    public void run(int nbTour) {
        // TODO Auto-generated method stub

        Collections.shuffle(agents);
        for (Agent a : agents) {
            a.decide();
        }

        //this.setChanged() pour rafraichir la vue


    }

}

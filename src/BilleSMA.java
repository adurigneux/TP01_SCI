import java.util.ArrayList;
import java.util.Collections;


public class BilleSMA extends SMA {

    public void init(int tailleX, int tailleY, int nombreAgents) {
        this.env = new Environnement(tailleX, tailleY);
        this.agents = new ArrayList<Agent>(nombreAgents);

        for (int i = 0; i < nombreAgents; i++) {

            Bille b = new Bille(env, i);
            this.env.put(b.getX(), b.getY(), b);
            this.agents.add(b);

        }
    }

    @Override
    public void run(int nbTour, int sleepTime) {

        for (int i = 0; i < nbTour; i++) {
            Collections.shuffle(agents);
            for (Agent a : agents) {
                //clear env place before
                //   this.env.clear(a.getX(), a.getY());
                a.decide();

                //System.out.println(a.toString());
                this.env.put(a.getX(), a.getY(), a);
            }

            setChanged();
            notifyObservers();
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                //do nothing
                //e.printStackTrace();
            }
        }

    }

}

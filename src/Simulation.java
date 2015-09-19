
public class Simulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if(args.length < 4) {
			System.out.println("Usage : Java Simulation tailleX tailleY tailleBilleCase nombreBilles");
			return;
		}

		int tailleX = Integer.parseInt(args[0]);
		int tailleY = Integer.parseInt(args[1]);
		int tailleCaseBille = Integer.parseInt(args[2]);
		int nombreBilles = Integer.parseInt(args[3]);

		BilleSMA sma = new BilleSMA();
		sma.init(tailleX, tailleY, nombreBilles);
		
		/**
		 * 
		 * SMA  = new sma
		 * 
		 * sma.add agent...
		 * sma.run
		 * 
		 */

	}

}

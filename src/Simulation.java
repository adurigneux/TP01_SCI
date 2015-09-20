
public class Simulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if(args.length < 5) {
			System.out.println("Usage : java Simulation tailleX tailleY tailleBilleCase nombreBilles nombreTours");
			return;
		}

		int tailleX = Integer.parseInt(args[0]);
		int tailleY = Integer.parseInt(args[1]);
		int tailleCaseBille = Integer.parseInt(args[2]);
		int nombreBilles = Integer.parseInt(args[3]);
		int nombreTours = Integer.parseInt(args[4]);

		BilleSMA sma = new BilleSMA();
		sma.init(tailleX, tailleY, nombreBilles);
		sma.run(nombreTours);

	}

}

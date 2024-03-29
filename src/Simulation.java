public class Simulation {

    public static void main(String[] args) {

        if (args.length < 6) {
            System.out.println("Usage : java Simulation tailleX tailleY tailleBilleCase nombreBilles nombreTours tempsArret");
            return;
        }

        int tailleX = Integer.parseInt(args[0]);
        int tailleY = Integer.parseInt(args[1]);
        int tailleCaseBille = Integer.parseInt(args[2]);
        int nombreBilles = Integer.parseInt(args[3]);
        int nombreTours = Integer.parseInt(args[4]);
        int sleepTime = Integer.parseInt(args[5]);

        BilleSMA sma = new BilleSMA();
        sma.init(tailleX, tailleY, nombreBilles);


        PixelCanvas canvas = new PixelCanvas(tailleX, tailleY, tailleCaseBille);
        sma.addObserver(canvas);

        sma.run(nombreTours, sleepTime);

    }

}

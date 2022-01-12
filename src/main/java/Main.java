import java.util.Scanner;

public class Main {
    public static final short MAX_PTS_VIE = 100;
    public static final short PTS_BOUCLIER = 25;
    public static final short MAX_ATTAQUE_ENNEMI = 5;
    public static final short MAX_VIE_ENNEMI = 30;
    public static final short MAX_ATTAQUE_JOUEUR = 5;
    public static final short REGENARATION_BOUCLIER_PAR_TOUR = 10;

    public static String nomPersonnage;
    public static short ptsDeVie;
    public static short ptsBouclier;
    public static short nbEnnemisTues;
    public static boolean bouclierActif = true;

    public static void main(String[] args) {
        initPersonnage();
    }
    static void initPersonnage() {
        System.out.println("Saisir le nom de votre personnage");
        Scanner scanner = new Scanner(System.in);
        nomPersonnage = scanner.next();
        ptsDeVie = MAX_PTS_VIE;
        ptsBouclier = bouclierActif ? PTS_BOUCLIER : 0;
        System.out.println("OK " + Util.color(nomPersonnage, Color.GREEN) + " ! C'est parti !");
    }


    public static boolean hasard(double pourcentage){
        return pourcentage < Math.random();

    }

    public static short nombreAuHasard(short nombre) {
        return (short) Math.round(Math.random() + nombre);

    }

    public static short attaqueJoueur(short ptsVieEnemmi){
    short forceAttaque = nombreAuHasard(MAX_ATTAQUE_JOUEUR);
    ptsVieEnemmi -= forceAttaque;
    System.out.println(nomPersonnage + "attaque l'enemmi !" + forceAttaque + "points de dommage");
            return ptsVieEnemmi;
    }
}











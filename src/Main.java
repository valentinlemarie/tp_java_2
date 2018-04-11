import com.compteur.Counter;
import com.compteurimpair.CompteurImpair;
import com.compteurpair.CompteurPair;

public class Main extends Counter {

    public static void main(String[] args) {

        // les differents tests du cours
        Counter c1 = new Counter(2,10);
        Counter c2 = new Counter(22);
        Counter c3 = new Counter();
        c3.count();c3.count();
        System.out.println("counter 1   -> position :"+c1.toString()+" step : "+c1.toStringStep());
        System.out.println("counter 3   -> position :"+c2.toString()+" step : "+c2.toStringStep());
        System.out.println("counter 3   -> position :"+c3.toString()+" step : "+c3.toStringStep());

        Counter counter1 = new Counter();
        Counter counter2 = counter1;
        counter1.setPosition(10);
        if(counter1.equals(counter2)){
            System.out.println("egalite instance de classe");
        }


        // l'atelier du cours : cree 2 compteur pair et impair dans 2 class herite sur 2 packages differents et faire qq test sur ces derniers
        CompteurPair counterpair = new CompteurPair();// un compteur pair
        CompteurImpair counterimpair = new CompteurImpair();// un compteur impair

        // on incremente les compteurs pour vérifié le fonctionnement
        counterpair.count();
        counterimpair.count();
        // affichage de 2 compteur diferent
        System.out.println(counterpair.toString());
        System.out.println(counterimpair.toString());
        System.out.println(counterimpair.equals(counterpair));

        //compteur de 2 compteur égaux
        counterpair.inc();
        System.out.println(counterpair.toString());
        System.out.println(counterimpair.toString());
        System.out.println(counterpair.equals(counterimpair));
        counterpair.inc();
        counterimpair.count();
    }
}

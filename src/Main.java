import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        Herbivore gazelle = new Herbivore("газель",7,"трава","саванна", 70);
        if (!Herbivore.herbivoreExists(gazelle)) {
            Herbivore.herbivores[0] = gazelle;
        }

        gazelle.sleep();
        Herbivore giraffe = new Herbivore("жираф",9,"листва","саванна",45);
        if (!Herbivore.herbivoreExists(giraffe)) {
            Herbivore.herbivores[1] = giraffe;
        }
        Herbivore horse = new Herbivore("лошадь",8,"трава","степи",60);
        if (!Herbivore.herbivoreExists(horse)) {
            Herbivore.herbivores[2] = horse;
        }

        System.out.println("\nСодержимое массива травоядные:");
        System.out.println(Arrays.asList(Herbivore.herbivores));


        // хищники

        Predator tiger = new Predator("Тигр", 5, "Саванна", 80,"мясо");
        if (!Predator.predatorExists(tiger)) {
            Predator.predators[0] = tiger;
        }

        Predator hyena = new Predator("Гиена" , 4, "Саванна",50,"мясо");
        if (!Predator.predatorExists(hyena)) {
            Predator.predators[1] = hyena;
        }


        Predator bear = new Predator("Медведь", 10, "Лес",50,"всеядный");
        if (!Predator.predatorExists(bear)) {
            Predator.predators[2] = bear;
        }


        System.out.println("\nСодержимое массива хищники:");
        System.out.println(Arrays.asList(Predator.predators));

        // земноводные

        Amphibians ligushka = new Amphibians("лягушка",1,"водоемы");
        if (!Amphibians.amphibiansExists(ligushka)) {
            Amphibians.amphibian[0] = ligushka;
        }

        ligushka.hunts();
        Amphibians alreadyFreshwater = new Amphibians("уж",2,"суша,водоемы");
        if (!Amphibians.amphibiansExists(alreadyFreshwater)) {
            Amphibians.amphibian[1] = alreadyFreshwater;
        }

        alreadyFreshwater.hunts();

        System.out.println("\nСодержимое массива земноводные:");
        System.out.println(Arrays.asList(Amphibians.amphibian));

        // птицы

        Flightless peacock = new Flightless("павлин",3,"джунгли","ходьба");
        if (!Flightless.flightlessExists(peacock)) {
            Flightless.flightlesses[0] = peacock;
        }
        Flightless penguin = new Flightless("пингвин",4,"Антарктида","ходьба,плаванье");
        if (!Flightless.flightlessExists(penguin)) {
            Flightless.flightlesses[1] = penguin;
        }
        Flightless dodoBird = new Flightless("додо",7,"тропики","ходьба");
        if (!Flightless.flightlessExists(dodoBird)) {
            Flightless.flightlesses[2] = dodoBird;
        }

        System.out.println("\nСодержимое массива нелетающие птицы:");
        System.out.println(Arrays.asList(Flightless.flightlesses));

        // летающие птицы

        FlyingBirds gull = new FlyingBirds("чайка",5,"повсеместно","летает");
        if (!FlyingBirds.flyingBirdsExists(gull)) {
            FlyingBirds.flyingBirdses[0] = gull;
        }
        FlyingBirds albatross = new FlyingBirds("альбатрос",8,"водоемы","летает");
        if (!FlyingBirds.flyingBirdsExists(albatross)) {
            FlyingBirds.flyingBirdses[1] = albatross;
        }
        FlyingBirds falcon = new FlyingBirds("сокол",6,"степи","летает");
        if (!FlyingBirds.flyingBirdsExists(falcon)) {
            FlyingBirds.flyingBirdses[2] = falcon;
        }

        System.out.println("\nСодержимое массива птицы:");

        System.out.println(Arrays.asList(FlyingBirds.flyingBirdses));





    }


}
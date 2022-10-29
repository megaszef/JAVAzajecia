public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("mis");
        dog.name = "Ziomal";
        dog.isAlive = true;

        System.out.println(dog.weight);

        for (int i=0; i<100; i++){
            dog.takeForAWalk();
            System.out.println(dog.weight);
         }

        Car passeratti = new Car("VW", "Passat");
        passeratti.przebieg = 900000;

        System.out.println(passeratti.producent);
        System.out.println(passeratti.model);
        System.out.println(passeratti);

    }
}

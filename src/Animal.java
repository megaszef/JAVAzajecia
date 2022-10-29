public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 12.3 ;
    private static final Double DEFAULT_MONKEY_WEIGHT = 34.3;
    private static final Double DEFAULT_BEAR_WEIGHT = 480.9;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 3.2;
    String specie;
    String name;
    Boolean isAlive;
    Double weight;

    Animal(String specie) {
        this.specie = specie;
        this.isAlive = true;

        switch (specie) {
            case "pies" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "malpa" -> this.weight = DEFAULT_MONKEY_WEIGHT;
            case "mis" -> this.weight = DEFAULT_BEAR_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }

    }

    void feed() {
        if (this.weight > 0) {
            if (isAlive) {
                this.weight += 0.5;
                System.out.println("dzieki za zarcie");
            } else {
                System.out.println("Czy wszystko dobrze z glowa?");
            }
        }else{
            this.isAlive=false;
        }
    }

    void takeForAWalk() {
        if (this.weight > 0) {
            if (isAlive) {
                this.weight -= 1;
                System.out.println("dzienki za spacer mordo");
            } else {
                System.out.println("dzwonie na policje");
            }
        }else{
            this.isAlive=false;
        }
    }
}
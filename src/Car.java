public class Car {
    final String producent;
    final String model;
    Integer przebieg;
    String kolor;
    Double liczba_kol;

    public Car(String producent, String model) {
        this.producent = producent;
        this.model = model;
    }

    public String toString() {
        return "Producent: " + this.producent
                + " Model: " + this.model;
    }
}

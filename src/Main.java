public class Main {
    public static void main(String[] args) {
        Coche c = new Coche("Skoda", "Fabia", 2021, 55, 0.5, 32000);
        c.conducir(50);
        System.out.println(c.getAutonomia());
        System.out.println(c.getKilometraje());
        c.repostar(100);
        System.out.println(c.getAutonomia());
    }
}
public class Pond {
    public static void main(String[] args) {
        // Create frogs
        Frog Peepo = new Frog("Peepo");
        Frog Pepe = new Frog("Pepe", 10, 15.0);
        Frog Peepaw = new Frog("Peepaw", 4.6, 5.0);
        Frog Ivy = new Frog("Ivy", 31, 100);

        // Create flys
        Fly fly1Mass = new Fly(1.0, 3.0);
        Fly fly6Mass = new Fly(6.0);
        Fly superFly = new Fly(10.0, 10.0);

        Frog.setSpecies("1331 Frogs");
        System.out.println(Peepo);
        Peepo.eat(fly6Mass);
        System.out.println(fly6Mass);
        Peepo.grow(8);
        Peepo.eat(fly6Mass);
        System.out.println(fly6Mass);
        System.out.println(Peepo);
        System.out.println(Ivy);
        Peepaw.grow(4);
        System.out.println(Peepaw);
        System.out.println(Pepe);
    }
}
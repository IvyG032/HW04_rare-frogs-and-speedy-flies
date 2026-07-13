public class Frog {
    // Instance variables
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species = "Rare Pepe";

    // Constructor (takes name, age, and tongueSpeed)
    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        this.isFroglet = (age > 1 && age < 7);
    }

    // Constructor (takes name, ageInYears, and tongueSpeed)
    public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name, (int)(ageInYears*12), tongueSpeed);
    }

    // Constructor (takes name)
    public Frog(String name) {
        this(name, 5, 5);
    }

    // Grow
    public void grow(int month) {
        for (int i = 1; i <= month; i ++) {
            if (this.age < 12) {
                this.tongueSpeed ++;
            }
            else if (this.age >= 30) {
                if ((this.tongueSpeed - 1) < 5){
                    this.tongueSpeed = 5;
                }
                else{
                    this.tongueSpeed --;
                }
            }
            this.age ++;
            this.isFroglet = (this.age > 1 && this.age < 7);
        }
    }

    // Grow overload
    public void grow() {
        this.grow(1);
    }

    // Eat
    public void eat(Fly fly) {
        // Check if fly is dead
        if (fly.isDead()) {
            return;
        }
        // If caught
        else if (this.tongueSpeed > fly.getSpeed()) { 
            if (fly.getMass() >= (0.5 * this.age)) {
                this.grow();
            }
            fly.setMass(0);
        }
        // If not caught
        else {
            fly.grow(1);
        }
    }

    @Override
    public String toString() {
        if (this.isFroglet) {
            return String.format("My name is %s and I'm a rare froglet! I'm %d months old and my tongue has a speed of %.2f.",
            this.name, this.age, this.tongueSpeed);
        }
        else {
            return String.format("My name is %s and I'm a rare frog. I'm %d months old and my tongue has a speed of %.2f.",
            this.name, this.age, this.tongueSpeed);
        }
    }

    // Species getter
    public static String getSpecies() {
        return species;
    }

    // Species setter
    public static void setSpecies(String newSpecies) {
        Frog.species = newSpecies;
    }

}
public class Fly {
    // Instance variables
    private double mass;
    private double speed;

    // Constructor (takes mass and speed)
    public Fly (double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    // Constructor (takes mass)
    public Fly(double mass) {
        this(mass, 10);
    }

    // Constructor (no parameter)
    public Fly() {
        this(5, 10);
    }

    // Get mass
    public double getMass() {
        return mass;
    }
    // Set mass
    public void setMass(double mass) {
        this.mass = mass;
    }

    // Get speed
    public double getSpeed() {
        return speed;
    }
    // Set speed
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        if (mass == 0) {
            return String.format("I'm dead, but I used to be a fly with a speed of %.2f.", speed);
        }
        else {
            return String.format("I'm a speedy fly with %.2f speed and %.2f mass.", speed, mass);
        }
    }

    // Grow
    public void grow(int addMass) {
        for (int i = 1; i <= addMass; i ++) {
            if (this.mass < 20) {
                this.speed ++;
            }
            else if (this.mass >= 20) {
                this.speed -= 0.5;
            }
            this.mass ++;
        }
    }

    // isDead
    public boolean isDead() {
        return this.mass == 0;
    }
}


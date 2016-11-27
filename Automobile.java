/**
 * Created by Cule on 11/23/2016.
 */
public class Automobile {
    int year = 0;
    String make = "";
    String model = "";
    String color = "";
    String name = "";
    int numOfGears = 0;
    int currentGear = 0;
    int operatingCycle;
    int currentSpeed = 0;
    int distanceTraveled;

    public Automobile(int year, String make, String model, String color, String name, int numOfGears, int operatingCycle)
    {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.name = name;
        this.numOfGears = numOfGears;
        this.operatingCycle = operatingCycle;
        //this.currentSpeed = currentSpeed;
        //this.distanceTraveled = distanceTraveled;
    }

    public void setCurrentGear()
    {
        if (operatingCycle <= numOfGears)
        {
            currentGear = operatingCycle;
        }
    }

    public int getCurrentSpeed()
    {
        return currentSpeed;
    }

    public int getCurrentGear()
    {
        return currentGear;
    }

    public int getDistanceTraveled()
    {
        return distanceTraveled;
    }

    public void setDistanceTraveled()
    {
        distanceTraveled += currentSpeed / 60;
    }

    public void setCurrentSpeed()
    {
        currentSpeed = currentGear * 10;
    }

    public void setOperatingCycle(int cycle)
    {

        this.operatingCycle = operatingCycle;
    }

    public String toString()
    {
        return "The status of car1 is: speed = " + getCurrentSpeed() + ", distance travelled = "
                + getDistanceTraveled() + ", gear = " + getCurrentGear();
    }

    public String getMessage()
    {
        return "Wrong number";
    }

    public class automobileSound extends Automobile
    {
        private String automobileSound = "";

        public automobileSound(int year, String make, String model, String color, String name, int numOfGears, int operatingCycle, int currentSpeed,
                                int distanceTraveled, String automobileSound)
        {
            super(year, make, model, color, name, numOfGears, operatingCycle);
            this.automobileSound = automobileSound;
        }

        public void getSound()
        {
            this.automobileSound = automobileSound;
        }

        public void setSound() {
            if (distanceTraveled <= 10) {
                System.out.println("Prrr");
            } else if (distanceTraveled > 10 && distanceTraveled <= 100)
                System.out.println("Vroom");
            try {
                if (distanceTraveled > 100)
                    System.out.println("Sputter...");
            } catch (Exception exception) {
                System.err.println("Your automobile is sputtering!");
            }
        }
        public void warning() {
            System.out.println("WARNING - THE RACE IS IN YELLOW FLAG");
        }
    }
}

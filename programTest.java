/**
 * Created by Hugo on 11/23/2016.
 */
import java.util.Scanner;

public class programTest {
    public static void main (String[] args)
    {
        int dicesRolled = 0;

        Scanner in = new Scanner(System.in);

        try
        {
            System.out.println("How many dice do you wish to throw?");
            dicesRolled = in.nextInt();
        }
        catch (Exception exception)
        {
           System.err.println("Number is negative");
        }

        int diceRoll = Dice.thrownDice(dicesRolled);

        Automobile car1 = new Automobile (2010, "Ford", "Focus", "Black", "car1", 5, diceRoll);
        Automobile car2 = new Automobile (2007, "Honda", "Civic", "Blue", "car2", 5, diceRoll);
        Automobile car3 = new Automobile (2017, "VW", "Golf", "Silver", "car3", 5, diceRoll);

        Automobile truck = new Automobile(2017, "Ford", "Focus", "Black", "trucky", 3, diceRoll);
        Automobile van = new Automobile(2016, "Ford", "Mazda", "Yellow", "Beast", 4, diceRoll);
        Automobile sports = new Automobile(2017, "Hyundai", "nemesis", "Blue", "Penelope", 6, diceRoll);




            for (int i = 0; i < diceRoll; i++) {

                System.out.println("\nOperating Cycle\n");
                System.out.println(i + 1);

                car1.setOperatingCycle(i + 1);
                car2.setOperatingCycle(i + 1);
                car3.setOperatingCycle(i + 1);
                truck.setOperatingCycle(i + 1);
                van.setOperatingCycle(i + 1);
                sports.setOperatingCycle(i + 1);

                car1.setCurrentGear();
                car2.setCurrentGear();
                car3.setCurrentGear();
                truck.setCurrentGear();
                van.setCurrentGear();
                sports.setCurrentGear();

                car1.setCurrentSpeed();
                car2.setCurrentSpeed();
                car3.setCurrentSpeed();
                truck.setCurrentSpeed();
                van.setCurrentSpeed();
                sports.setCurrentSpeed();

                car1.setDistanceTraveled();
                car2.setDistanceTraveled();
                car3.setDistanceTraveled();
                truck.setDistanceTraveled();
                van.setDistanceTraveled();
                sports.setDistanceTraveled();

                System.out.printf("The status of %s is: speed = %d, distance travelled = %d, gear = %d.\n",
                        "car1", car1.getCurrentSpeed(), car1.getDistanceTraveled(), car1.getCurrentGear());
                System.out.printf("The status of %s is: speed = %d, distance travelled = %d, gear = %d.\n",
                        "car2", car2.getCurrentSpeed(), car2.getDistanceTraveled(), car2.getCurrentGear());
                System.out.printf("The status of %s is: speed = %d, distance travelled = %d, gear = %d.\n",
                        "car3", car3.getCurrentSpeed(), car3.getDistanceTraveled(), car3.getCurrentGear());
                System.out.printf("The status of %s is: speed = %d, distance travelled = %d, gear = %d.\n",
                        "trucky", truck.getCurrentSpeed(), truck.getDistanceTraveled(), truck.getCurrentGear());
                System.out.printf("The status of %s is: speed = %d, distance travelled = %d, gear = %d.\n",
                        "Beast", van.getCurrentSpeed(), van.getDistanceTraveled(), van.getCurrentGear());
                System.out.printf("The status of %s is: speed = %d, distance travelled = %d, gear = %d.\n",
                        "Penelope", sports.getCurrentSpeed(), sports.getDistanceTraveled(), sports.getCurrentGear());

            }

        System.out.println("\n" + "Using the toString Method:");
        System.out.println(car1);

        System.out.println("Thank you for racing with us, have a good day!");
    }

}

import all.*;
import interfaces.*;

public class Main {

    public static void main(String[] args) {

        Person alice = new Person("Алиса");
        House house = new House("Дом");
        Thoughts thoughts = new Thoughts("Мысли");

        thoughts.addAdjective(enumThoughts.right);
        thoughts.addAdjective(enumThoughts.late);
        alice.grewUp();
        alice.gotUp(partsBody.knees);
        alice.lay(house.floor);
        alice.leanedOn(partsBody.elbows,house.door);
        alice.putIn(partsBody.arms);
        alice.grewUp();
        alice.StickedOut(partsBody.arms,house.window);
        alice.placedIn(partsBody.legs,house.fireplace);



    }
}

package Task1;

import java.time.LocalDate;

public class Cat extends AnimalTogo {
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

}

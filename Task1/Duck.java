package Task1;

import java.time.LocalDate;

public class Duck extends AnimalTogoFlySwim {
    public Duck() {
        super();
    }

    public Duck(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

}

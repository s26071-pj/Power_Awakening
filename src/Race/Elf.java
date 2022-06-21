package Race;

import java.util.*;

public class Elf extends Character{

    private final String race = "Elf";
    private String raceAbility = "Dark vision, Bonuses for dexterity";

    public Elf(String name) {
        super(name);
        this.raceAbility = raceAbility;
    }

    @Override
    public String getRaceAbility() {
        return raceAbility;
    }
    @Override
    public void setRaceAbility(String raceAbility) {
        this.raceAbility = raceAbility;
    }

    public String getRace() {
        return race;
    }
}


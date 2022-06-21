package Race;

public class Rogue extends Character{
    private final String race = "Rogue";
    private String raceAbility = "Flying, Damage vulnerability";

    public Rogue(String name) {
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

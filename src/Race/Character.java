package Race;

import ProfessionAbilities.Ability;
import java.util.*;

public abstract class Character {

    protected String race;
    protected String name;
    protected List<String> profession;
    protected Ability ability;

    public Character(String name){
        this.name = name;
        this.ability = new Ability();
        this.profession = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public Ability getAbility(){
        return ability;
    }
    public void setAbility(Ability ability){
        this.ability = ability;
    }
    public void addProfession(String profession){
        if(!profession.contains(profession)){
            this.profession.add(profession);
        }
    }
    public List<String> getProfession(){
        return profession;
    }
    public String getRace;
    public String getRaceAbility;

    public abstract String getRaceAbility();

    public abstract void setRaceAbility(String raceAbility);

    public void printoutCharacter(){
        String template = """
                --------------------------------------------------------
                Your character is looking like this:
                Name: %s
                Race: %s
                Race abilities: %s
                Profession: %s
                Profession Abilities: %s
                --------------------------------------------------------
                """;

        String result = String.format(
                template,
                getName(),
                getRace,
                getRaceAbility,
                getProfession(),
                getAbility()
        );
        System.out.println(result);
    }

}
package Profession;

import ProfessionAbilities.Stealth;
import ProfessionAbilities.Shooting;
import Race.Character;

public class Hunter{
    public void addAbility(Character character){
        character.addProfession("Hunter");

        Stealth stealth = new Stealth(character.getAbility());
        character.setAbility(stealth);

        Shooting shooting = new Shooting(character.getAbility());
        character.setAbility(shooting);
    }
}

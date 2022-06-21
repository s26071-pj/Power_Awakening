package Profession;

import ProfessionAbilities.HandToHandCombat;
import ProfessionAbilities.Poisons;
import ProfessionAbilities.Stealth;
import Race.Character;

public class Assassin {
    public void addAbility(Character character){
        character.addProfession("Assassin");

        Stealth stealth = new Stealth(character.getAbility());
        character.setAbility(stealth);

        Poisons poisons = new Poisons(character.getAbility());
        character.setAbility(poisons);

        HandToHandCombat handToHandCombat = new HandToHandCombat(character.getAbility());
        character.setAbility(stealth);
    }
}

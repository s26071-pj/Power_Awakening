package Profession;

import ProfessionAbilities.HandToHandCombat;
import ProfessionAbilities.SwordWelding;
import ProfessionAbilities.AxeWelding;
import ProfessionAbilities.SpearWelding;
import Race.Character;

import java.util.*;


public class Warrior{
    public void addAbility(Character character){
        character.addProfession("Hunter");

        HandToHandCombat handToHandCombat = new HandToHandCombat(character.getAbility());
        character.setAbility(handToHandCombat);

        SwordWelding swordWelding = new SwordWelding(character.getAbility());
        character.setAbility(swordWelding);

        AxeWelding axeWelding= new AxeWelding(character.getAbility());
        character.setAbility(axeWelding);

        SpearWelding spearWelding = new SpearWelding(character.getAbility());
        character.setAbility(spearWelding);
    }

}

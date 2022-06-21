package Profession;

import ProfessionAbilities.Enchantment;
import ProfessionAbilities.Alchemy;
import Race.Character;

public class Mage{
    public void addAbility(Character character){
        character.addProfession("Hunter");

        Enchantment enchantment = new Enchantment(character.getAbility());
        character.setAbility(enchantment);

        Alchemy alchemy = new Alchemy(character.getAbility());
        character.setAbility(alchemy);
    }
}

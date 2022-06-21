package Profession;

import ProfessionAbilities.InventoryReparing;
import Race.Character;

public class Armorer{

    public void addAbility(Character character){
        character.addProfession("Armorer");

        InventoryReparing reparing = new InventoryReparing(character.getAbility());
        character.setAbility(reparing);
    }
}

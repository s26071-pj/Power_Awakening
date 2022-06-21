package ProfessionAbilities;

public class InventoryReparing extends Ability{
    private Ability ability;

    public InventoryReparing(Ability ability) {
        this.ability = ability;
    }

    public String PrintAbility() {
        if (!ability.PrintAbility().contains("|Ability to repair your equipment|")) {
            return ability.PrintAbility() + "|Ability to repair your equipment|";
        }else{
            return ability.PrintAbility();
        }
    }
}

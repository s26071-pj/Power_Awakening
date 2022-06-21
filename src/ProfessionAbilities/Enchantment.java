package ProfessionAbilities;

public class Enchantment extends Ability {

    private Ability ability;

    public Enchantment(Ability ability) {
        this.ability = ability;
    }

    public String PrintAbility() {
        if (!ability.PrintAbility().contains("|Ability to use enchantments|")) {
            return ability.PrintAbility() + "|Ability to use enchantments|";
        }else{
            return ability.PrintAbility();
        }
    }
}
package ProfessionAbilities;

public class Stealth extends Ability{
    private Ability ability;

    public Stealth(Ability ability) {
        this.ability = ability;
    }

    public String PrintAbility() {
        if (!ability.PrintAbility().contains("|Ability to fight with spear|")) {
            return ability.PrintAbility() + "|Ability to fight with spear|";
        }else{
            return ability.PrintAbility();
        }
    }
}

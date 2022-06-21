package ProfessionAbilities;

public class HandToHandCombat extends Ability{
    private Ability ability;

    public HandToHandCombat(Ability ability) {
        this.ability = ability;
    }

    public String PrintAbility() {
        if (!ability.PrintAbility().contains("|Ability to use hand to hand combat|")) {
            return ability.PrintAbility() + "|Ability to use hand to hand combat|";
        }else{
            return ability.PrintAbility();
        }
    }
}

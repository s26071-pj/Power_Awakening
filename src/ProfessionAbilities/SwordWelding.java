package ProfessionAbilities;

public class SwordWelding extends Ability{
    private Ability ability;

    public SwordWelding(Ability ability) {
        this.ability = ability;
    }

    public String PrintAbility() {
        if (!ability.PrintAbility().contains("|Ability to fight with sword|")) {
            return ability.PrintAbility() + "|Ability to fight with sword|";
        }else{
            return ability.PrintAbility();
        }
    }
}

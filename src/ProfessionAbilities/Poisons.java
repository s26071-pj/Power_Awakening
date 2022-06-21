package ProfessionAbilities;

public class Poisons extends Ability{
    private Ability ability;

    public Poisons(Ability ability) {
        this.ability = ability;
    }

    public String PrintAbility() {
        if (!ability.PrintAbility().contains("|Ability to use poisons|")) {
            return ability.PrintAbility() + "|Ability to use poisons|";
        }else{
            return ability.PrintAbility();
        }
    }
}

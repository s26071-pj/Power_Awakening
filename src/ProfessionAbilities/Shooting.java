package ProfessionAbilities;

public class Shooting extends Ability{
    private Ability ability;

    public Shooting(Ability ability) {
        this.ability = ability;
    }

    public String PrintAbility() {
        if (!ability.PrintAbility().contains("|Ability to use ranged weapons|")) {
            return ability.PrintAbility() + "|Ability to use ranged weapons|";
        }else{
            return ability.PrintAbility();
        }
    }
}

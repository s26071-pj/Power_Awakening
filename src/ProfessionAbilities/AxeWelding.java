package ProfessionAbilities;

public class AxeWelding extends Ability{

    private Ability ability;

    public AxeWelding(Ability ability){
        this.ability = ability;
    }

    public String PrintAbility(){
        if (!ability.PrintAbility().contains("|Ability to fight with great axe|")){
            return ability.PrintAbility() + "|Ability to fight with great axe|";
        }else{
            return ability.PrintAbility();
        }
    }

}

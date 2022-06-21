package ProfessionAbilities;

public class Alchemy extends Ability{
    private Ability ability;

    public Alchemy(Ability ability){
        this.ability = ability;
    }
    @Override
    public String PrintAbility(){
        if (!ability.PrintAbility().contains("|Ability to use alchemy|")){ //! oznacza negacje, czyli odwrócenie wyniku(cokolwiek zwraca funckja ... zostanie odwrócone)
            return ability.PrintAbility() + "|Ability to use alchemy|";
        }else {
            return ability.PrintAbility();
        }
    }
}

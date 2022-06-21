package Race;

public class Human extends Character{
   private final String race = "Human";
   String raceAbility = "None";

   public Human(String name){
       super(name);
       this.raceAbility = raceAbility;
   }
   @Override
   public String getRaceAbility(){
       return raceAbility;
   }
   @Override
   public void setRaceAbility(String raceAbility){
       this.raceAbility = raceAbility;
   }

   public String getRace(){
       return race;
   }
}

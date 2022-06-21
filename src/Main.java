import Race.*;
import Profession.*;
import Race.Character;
import Race.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner nameObj = new Scanner(System.in);

        System.out.println("Your character name: ");
        String characterName;

        characterName = nameObj.nextLine();
        int race;
        Character character = null;
        do{
            System.out.println("To choose race for your character type a number:\n1.Human\n2.Elf\n3.Dwarf\n4.Rogue\n");
            race = nameObj.nextInt();

            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;
            if (race == 1){
                character = new Human(characterName);
            }else if (race == 2){
                character = new Dwarf(characterName);
            }else if (race == 3){
                character = new Elf(characterName);
            }else if (race == 4){
                character = new Rogue(characterName);
            }else{
                System.out.println("You did not choose correct number. Please try again with number from 1 to 4.\n");
            }
        }while (race !=1 && race !=2 && race != 3 && race != 4);

        int profession;
        do {
            System.out.println("Now choose profession for your character:\n1.Warrior\n2.Mage\n3.Assassin\n4.Armorer\n5.Hunter\n0.Start the adventure");
            profession = nameObj.nextInt();

            if (profession == 1) {
                Warrior warrior = new Warrior();
                warrior.addAbility(character);
            }
            else if (profession == 2) {
                Mage mage = new Mage();
                mage.addAbility(character);
            }
            else if (profession == 3) {
                Assassin assassin = new Assassin();
                assassin.addAbility(character);
            }
            else if (profession == 4) {
                Armorer armorer = new Armorer();
                armorer.addAbility(character);
            }
            else if (profession == 5) {
                Hunter hunter = new Hunter();
                hunter.addAbility(character);
            }
            else if (profession == 0) {
                System.out.println("\nYour character is now ready to start the adventure");
            }else {
                System.out.println("You did not choose any of the abilities for your character. Try again.\n");
            }
        } while (profession != 0);


        character.printoutCharacter();
    }

}

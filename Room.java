import java.util.Random;

public class Room {
    private final String[] attackArrays = {"Slasher", "Scribbler", "Distractor", "Tackle"};
    private final String[] attackMesages = {"I will destroy you now", "You will never get this assignment done muah hahahaha",
    "I will make you fail!", "You'll regret ever meeting me!"};
    private final String[] explainMessages = {"TIP: You get 25% progress after every fight!",
    "TIP: Everytime an enemy attacks 1 hour gets deducted from your deadline.",
    "TIP: Time is not deducted from interactions with friendly entities like me."};
    private final String[] characterNames = {"Ben", "Bob", "Michael", "Mo", "Joe", "Betty", "Max", "Martha"};
    private NPC character;

    //assigns an NPC to the room and launches the action associated with that Character
    public void assignNPC(MainCharacter main){
        Random random = new Random();
        int odds = random.nextInt(101);
        int nameGenerator = random.nextInt(8);

        if (odds >= 30){
            int attackNumber = random.nextInt(4);
            final int attackDmg = 1;
            AttackCharacter character = new AttackCharacter(characterNames[nameGenerator], attackMesages[attackNumber], attackDmg, attackArrays[attackNumber]);
            System.out.println(character.getName() + " has appeared and has " + character.getHP() + " HP and screams: ");
            character.printMessage();
            main.getAttack().fightMain(main, character);
        }
        else{
            int npcMessage = random.nextInt(3);

            character = new NPC(characterNames[nameGenerator], explainMessages[npcMessage]);
            System.out.println(character.getName() + " has appeared. ");

            character.printMessage();
        }
    }



}

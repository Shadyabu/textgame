import java.util.Scanner;

public class Attack {
    private String attackName;
    private int damage;

    //constructor for attack
    public Attack(String atk, int dmg){
        this.attackName = atk;
        this.damage = dmg;
    }

    //method for the main character to attack an AttackCharacter, automatically links to the fightNPC method
    //to let the AttackCharacter get his turn in fighting until one of them dies/ looses the game
    public void fightMain(MainCharacter main, AttackCharacter victim){
        System.out.println("You attack. ");
        final int progress = 25;
        System.out.println(attackName + " has been used.");
        if(victim.hurt(damage) <= 0){
            System.out.println("Enemy has been defeated");
            main.getMainAssignment().addProgress(progress);
            System.out.println("Congrats, you've earned " + progress + "% progress on your assignment and are now at "+ main.getMainAssignment().getProgress() + "%.");
        }
        else {
            System.out.println("Enemy has " + victim.getHP() +"HP");
            System.out.println("Keep fighting!");
            victim.getAttack().fightNPC(main, victim);
        }
    }

    //method for the AttackCharacter to attack the main character
    public void fightNPC(MainCharacter victim, AttackCharacter main){
        System.out.println(main.getName() + " strikes back");
        System.out.println(attackName + " has been used.");
        victim.getMainAssignment().deductTime(main.getAttack().damage);
        boolean fighting = escape();
        if (fighting == true){
            victim.getAttack().fightMain(victim, main);
        }

    }

    //asks the user whether they wish to keep fighting or to escape;
    //returns a boolean in order to continue or stop the attack
    public boolean escape(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you wish to keep fighting or to escape?");
        System.out.println("Type 1 for fight and 2 for escape.");
        int fightOrEscape = Integer.parseInt(scanner.nextLine());

        if (fightOrEscape == 1){
            return true;
        }
        else if (fightOrEscape == 2){
            System.out.println("You have escaped!");
            return false;
        }
        else{
            System.out.println("Only type 1 or 2 any other input does not work. Try again");
            escape();
            return false;
        }
    }
}


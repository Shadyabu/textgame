import java.util.Scanner;

public class MainCharacter extends Character{
    private final int dmg = 1;
    private Attack MCAttack;
    private Assignment mainAssignment = new Assignment();

    //constructor for main character
    public MainCharacter(String n, String atk) {
        super(n);
        this.MCAttack = new Attack(atk, dmg);
    }

    //returns the assignment linked to the object
    public Assignment getMainAssignment(){
        return mainAssignment;
    }

    //returns the attack linked to the main character
    public Attack getAttack(){return MCAttack;}


    //checks for which direction the player is going in and has a loop which ensures the proper int input
    public void direction(){
        Scanner scanner = new Scanner(System.in);
        boolean correctInput = false;

        System.out.println("You can go forwards, to the right or to the left.");

        while (correctInput == false) {

            try{
                System.out.println("Type 1 for forwards, 2 for left and 3 for right.");

                int direction = Integer.parseInt(scanner.nextLine());

                if (direction == 1) {
                    System.out.println("You moved forward");
                    correctInput = true;
                }
                else if (direction == 2) {
                    System.out.println("You moved left");
                    correctInput = true;
                }
                else if (direction == 3) {
                    System.out.println("You moved right");
                    correctInput = true;
                }
                else {
                    System.out.println("Error, input either a 1, 2 or 3. Try again.");
                }
            }
            catch(Exception e){
                System.out.println("Error, input either a 1, 2 or 3. Try again.");
            }

        }
    }
}

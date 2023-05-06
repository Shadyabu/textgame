import java.util.Scanner;

public class LibraryRun {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //introduction to game
        System.out.println("Welcome to Library Run!");

        System.out.println("what do you wish to call your Character?");
        MainCharacter me = new MainCharacter(scanner.nextLine(), "Defeater");

        System.out.println("In this game you have an assignment due in " + me.getMainAssignment().getTimeLeft() + " hours.");
        System.out.println("Your goal is to finish the assignment on time while facing different challenges in the library");

        Room room = new Room();

        //loop that keeps the game going until the progress is finished
        while(me.getMainAssignment().getProgress()>0){
            me.direction();
            room.assignNPC(me);
        }

    }

}

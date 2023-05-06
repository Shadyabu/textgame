public class Assignment {

    private int progress = 100;
    private int timeLeft = 8;
    private final int due = 0;

    //returns the progress done on the assignment
    public int getProgress(){
        return progress;
    }

    //returns the time left for the assignment
    public int getTimeLeft(){
        return timeLeft;
    }

    //adds the progress made to the assignment and stops the game if the assignment is complete
    public void addProgress(int prog){
        progress -= prog;
        if(progress == due){
            System.out.println("Congrats you won the game!");
            System.exit(0);
        }
    }

    //deducts time from the assignment and stops the game if time has run out
    public void deductTime (int time){
        timeLeft -= time;
        if(timeLeft <= due){
            System.out.println("Time has run out. You loose!");
            System.exit(0);
        }
        else{
            System.out.println("You have " + timeLeft + " hour(s) left.");
        }
    }

}

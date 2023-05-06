public class NPC extends Character{
    private String message;

    //constructor for NPC
    public NPC(String n, String m) {
        super(n);
        this.message = m;
    }

    //prints out the message
    public void printMessage(){
        System.out.println(message);
    }
}

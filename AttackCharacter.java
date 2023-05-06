public class AttackCharacter extends NPC{
    private Attack charAttack;
    private int HP = 2;

    //constructor for AttackCharacter
    public AttackCharacter(String n, String m, int dmg, String atkName) {
        super(n, m);
        this.charAttack = new Attack(atkName, dmg);
    }

    //returns attack
    public Attack getAttack(){
        return charAttack;
    }

    //returns HP
    public int getHP(){
        return HP;
    }

    //removes HP from character
    public int hurt(int dmg){
        HP -= dmg;
        return HP;
    }

}

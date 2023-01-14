/* Warrior Class
        This class will manage the main attributes of all the Warrior characters in the game, as well as some class specific processes.

        Private Instance Variables

        int attack -- the additional power and expertise that a Warrior brings to a physical attack.
        Constructors

public Warrior(String n) -- initializes name with the parameter.  The starting values of strength, intelligence, and piety are 12, 6, and 8
respectively and are passed to the superclass constructor.  Attack is set to 10 initially.
        Methods

public int attack() -- Warriors do damage to their enemies.
        calculated by multiplying attack, strength, and level;
        the calculated value is returned.
public void bandAid() -- Warriors cannot heal themselves.  However, they can purchase bandages and so can bind their own wounds with an herbal
 poultice.
        use the superclass heal() method and pass a value of 4.
public void levelUp() -- All characters can levelUp() but some have specific changes to their own special attributes.
        use the superclass levelUp().
        strength is increased by 3; use the updateStr() method.
        increase attack by 1.
        toString()

        This method should return a combination of variables and text.  When using the superclass toString(), the only additional piece of text
        needed is at the beginning "Warrior ".  See the example below for format.
        Warrior Conan currently has 242 health of a max 300
 */

public class Warrior extends PlayerCharacter{
    private int attack;

    public Warrior(String n) {
        super(n, 12, 6, 8);
        this.attack = 10;
    }

    public int attack() {
        return this.attack * getStr() * getLevel();
    }

    public void bandAid() {
        heal(4);
    }

    public void levelUp() {
        super.levelUp();
        this.updateStr(3);
        this.attack++;
    }

    public String toString() {
        return "Warrior " + super.toString();
    }

}

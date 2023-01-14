/*
Wizard Class
This class will manage the main attributes of all the Wizard characters in the game, as well as some class specific processes.

Private Instance Variables

int magic -- the additional power and expertise that a Wizard brings to a magical attack.
Constructors

public Wizard(String n) -- initializes name with the parameter.  The starting values of strength, intelligence, and piety are 6, 12, and 8
respectively and are passed to the superclass constructor.  Magic is set to 10 initially.
Methods

public int cast() -- Wizards hang back and cast damaging spells on their enemies.
calculated by multiplying magic, intelligence, and level;
the calculated value is returned.
public int attack() -- Wizards are not great fighters, but if they run out of spell power, they can use their staff or dagger in a pinch.
Since they are not trained warriors, their attack power is only based on experience and what little strength they do have.
calculated by multiplying strength and level;
the calculated value is returned.
public void levelUp() -- All characters can levelUp() but some have specific changes to their own special attributes.
use the superclass levelUp().
strength is increased by 1, but only every three levels starting at 3rd.  Use the updateStr() method.
intelligence is increased by 2.
increase magic by 2.
toString()

This method should return a combination of variables and text.  When using the superclass toString(), the only additional piece
of text needed is at the beginning "Wizard ".  See the example below for format.
Wizard Gandalf currently has 137 health of a max 300
 */

public class Wizard extends PlayerCharacter{
    private int magic;


    public Wizard(String n) {
        super(n, 6, 12, 8);
        this.magic = 10;
    }

    public int cast() {
        return this.magic * getInt() * getLevel();
    }

    public int attack() {
        return getStr() * getLevel();
    }

    public void levelUp() {
        super.levelUp();

        // slow strengh progression
        if (getLevel() % 3 == 0) {
            updateStr(1);
        }
        updateInt(2);
        this.magic += 2;
    }

    public String toString() {
        return "Wizard " + super.toString();
    }
}

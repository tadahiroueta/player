/*
Healer Class
This class will manage the main attributes of all the Healer characters in the game, as well as some class specific processes.

Private Instance Variables

int heal -- the divine energies and power that a Healer brings to rendering aid and comfort to the party.
Constructors

public Healer(String n) -- initializes name with the parameter.  The starting values of strength, intelligence, and piety are 8, 8, and 12
respectively and are passed to the superclass constructor.  Heal is set to 10 initially.
public Healer(String n, int s, int i, int p, int h) -- This constructor is made for the subclass healers (Cleric, Paladin, Shaman, etc.);
those with specific attributes passed via parameters.  The name, strength, intelligence, and piety are passed to the superclass constructor.
Heal is initialized via the "h" parameter.
Methods

public int heal() -- Healers can repair the damage from villains' and monsters' attacks.
calculated by multiplying heal, piety, and level;
the calculated value is returned.
public int attack() -- Healers are not great fighters, but if they are not healing anyone, they can grab a mace or hammer and wail away at the
enemies.  Most healers are not trained warriors, their attack power is only based on experience and the strength they do have.
calculated by multiplying strength and level;
the calculated value is returned.
public void levelUp() -- All characters can levelUp() but some have specific changes to their own special attributes.
use the superclass levelUp().
strength is increased by 1, but only every even-numbered level.  Use the updateStr() method.
piety is increased by 2.
increase heal by 1.
"Getter"

getHeal() -- this is a unique ability of the "Healer" class and the subclasses need access
toString()

This method should return a combination of variables and text.  When using the superclass toString(), the only
additional piece of text needed is at the beginning "Healer".  See the example below for format.
Healer Dr. McCoy currently has 49 health of a max 450
 */

public class Healer extends PlayerCharacter {
    private int heal;

    public Healer(String n) {
        super(n, 8, 8, 12);
        this.heal = 10;
    }

    public Healer(String n, int s, int i, int p, int h) {
        super(n, s, i, p);
        this.heal = h;
    }

    public int getHeal() {
        return heal;
    }

    public int heal() {
        return getHeal() * getPiety() * getLevel();
    }

    public int attack() {
        return getStr() * getLevel();
    }

    public void levelUp() {
        super.levelUp();

        // weak progress
        if (getLevel() % 2 == 0) {
            updateStr(1);
        }
        updatePiety(2);
        this.heal++;
    }

    public String toString() {
        return "Healer " + super.toString();
    }
}

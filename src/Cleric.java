/*
Cleric Class
This class will manage the main attributes of all the Cleric characters in the game, as well as some class specific
processes.

Private Instance Variables

NONE -- there are no Cleric specific attributes
Constructors

public Cleric(String n) -- initializes name with the parameter.  The starting values of strength, intelligence, piety,
and heal are 9, 7, 12, and 11 respectively and are passed to the Healer superclass constructor.
Methods

public int heal() -- Clerics are better healers than Healers.
calculated by multiplying heal, piety, level and 1.2 (20% better than Healers);
the calculated value is returned as an integer.
public int attack() -- Clerics are not great fighters, but if they are not healing anyone, they can grab a mace or
hammer and wail away at the enemies.  Most healers are not trained warriors, their attack power is only based on
experience and the strength they do have.
calculated by multiplying strength and level and 0.67;
the calculated value is returned as an integer.
toString()

This method should return a combination of variables and text.  This method cannot use the superclass method.  The
name, currHealth, and maxHealth can be retrieved from the PlayerCharacter class by normal getter method calls.  See
the example below for format.
Cleric Father Mike currently has 129 health of a max 350
 */


public class Cleric extends Healer {
    public Cleric(String n) {
        super(n, 9, 7, 12, 11);
    }

    public int heal() {
        return (int) (getHeal() * getPiety() * getLevel() * 1.2);
    }

    public int attack() {
        return (int) (getStr() * getLevel() * 0.67);
    }

    public String toString() {
        return "Cleric " + getName() + " currently has " + getCurrHealth() + " health of a max " + getMaxHealth();
    }
}

/*Private Instance Variables

String name -- the name of the character.
int strength -- the power of a character's physical attack.
int intelligence -- the ability of a character to cast spells.
int piety -- the divine power used for healing.
int level -- current experience level of the character.
int maxHealth -- the maximum health of the character (50 times the level).
int currHealth -- the current health of the character (cannot exceed maxHealth).
Constructors

public PlayerCharacter(String n, int s, int i, int p) -- initializes name, strength, intelligence and piety with the parameters.  Level is set
to 1; maxHealth and currHealth are set to 50.
Methods

public void levelUp()
increases maxHealth by 50;
resets currHealth to maxHealth; and
adds 1 to level.
public void takeDamage(int dmg)
decreases currHealth by dmg;
checks to see if the player is unconscious (currHealth is less than or equal to 0);
if TRUE -- display message "Uh oh, you are unconscious."
public void heal(int h)
increases currHealth by h;
ensures currHealth does not exceed maxHealth, reduces to maxHealth if TRUE.
"Getters / Setters"

getLevel()
getStr()
getInt()
getPiety()
getName()
getCurrHealth()
getMaxHealth()
updateStr(int n)
updateInt(int n)
updatePiety(int n)
toString()

This method should return a combination of variables and text.  These variables are included: name, currHealth, and maxHealth.  See the example below for format.
Conan currently has 242 health of a max 300
 */

public class PlayerCharacter {
    private final String name;
    private int strength;
    private int intelligence;
    private int piety, level, maxHealth, currHealth;


    public PlayerCharacter(String n, int s, int i, int p) {
        this.name = n;
        this.strength = s;
        this.intelligence = i;
        this.piety = p;
        this.level = 1;
        this.maxHealth = 50;
        this.currHealth = 50;
    }

    public int getCurrHealth() {
        return currHealth;
    }

    public int getInt() {
        return intelligence;
    }

    public int getPiety() {
        return piety;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getStr() {
        return strength;
    }

    public String getName() {
        return name;
    }

     public void updatePiety(int value) {
        this.piety += value;
     }

     public void updateStr(int value) {
        this.strength += value;
     }

     public void updateInt(int value) {
        this.intelligence += value;
     }

    @Override
    public String toString() {
        return this.getName() + " currently has " + this.getCurrHealth() + " health of a max " + this.getMaxHealth();
    }

    public void levelUp() {
        this.maxHealth += 50;
        this.currHealth = this.maxHealth;
        this.level++;
    }

    public void takeDamage(int dmg) {
        this.currHealth -= dmg;

        // check for knockout
        if (this.currHealth <= 0) {
            System.out.println("Uh oh, you are unconscious.");
        }
    }

    public void heal(int h) {
        this.currHealth += h;

        // too much health
        if (this.currHealth > this.maxHealth) {
            this.currHealth = this.maxHealth;
        }
    }
}








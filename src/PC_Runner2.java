public class PC_Runner2
{
    public static void main(String[] args)
    {
        Warrior conan = new Warrior("Conan");
        System.out.println("Conan" + displayAttributes(conan));
        System.out.println();
        Wizard gandalf = new Wizard("Gandalf");
        System.out.println("Gandalf" + displayAttributes(gandalf));
        System.out.println();
        Healer dr_pepper = new Healer("Dr. Pepper");
        System.out.println("Dr. Pepper" + displayAttributes(dr_pepper));
        System.out.println();
        Cleric friar_tuck = new Cleric("Friar Tuck");
        System.out.println("Friar Tuck" + displayAttributes(friar_tuck));
        System.out.println("**********************************");
        System.out.println("******** Time to Level Up ********");
        System.out.println("**********************************");
        for(int i = 0; i < 4; i++)
        {
            conan.levelUp();
            gandalf.levelUp();
            dr_pepper.levelUp();
            friar_tuck.levelUp();
        }
        System.out.println("Conan" + displayAttributes(conan));
        System.out.println();
        System.out.println("Gandalf" + displayAttributes(gandalf));
        System.out.println();
        System.out.println("Dr. Pepper" + displayAttributes(dr_pepper));
        System.out.println();
        System.out.println("Friar Tuck" + displayAttributes(friar_tuck));
        System.out.println();

        conan.takeDamage(25);
        gandalf.takeDamage(50);
        dr_pepper.takeDamage(75);
        friar_tuck.takeDamage(100);
        System.out.println(conan);
        System.out.println(gandalf);
        System.out.println(dr_pepper);
        System.out.println(friar_tuck);
        System.out.println("Dr. Pepper can heal for " + dr_pepper.heal());
        System.out.println("Friar Tuck can heal for " + friar_tuck.heal());
        gandalf.heal(friar_tuck.heal());
        System.out.println(gandalf);
    }

    public static String displayAttributes(PlayerCharacter obj)
    {
        return "\nSTR:\t" + obj.getStr() +
        "\nINT:\t" + obj.getInt() + 
        "\nPIE:\t" + obj.getPiety() +
        "\nLevel:\t" + obj.getLevel() +
        "\nMax HP\t" + obj.getMaxHealth();
    }
}
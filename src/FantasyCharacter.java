import java.util.Random;

public class FantasyCharacter implements Fighter{
    //Имя персонажа
    private String name;
    //Статы персонажа
    private int healthPoints;
    private int strength;
    private int dexterity;
    //Опыт и золото
    private int xp;
    private int gold;

    public FantasyCharacter(String name, int healthPoints, int strength, int dexterity, int xp, int gold) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.xp = xp;
        this.gold = gold;
    }
    //метод ведения боя
    @Override
    public int attack() {
        if (dexterity * 3 > getRandomValue()) return strength;
        else return 0;
    }

    private int getRandomValue() {
        return (int) (Math.random()*100);
    }
}

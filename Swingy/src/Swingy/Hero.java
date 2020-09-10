package Swingy;

public class Hero {
    private String name;
    private String lass;
    private int level;
    private String Experience;
    private String attack;
    private String defense;
    private int Points;

    public Hero(String name, String lass, int level, String Experience, String attack, String defense, int Points)
    {
        super();
        this.name = name;
        this.lass = lass;
        this.level = level;
        this.Experience = Experience;
        this.attack = attack;
        this.defense = defense;
        this.Points = Points;
    }
    public String toString(){
        return "Hero [name=" + name + ",attack="+ attack + ",level="+ level + Experience +"]";
    }
}

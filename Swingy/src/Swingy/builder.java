package Swingy;

public class builder {
    private String name;
    private String lass;
    private int level;
    private String Experience;
    private String attack;
    private String defense;
    private int Points;

    public builder setname(String name){
        this.name = name;
        return this;
    }
    public builder setlass(String lass){
        this.lass = lass;
        return this;
    }
    public builder setlevel(int level){
        this.level = level;
        return this;
    }

    public builder setExperience(String Experience){
        this.Experience = Experience;
        return this;
    }
    public  builder setattack(String attack){
        this.attack = attack;
        return this;
    }
    public builder setdefense(String defense){
        this.defense = defense;
        return this;
    }
    public  builder setPoints(int Points){
        this.Points = Points;
        return this;
    }
    public Hero getHero(){
        return new Hero(name, lass,level,Experience,attack,defense,Points);
    }
}

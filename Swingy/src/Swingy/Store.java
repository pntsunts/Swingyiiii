package Swingy;

public class Store {
    public static void main(String[] args){
        Hero p = new builder().setname("Peter").setattack("Fight").setlevel(7).setExperience("Xp").getHero();
        System.out.println(p);
    }
}

public class Armour implements Accessories{
    protected double DefBuff = 15;
    protected double AGIDeBuff = 5;
    protected int price = 120;
    //constructor
    public Armour(){};

    @Override
    public void ShowStat(){
        System.out.println("Armour Stats");
        System.out.println("DEF Buff: " + DefBuff);
        System.out.println("AGI DeBuff: " + AGIDeBuff);
        System.out.println("-----------------Show Stat Done-----------------");
    }

}

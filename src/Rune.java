public class Rune implements Accessories{
    protected double MPBuff = 10;
    protected double AGIBuff = 10;
    protected double ATKBuff = 10;
    protected int price = 120;

    //constructor
    public Rune() {};

    @Override
    public void ShowStat(){
        System.out.println("Rune Stats");
        System.out.println("MP Buff: " + MPBuff);
        System.out.println("AGI Buff: " + AGIBuff);
        System.out.println("ATK Buff: " + ATKBuff);
        System.out.println("-----------------Show Stat Done-----------------");
    }

}

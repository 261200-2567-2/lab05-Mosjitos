public class Main {
    public static void main(String[] args) {
    KruBa Orahun = new KruBa("Orahun");
    Orahun.ShowStat();
    NakDab MooDeng = new NakDab("MooDeng");
    MooDeng.ShowStat();

//    System.out.println();
//    System.out.println("Buy Accessories. But can't afford it, lol.");
//    System.out.println();
//    Orahun.BuyArmour();
//    MooDeng.BuyRune();
//    Orahun.ShowStat();
//    MooDeng.ShowStat();

    System.out.println();
    System.out.println("Base Action and Level UP");
    System.out.println();

    Orahun.TakeDamage(MooDeng.Attack());
//    Orahun.ShowStat();
//    MooDeng.ShowStat();

//    System.out.println();
//    System.out.println("Level UP MooDeng");
//    System.out.println();
    Orahun.TakeDamage(MooDeng.Attack());
    Orahun.ShowStat();
    MooDeng.ShowStat();

    System.out.println();
    System.out.println("Buy MooDeng Rune and Equip");
    System.out.println();
    MooDeng.BuyRune();
    MooDeng.ShowStat();

    System.out.println();
    System.out.println("Orahun turn");
    System.out.println();
    MooDeng.TakeDamage(Orahun.Attack());
    MooDeng.TakeDamage(Orahun.Attack());
    Orahun.ShowStat();
    System.out.println();
    System.out.println("Orahun Buy Armour and Equip");
    System.out.println();
    Orahun.BuyArmour();
    Orahun.ShowStat();

    }
}
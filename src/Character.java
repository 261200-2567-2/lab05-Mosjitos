import java.util.Scanner;
public class Character implements CharacterInterface{
    protected String Name = "None";
    protected double MaxHP = 50.00;
    protected double HP = MaxHP;
    protected double Experience = 0;
    protected int LV = 1;
    protected double MaxMP = 20;
    protected double MP = MaxMP;
    protected double MaxAGI = 20;
    protected double AGI = MaxAGI;
    private double BaseDamage = 5;
    protected double ATK = BaseDamage;
    protected double Def = 0.00;
    protected int Gold = 100;
    protected boolean EquippedRune = false;
    protected boolean EquippedArmor = false;
    protected Rune rune = new Rune();
    protected Armour armour = new Armour();


    @Override
    public double GainExperience(int XP) {
        Experience += XP;
        double conditionLVUP = LV*10;
        if(Experience >= conditionLVUP){
            LevelUp();
        }
        return Experience;
    }

    @Override
    public void LevelUp(){
        LV += 1;
        MaxHP += MaxHP*0.25*LV;
        HP = MaxHP;
        MaxMP += (0.5*MaxMP) + (2*LV);
        MP = MaxMP;
        MaxAGI += MaxAGI/2 + LV;
        AGI = MaxAGI;
        Gold += LV*20;
    }

    @Override
    public void EarnGold(int amount) {
        Gold += amount;
    }

    @Override
    public void TakeDamage(double Damage){
        System.out.println(Name + " Got Attacked Damage : " + Damage);
        HP = HP - Damage + Def;
        if(HP <= 0){
            System.out.println("Die. But you can do an action.");
            System.out.println("TOO LAZY to do this condition. =)");
        }
    }

    @Override
    public double Attack(){
        GainExperience(5*LV);
        EarnGold(5*LV);
        return ATK;
    }

    @Override
    public void BuyRune(){
        if (rune.price > Gold){
            System.out.println(Name + ", You dont have enough Gold. You need " + rune.price + " Gold to get Rune.");
        } else {
            Gold = Gold - rune.price;
            System.out.println("Successfully purchase Rune.");
            System.out.println("You want to Equip Rune Y/N ?");
            Scanner scanner = new Scanner(System.in);
            String ans = scanner.nextLine();
            if(ans.equals("Y")){
                EquippedRune = true;
                rune.ShowStat();
                MaxMP += rune.MPBuff;
                MP += rune.MPBuff;
                AGI += rune.AGIBuff;
                MaxAGI += rune.AGIBuff;
                ATK += rune.ATKBuff;
                System.out.println("Equipped Rune");
            }
        }
    }

    @Override
    public void BuyArmour(){
        if (armour.price > Gold){
            System.out.println(Name + ", You dont have enough Gold. You Need " + armour.price + " Gold to get Armour.");
        } else {
            Gold = Gold - armour.price;
            System.out.println("Successfully purchase Armour.");
            System.out.println("You want to Equip Armour Y/N ?");
            Scanner scanner = new Scanner(System.in);
            String ans = scanner.nextLine();
            if(ans.equals("Y")){
                EquippedArmor = true;
                armour.ShowStat();
                Def += armour.DefBuff;
                AGI -= armour.AGIDeBuff;
                MaxAGI -= armour.AGIDeBuff;
                System.out.println("Equipped Armour");
            }
        }
    }

    @Override
    public void TakeOff(String accessories){
        if(accessories == "Rune"){
            if(EquippedRune){
                EquippedRune = false;
                MP -= rune.MPBuff;
                MaxMP -= rune.MPBuff;
                AGI -= rune.AGIBuff;
                MaxAGI -= rune.AGIBuff;
                ATK -= rune.ATKBuff;
            } else {
                System.out.println("You didn't Equip Rune at first.");
            }
        } else if (accessories == "Armour"){
            if(EquippedArmor){
                EquippedArmor = false;
                Def -= armour.DefBuff;
                AGI += armour.AGIDeBuff;
                MaxAGI += armour.AGIDeBuff;
            } else {
                System.out.println("You didn't Equip Armour at first.");
            }
        }
    }

    @Override
    public void ShowStat(){
        System.out.println("Name: " + Name);
        System.out.println("HP: " + HP );
        System.out.println("LV: " + LV);
        System.out.println("Experience: " + Experience +"/"+ 10*LV);
        System.out.println("MP: " + MP +"/"+ MaxMP);
        System.out.println("AGI: " + AGI +"/"+ MaxAGI);
        System.out.println("ATK: " + ATK);
        System.out.println("Def: " + Def);
        System.out.println("Gold: " + Gold);
        if(EquippedRune && EquippedArmor){
            System.out.println("Accessories: Rune and Armour");
        } else if(EquippedRune){
            System.out.println("Accessories: Rune ");
        } else if(EquippedArmor){
            System.out.println("Accessories: Armour");
        } else {
            System.out.println("Accessories: None");
        }
        System.out.println("-----------------Show Stat Done-----------------");
    }
}

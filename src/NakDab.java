public class NakDab extends Character{
    private String weapon = "Sword";
    private double AtkSkill = 0;
    //Constructor
    public NakDab(String name) {
        double hp = 55;
        double mp = 18;
        double agi = 25;
        double atk = 10*LV + agi/2;
        double def = 10;
        this.Name = name;
        this.MaxHP = hp;
        this.HP = this.MaxHP;
        this.MaxMP = mp;
        this.MP = this.MaxMP;
        this.MaxAGI = agi;
        this.AGI = this.MaxAGI;
        this.ATK = atk;
        this.Def = def;
    }

    public double TeeShing(){
        GainExperience(5*LV);
        EarnGold(5*LV);
        double MP_UseRate = 2*LV;
        MP -= MP_UseRate;
        AtkSkill = ATK + MP_UseRate + AGI/4;
        return AtkSkill;
    }

    @Override
    public void ShowStat(){
        System.out.println("Name: " + Name);
        System.out.println("Job: NakDab");
        System.out.println("HP: " + HP +"/"+ MaxHP);
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
        System.out.println("Special Weapon: " + weapon);
        System.out.println("Special Skill: TeeShing");
        System.out.println("-----------------Show Stat Done-----------------");
    }
}

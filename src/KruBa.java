public class KruBa extends Character{
    private String weapon = "Holy Water";
    private double AtkSkill;
    //Constructor

    public KruBa(String name) {
        double hp = 40;
        double mp = 25;
        double agi = 18;
        double atk = 14*LV + agi/2;
        double def = 8;
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

    public double CastSpell(){
        GainExperience(5*LV);
        EarnGold(5*LV);
        double MP_UseRate = 5*LV ;
        MP -= MP_UseRate;
        AtkSkill = ATK + MP_UseRate;
        return AtkSkill;
    }

    @Override
    public void ShowStat(){
        System.out.println("Name: " + Name);
        System.out.println("Job: KruBa");
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
        System.out.println("Special Skill: CastSpell");
        System.out.println("-----------------Show Stat Done-----------------");
    }


}

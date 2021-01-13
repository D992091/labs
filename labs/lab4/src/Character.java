public class Character {
    private Types type;
    private long HP;
    private long Attack;
    private long Defend;
    private Types weakType;
    private Types highType;

    public Character(Types type, long HP, long Attack, long Defend, Types weakType, Types highType) {
        this.type = type;
        this.HP = HP;
        this.Attack = Attack;
        this.Defend = Defend;
        this.weakType = weakType;
        this.highType = highType;
    }

    public Types getType() {
        return type;
    }

    public long getHP() {
        return HP;
    }

    public void setHP(long HP){
        this.HP = HP;
    }

    public long getAttack() {
        return Attack;
    }

    public long getDefend() {
        return Defend;
    }

    public Types getWeakType() {
        return weakType;
    }

    public Types getHighType() {
        return highType;
    }
}

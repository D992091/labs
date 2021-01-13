public class DefaultParameters implements Parameters {
    private long HP=0;
    private long Attack=0;
    private long Defend=0;

    DefaultParameters(long HP,long Attack, long Defend){
        this.HP = HP;
        this.Attack = Attack;
        this.Defend = Defend;
    }

    public long getHP() {
        return HP;
    }

    public long getAttack() {
        return Attack;
    }

    public long getDefend() {
        return Defend;
    }

    public void setHP(long HP) {
        this.HP = HP;

    }

    public void setAttack(long Attack) {
        this.Attack = Attack;

    }
    public void setDefend(long Defend) {
        this.Defend = Defend;
    }
}

public class UniversalCharacter implements CharacterBuilder {
    private Types type;
    private long HP;
    private long Attack;
    private long Defend;
    private Types weakType;
    private Types highType;

    @Override
    public void setType(Types type) {
        this.type = type;
    }

    @Override
    public void setHP(long HP) {
        this.HP = HP;
    }

    @Override
    public void setAttack(long Attack) {
        this.Attack = Attack;
    }

    @Override
    public void setDefend(long Defend) {
        this.Defend = Defend;
    }

    @Override
    public void setWeakType() {
        weakType = null;
    }

    @Override
    public void setHighType() {
        highType = null;
    }
    public Character getResult(){
        return new Character(type,HP,Attack,Defend,weakType,highType);
    }
}

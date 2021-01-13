public class DefaultCharacter implements Character {
    Parameters parameters;

    public DefaultCharacter(Parameters parameters){
        this.parameters = parameters;
    }

    public long getHP() {
        return parameters.getHP();
    }
    public long getAttack() {
        return parameters.getAttack();
    }

    public long getDefend() {
        return parameters.getDefend();
    }

    public void setHP(long HP) {
        parameters.setHP(HP);
    }

}

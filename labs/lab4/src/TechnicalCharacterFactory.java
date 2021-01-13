public class TechnicalCharacterFactory implements CharacterFactory {
    @Override
    public Character createCharacter(long HP, long Attack, long Defend) {
        TechnicalCharacter Character = new TechnicalCharacter();
        Character.setAttack(Attack);
        Character.setHP(HP);
        Character.setType(Types.TECHNICAL);
        Character.setDefend(Defend);
        Character.setHighType();
        Character.setWeakType();
        return Character.getResult();
    }
}

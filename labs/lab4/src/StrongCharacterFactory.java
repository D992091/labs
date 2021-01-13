public class StrongCharacterFactory implements CharacterFactory {
    @Override
    public Character createCharacter(long HP, long Attack, long Defend) {
        StrongCharacter Character = new StrongCharacter();
        Character.setAttack(Attack);
        Character.setHP(HP);
        Character.setType(Types.STRONG);
        Character.setDefend(Defend);
        Character.setHighType();
        Character.setWeakType();
        return Character.getResult();
    }
}

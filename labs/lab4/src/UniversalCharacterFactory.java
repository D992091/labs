public class UniversalCharacterFactory implements CharacterFactory {
    @Override
    public Character createCharacter(long HP, long Attack, long Defend) {
        UniversalCharacter Character = new UniversalCharacter();
        Character.setAttack(Attack);
        Character.setHP(HP);
        Character.setType(Types.UNIVERSAL);
        Character.setDefend(Defend);
        Character.setHighType();
        Character.setWeakType();
        return Character.getResult();
    }
}

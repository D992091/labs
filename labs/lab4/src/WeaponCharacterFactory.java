public class WeaponCharacterFactory implements CharacterFactory {
    @Override
    public Character createCharacter(long HP, long Attack, long Defend) {
        WeaponCharacter Character = new WeaponCharacter();
        Character.setAttack(Attack);
        Character.setHP(HP);
        Character.setType(Types.WEAPON);
        Character.setDefend(Defend);
        Character.setHighType();
        Character.setWeakType();
        return Character.getResult();
    }
}

public class PhysicsCharacterFactory implements CharacterFactory {

    @Override
    public Character createCharacter(long HP, long Attack, long Defend) {
        PhysicsCharacter Character = new PhysicsCharacter();
        Character.setAttack(Attack);
        Character.setHP(HP);
        Character.setType(Types.PHYSICS);
        Character.setDefend(Defend);
        Character.setHighType();
        Character.setWeakType();
        return Character.getResult();
    }
}

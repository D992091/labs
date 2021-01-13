public class CharacterFactory {
public static Character createCharacter(Long HP,Long Attack,Long Defend){
    return new DefaultCharacter(new DefaultParameters(HP,Attack,Defend));
}
}

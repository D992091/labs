public class Main {
    public static void fight(Character character1, Character character2){
        long firstHP = character1.getHP();
        long secondHP = character2.getHP();
        System.out.println("Здоровье первого игрока:"+ character1.getHP());
        System.out.println("Здоровье второго игрока:"+ character2.getHP());
        System.out.println();
        while(!(character1.getHP()<1) || !(character2.getHP()<1)){
            System.out.println("Первый игрок атакует");
            long firstPlayerAttack = 0;
            if(character1.getType().equals(character2.getHighType())) {
                firstPlayerAttack = character1.getAttack()*2 - character2.getDefend();
            }else if(character1.getType().equals(character2.getWeakType())){
                firstPlayerAttack = character1.getAttack() - character2.getDefend()*2;
            }else{
                firstPlayerAttack = character1.getAttack() - character2.getDefend();
            }
            if(firstPlayerAttack<1) firstPlayerAttack=1;
            System.out.println("Первый игрок наносит "+ firstPlayerAttack+" урона");
            character2.setHP(character2.getHP()-firstPlayerAttack);
            if(character2.getHP()<1) {
                System.out.println("Первый игрок победил");
                break;
            }
            System.out.println("Здоровье второго игрока: "+ character2.getHP());
            System.out.println("Второй игрок атакует");
            long secondPlayerAttack = 0;
            if(character2.getType().equals(character1.getHighType())) {
                secondPlayerAttack = character2.getAttack()*2 - character1.getDefend();
            }else if(character2.getType().equals(character1.getWeakType())){
                secondPlayerAttack = character2.getAttack() - character1.getDefend()*2;
            }else{
                secondPlayerAttack = character2.getAttack() - character1.getDefend();
            }
            if(secondPlayerAttack<1) secondPlayerAttack=1;
            System.out.println("Второй игрок наносит "+ secondPlayerAttack+" урона");
            character1.setHP(character1.getHP()-secondPlayerAttack);
            if(character1.getHP()<1){
                System.out.println("Второй игрок победил");
                break;
            }
            System.out.println("Здоровье первого игрока: "+ character1.getHP());

        }
        character1.setHP(firstHP);
        character2.setHP(secondHP);

    }
    public static void main(String...args){
        CharacterFactory characterFactory = new PhysicsCharacterFactory();
        CharacterFactory characterFactory1 = new StrongCharacterFactory();
        CharacterFactory characterFactory2 = new WeaponCharacterFactory();
        Character character1 = characterFactory.createCharacter(30L,8L,8L);
        Character character2 =  characterFactory1.createCharacter(30L,8L,8L);
        Character character3 = characterFactory2.createCharacter(25L,7L,2L);
        fight(character1,character2);
        fight(character2,character3);
    }
}

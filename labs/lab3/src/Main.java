public class Main {
    public static void fight(Character character1, Character character2){
        long firstHP = character1.getHP();
        long secondHP = character2.getHP();
        System.out.println("Здоровье первого игрока:"+ character1.getHP());
        System.out.println("Здоровье второго игрока:"+ character2.getHP());
        System.out.println();
        while(!(character1.getHP()<1) || !(character2.getHP()<1)){
            System.out.println("Первый игрок атакует");
            long firstPlayerAttack = character1.getAttack()-character2.getDefend();
            if(firstPlayerAttack<1) firstPlayerAttack=1;
            System.out.println("Первый игрок наносит "+ firstPlayerAttack+" урона");
            character2.setHP(character2.getHP()-firstPlayerAttack);
            if(character2.getHP()<1) {
                System.out.println("Первый игрок победил");
                break;
            }
            System.out.println("Здоровье второго игрока: "+ character2.getHP());
            System.out.println("Второй игрок атакует");
            long secondPlayerAttack = character2.getAttack() - character1.getDefend();
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
        Character character1 = CharacterFactory.createCharacter(10L,5L,5L);
        Character character2 = CharacterFactory.createCharacter(20L,2L,2L);
        Character character3 = CharacterFactory.createCharacter(5L,2L,2L);
        fight(character1,character2);
        System.out.println();
        fight(character1,character3);
    }
}

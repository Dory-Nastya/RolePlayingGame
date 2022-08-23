public class Merchant implements Seller{

    // Sell method
    @Override
    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.POTION && Realm.player.getGold() >= 10) {
            Realm.player.setHealthPoints(Realm.player.getHealthPoints() + 10);
            Realm.player.setGold(Realm.player.getGold()-10);
            result = "Вы купили эликсир здоровья!";
            System.out.println(String.format("%s поздравляю, ты купил эликсир! Теперь у вас %d единиц здоровья, а также осталось %d золота.", Realm.player.getName(), Realm.player.getHealthPoints(), Realm.player.getGold()));
        }
        else System.out.println("Извините,у вас недостаточно золота. Заработайте в боях и приходите снова!");
        Realm.printNavigation();
        return result;

    }
    // Enum for goods
    public enum Goods{
        POTION
    }
}

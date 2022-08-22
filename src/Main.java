import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public class Realm {
        //Класс для чтения введенных строк из консоли
        private static BufferedReader br;
        //Игрок должен храниться на протяжении всей игры
        private static FantasyCharacter player = null;
        //Класс для битвы можно не создавать каждый раз, а переиспользовать
        private static BattleScene battleScene = null;
    }

    public static void main(String[] args) {
        //Инициализируем BufferedReader
        br = new BufferedReader(new InputStreamReader(System.in));
        //Инициализируем класс для боя
        battleScene = new BattleScene();
        //Первое, что нужно сделать при запуске игры, это создать персонажа, поэтому мы предлагаем ввести его имя
        System.out.println("Введите имя персонажа:");
        //Далее ждем ввод от пользователя
        try {
            command(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

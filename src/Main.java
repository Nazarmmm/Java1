import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Конструктор класса отсутствует!!!
    // Главный метод главного класса
    public static int Caloriers=0;
    public void calculateCalories(String size) {                                       //new
        if (size.equalsIgnoreCase("Large")) {
            Caloriers+=600;

        } else if (size.equalsIgnoreCase("medium")) {
            Caloriers+=300;

        } else if (size.equalsIgnoreCase("Small")) {
            Caloriers+=150;

        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        for (int i = 0; i < 6; i++) {                                         //new
            System.out.println("Введите размер бургера (small, medium, large)");
            breakfast[i] = new Burger(new Scanner(System.in).nextLine());
        }

        Burger.burgersNumber();                                                //new
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Burger")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Burger(parts[1]);
            }
// ... Продолжается анализ других продуктов для завтрака
            itemsSoFar++;
        }
// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
                break;
        System.out.println("Ккал: " + String.valueOf(Caloriers));
        System.out.println("Всего хорошего!");
    }
}

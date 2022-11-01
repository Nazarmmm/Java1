public class Burger extends Food{
    // Новое внутреннее поле данных РАЗМЕР
    private String size;

    private static int numSmall = 0;                //new
    private static int numMedium = 0;               //new

    private static int numLarge = 0;                //new



    public Burger(String size) {
        super("Бургер");        // Вызвать конструктор предка, передав ему имя класса
        this.size = size;             // Инициализировать размер яблока
        check(size);
    }

    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " съеден");
    }

    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }

    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }

    // Переопределѐнная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Burger)) return false; // Шаг 2
            return size.equals(((Burger) arg0).size); // Шаг 3
        } else
            return false;
    }

    // Переопределѐнная версия метода toString(), возвращающая не только
// название продукта, но и его размер
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

    public void check(String size) {                                       //new
        if (size.equalsIgnoreCase("Large")) {
            numLarge++;
            System.out.println("Большой бургер " + numLarge);
            System.out.println();
        } else if (size.equalsIgnoreCase("medium")) {
            numMedium++;
            System.out.println("Средний бургер " + numMedium);
            System.out.println();
        } else if (size.equalsIgnoreCase("Small")) {
            numSmall++;
            System.out.println("Маленький бургер " + numSmall);
            System.out.println();
        }
    }

    public static int getNumSmall() {
        return numSmall;
    }

    public static int getNumMedium() {
        return numMedium;
    }

    public static int getNumLarge() {
        return numLarge;
    }

    public static void burgersNumber(){               //new
        int s = numSmall;
        int m = numMedium;
        int l = numLarge;
        System.out.println("Маленьких " + s);
        System.out.println("Средних " + m);
        System.out.println("Больших " + l);
    }

    @Override
    public void consum() {

    }

    @Override
    public int calculateCalories() {
        return 0;
    }
}
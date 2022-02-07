public class Main {
    public static void main(String[] args) {
        //Вводные данные
        int payment = 1001;
        int balance = 100;


        //Логика
        int percent = payment > 1000 ? 1 : 0;
        int bonus = payment / 100 * percent;
        int balance2 = payment + balance + bonus;

        System.out.println("Баланс: " + balance2);
        System.out.println("Бонусные рубли: " + bonus);

    }
}

public class Bonus {
    public static void main(String[] args) {
        int currentBalance = 100; // текущий баланс клиента
        int refillAmount = 1654; // сумма пополнения
        int bonusRubles = 0; // количество бонусных рублей

        if (refillAmount > 1000) {
            bonusRubles = (int) (refillAmount / 100) - 10;
        }

        int totalBalance = currentBalance + refillAmount + bonusRubles;
        System.out.println("Итоговый баланс: " + totalBalance + " руб.");
        System.out.println("Количество бонусных рублей: " + bonusRubles + " руб.");
    }
}

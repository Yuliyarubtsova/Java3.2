public class Main {
    public static void main(String[] args) {
        long initial_balance = 10000;
        long refill = 5000;
        long limit = 100000;
        long bonus = refill * 100 / 100 / 100;
        if (refill < limit) {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}

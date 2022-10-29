public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int depositAmount = 1500;
        int bonus = depositAmount / 100;
        if (depositAmount > 1000) {
            System.out.println(bonus = depositAmount / 100);
        } else {
            System.out.println(bonus = 0);
        }
        System.out.println(clientAccount + depositAmount + bonus);
    }
}
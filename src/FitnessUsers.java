public class FitnessUsers {
    public static void main(String[] args) {
        User user1 = new User("Володимир", "Зеленський", 25, 1, 1978,
                "vzel@gmail.com","0123456789", 72, 120, 7000);
        user1.printAccountInfo();
        System.out.println();

        User user2 = new User("Петро", "Порошенко", 26, 9, 1965,
                "ppor@gmail.com","0321654987", 81, 140, 5000);
        user2.printAccountInfo();
        System.out.println();
        System.out.println("Зміна даних:");
        user2.setPressure(125);
        user2.setSteps(6000);
        user2.printAccountInfo();
        System.out.println();

        User user3 = new User("Валерій", "Залужний", 8, 7, 1973,
                "vzal@gmail.com","0214365879", 77, 125, 8000);
        user3.printAccountInfo();
        System.out.println();
        System.out.println("Зміна даних:");
        user3.setWeight(80);
        user3.setSteps(10000);
        user3.printAccountInfo();
        System.out.println();

        User user4 = new User("Денис", "Шмигаль", 15, 10, 1975,
                "odan@gmail.com","0321456789", 75, 130, 8000);
        user4.printAccountInfo();
    }
}

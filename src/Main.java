import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InvalidInputException, IllegalArgumentException {

//        List<Product> products = new ArrayList<>();
//
//        products.add(new Product ("Помидоры", 220.50, 5));
//        products.add(new Product("Бананы", 79.99, 4));
//        products.add(new Product("Арбуз", 45.99, 1));
//        products.add(new Product("Апельсины", 100.89, 1));
//
//        System.out.println(Arrays.toString(products.toArray()));
//
//        Set<String> set = new HashSet<>();
//        set.add("Помидоры");
//        set.add("Бананы");
//        set.add("Бананы");
//        set.add("Арбуз");
//        set.add("Апельсины");
//        set.add("Апельсины");
//
//        System.out.println(Arrays.toString(set.toArray()));

        GroceryList groceryList = new GroceryList();
        Product tomatoes = new Product ("Помидоры", 220.50, 5);
        Product bananas = new Product ("Бананы", 79.99, 4);
        Product watermelon = new Product ("Арбуз", 45.99, 1);
        Product oranges = new Product ("Апельсины", 100.89, 1);


        groceryList.addProduct("Помидоры", 220.50, 5);
        groceryList.addProduct("Бананы", 79.99, 4);
        groceryList.addProduct("Арбуз", 45.99, 1);
        groceryList.addProduct("Апельсины", 100.89, 1);

        System.out.println(groceryList);
        groceryList.removeProduct(bananas);



        Passport passport = new Passport(54549777, "Петров", "Петр", "Иванович", 1900);
        addPassport(passport);

        Passport passport1 = getPassportNumber(54549777);

    }

    public static Set<Integer> task2() {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            double random = Math.random() * 1000;
            integers.add((int) random);
        }
        integers.removeIf(integer -> integer % 2 == 1);
        return integers;
    }
    // Homework 3
    public static Set<String> schoolTask() {
        Set<String> school = new HashSet<>();
        int min = 2;
        int max = 9;
        int size = 15;
        while (school.size() < size) {
            int one = ThreadLocalRandom.current().nextInt(min, max + 1);
            int two = ThreadLocalRandom.current().nextInt(min, max + 1);
            if (!school.contains(one + " * " + two) && (!school.contains(two + " * " + one))) {
                school.add(one + " * " + two);
            }
        }
        return school;
    }
    private static Map<Integer, Passport> map = new HashMap<Integer, Passport>();
    public static void addPassport(Passport passport) {
        map.put(passport.getNumberPassport(), passport);
    }

    public static Passport getPassportNumber(int numberPassport) {
        return map.get(numberPassport);
    }

    private void process(Collection<Integer> firstCollection, List<Integer> list) {
        if (firstCollection.containsAll(list)) {
            System.out.println("Первая коллекция содержит все элементы списка");
        } else {
            System.out.println("Некоторые (или все) элементы из списка отсутствуют в первой коллекции");
        }
    }
    /**
     * Если я правильно понял, задание, то я бы использовал коллекцию ArrayList,
     * т.к. он реализован на основе массива, из-за чего доступ к данным будет производится за постоянное время,
     * чем в коллекциях LinkedList, HashSet. В результате поиска элементов и возврата элементов эта коллекция будет
     * затрачивать меньше времени.
     */




}
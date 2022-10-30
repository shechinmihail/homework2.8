package homeworkMap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Task 1 homeWork1

        HashMap<String, String> contact = new HashMap<>();

        contact.put("Иванов Иван", "+7(912)9077333");
        contact.put("Петров Николай", "+7(922)9377543");
        contact.put("Магомедов Умар", "+7(932)4477567");
        contact.put("Романов Константин", "+7(912)9270914");
        contact.put("Любочкина Юлия", "+7(932)8995621");
        contact.put("Головина Света", "+7(905)6045451");
        contact.put("Сидоров Илья", "+7(909)9090904");
        contact.put("Васильев Доминик", "+7(932)7878788");
        contact.put("Винт Дизель", "+7(922)4095953");
        contact.put("Брежнева Вера", "+7(999)73856");
        contact.put("Жуков Сергей", "+7(800)800801");
        contact.put("Поп Андрей", "+7(909)5032632");
        contact.put("Рыбаков Денис", "+7(922)3388001");
        contact.put("Николаев Александр", "+7(982)3852369");
        contact.put("Иванова Ксения", "+7(900)0077889");
        contact.put("Брейн Брюс", "+7(999)999999");
        contact.put("Вуд Элайджо", "+7(922)7232323");
        contact.put("Маск Илон", "+7(666)7778888");
        contact.put("Рогозин Петр", "+7(799)9090909");
        contact.put("Бакс Банни", "+7(777)3344556");
        contact.put("Патаки Хельга", "+7(980)8963214");
        contact.put("Лысый Плащ Сайтама", "+7(900)9000777");

        System.out.println(contact.toString());

        // Task 3 homeWork1

        Map<String, Integer> map = new HashMap<>();
        map.put("Фильмы", 10);
        map.put("Сериалы", 100);
        map.put("Аниме", 1000);
        map.put("Книги", 10000);
        map.put("Журналы", 2110);
        map.put("Манга", 110);
        map.put("Газеты", 8);

        updateValue(map, "Фильмы", 100000000);
        updateValue(map, "Комиксы", 100);

        System.out.println(map.toString());

        //Task 1 homeWork2

        Random random = new Random();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list1.add(random.nextInt(1000));
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2.add(random.nextInt(1000));
        }
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list3.add(random.nextInt(1000));
        }
        List<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list4.add(random.nextInt(1000));
        }
        List<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list5.add(random.nextInt(1000));
        }

        Map<String, List<Integer>> map1 = new HashMap<>();

        map1.put("Test1", list1);
        map1.put("Test2", list2);
        map1.put("Test3", list3);
        map1.put("Test4", list4);
        map1.put("Test5", list5);

        System.out.println(map1);

        Map<String, Integer> map2 = new HashMap<>();

        for (var keySet : map1.keySet()) {
            Integer sum = 0;
            List<Integer> convertList = map1.get(keySet);
            for (Integer integerSum : convertList) {
                sum += integerSum;
            }
            map2.put(keySet, sum);
        }

        System.out.println(map2);


        //Task 2 homeWork2

        Map<Integer, String> mapik = new LinkedHashMap<>();
        mapik.put(1, "Лада");
        mapik.put(2, "Тойота");
        mapik.put(3, "Хонда");
        mapik.put(4, "Киа");
        mapik.put(5, "Мерседес-Бенс");
        mapik.put(6, "Хавал");
        mapik.put(7, "Мазда");
        mapik.put(8, "Форд");
        mapik.put(9, "Ламборгини");
        mapik.put(10, "Феррари");

        System.out.println(mapik.toString());


    }


    public static void updateValue(Map<String, Integer> map, String key, Integer value) {
        if (map.containsKey(key) && map.get(key).equals(value)) {
            throw new RuntimeException("Такой ключ и значение уже есть!");
        } else if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            map.replace(key, value);
        }
    }

}
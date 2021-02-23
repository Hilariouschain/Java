import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        phone();
        words();
    }


    public static void phone() {
        Book bk = new Book();
        bk.add("Вася", "212312");
        bk.add("Вася", "23312882");
        bk.add("Петя", "2331230012");
        bk.add("Олег", "23312311232");


        System.out.println(Book.get("Вася"));

    }

    public static void words(){
        String[] words = {
                "Кот",
                "Кот",
                "Собака",
                "Сова",
                "Жираф",
                "Бегемот",
                "Дельфин"
        };

        HashMap<String, Integer> hm = new HashMap<>();
        for (String word : words) {
            Integer res = hm.get(word);
            hm.put(word, res == null ? 1 : res + 1);
        }
        System.out.println(hm);
    }
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 class Book {

        public static Map<String, List<String>> directory_hm = new HashMap<>();
        private List<String> phone_number_list;

        public void add(String name, String phone_number) {
            if (directory_hm.containsKey(name)) {
                phone_number_list = directory_hm.get(name);
                phone_number_list.add(phone_number);
                directory_hm.put(name, phone_number_list);
            } else {
                phone_number_list = new ArrayList<>();
                phone_number_list.add(phone_number);
                directory_hm.put(name, phone_number_list);
            }
        }

        public static List<String> get(String name) {
            return directory_hm.get(name);
        }

    }

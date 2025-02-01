public class NonPrimitive{
    public static void main(String[] args){
        // Classes
        class Person{
            String name;
            int age;
        }
        Person p = new Person();

        // Interface
        interface animal{
            void sound();
        }

        // Arrays
        int[] numbers = {1,2,3,4,5,6,7};

        // Strings
        String name = "Narendra Samtani";

        // Collections
        List<Integer> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        // Enums
        enum Days {
            MONDAY, TUESDAY, WEDNESDAY
        }
        Days today = Days.MONDAY;

        // Wrapper Classes
        Integer num = 100;  // Wrapper for int
        Double pi = 3.14;   // Wrapper for double
        
        // User-define Datatypes
        class Book{
            String title;
            String author;
        }

        Book b = new Book();
    }
}

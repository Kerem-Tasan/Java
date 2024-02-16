public class Main {
    public static void main(String[] args) {

        Student<Integer> stu = new Student<>();
        stu.insert(123);
        Student<String> str = new Student<>();
         str.delete("Kerem");
    }
}
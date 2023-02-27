public class AuthorTest {
    public static void main(String[] args) {

        Author a1 = new Author("Иван Иванович", "Мужской");
        Book b1 = new Book("Как приручить дракона", a1, 2010);

        System.out.println(a1);
        System.out.println(b1);

        Author a2 = new Author("Алексей Алексеич", "Мужской", "vova@ua.ru");
        Book b2 = new Book("Как приручить собаку", a2, 2001);
        b2.setYear(2001);

        System.out.println(a2);
        System.out.println(b2);
    }
}
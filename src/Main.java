public class Main {
    public static void main(String[] args) {
        Author author = new Author("Марк", "Твен", 100);
        Book book = new Book("Приключения Тома Сойера", 1876, author,501, "Марк");
        System.out.println(book);
    }
}
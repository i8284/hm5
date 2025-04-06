public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;
    public String word;

    public Book(String title, int releaseYear, Author author, int pages, String word) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
        this.word = word;
    }



    public String toString() {
        return "Название: " + title + "\n" + "Год выпуска: " + releaseYear + "\n"
                + "Автор: " + author.name + " " + author.surname + "\n"
                + "Количество страниц: " + pages + "\n"
                + "Книга большая? " + isBig() + "\n"
                + "Содержится ли в описании книги слово - " + word + "? " + matches(word) + "\n"
                + "Стоимость книги: " + estimatePrice();
    }

    public boolean isBig() {
        if(pages > 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        if(title.contains(word)
                || author.name.contains(word)
                || author.surname.contains(word)){
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        int price = (int)Math.floor(pages * 3 * Math.sqrt(author.rating));
        if(price < 250){
            return 250;
        }
        else {
            return price;
        }

    }
}



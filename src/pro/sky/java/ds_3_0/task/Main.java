package pro.sky.java.ds_3_0.task;

public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Aleksandr", "Pushkin");
        Author nosov = new Author("Evgeniy", "Nosov");

        System.out.println(pushkin.getFirstName() + " " + pushkin.getLastName());
        System.out.println(nosov.getFirstName() + " " + nosov.getLastName());
        System.out.println();

        Book bronzeHorseman = new Book("Медный всадник", pushkin, 1981);
        Book inPole = new Book("В чистом поле", nosov, 2010);

        System.out.println("Название книги: " + bronzeHorseman.getBookName());
        System.out.println("Автор: " + pushkin.getFirstName() + " " + pushkin.getLastName());
        System.out.println("Год публикации: " + bronzeHorseman.getPublishingYear());
        System.out.println("bronzeHorseman.getPublishingYear() = " + bronzeHorseman.getPublishingYear());
        System.out.println();

        System.out.println("Название книги: " + inPole.getBookName());
        System.out.println("Автор: " + nosov.getFirstName() + " " + nosov.getLastName());
        System.out.println("Год публикации: " + inPole.getPublishingYear());
        System.out.println();

        bronzeHorseman.setPublishingYear(2000);
        System.out.println("bronzeHorseman.getPublishingYear() = " + bronzeHorseman.getPublishingYear());
    }
}

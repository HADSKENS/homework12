public class Autorun {
    public static void main(String[] args) {
        Author Anton = new Author("Anton", "Krasnov");
        Book Dragons = new Book("Cars", new Author("Danil", "Krasnov"), 2015);
        System.out.println(Dragons);
        Author Danil = new Author("Anton", "Krasnov");
        Book Cars = new Book("Cars", new Author("Anton", "Krasnov"), 2015);
        System.out.println(Anton);
        System.out.println("Сравнение авторов "+Danil+" "+Anton);
        System.out.println("Hash объектов "+Danil.hashCode()+" "+Anton.hashCode());
        System.out.println("Результат сравнения "+Danil.equals(Anton));
        System.out.println();
        System.out.println("Сравнение книг "+Dragons.getBookname()+" "+Cars.getBookname());
        System.out.println("Hash объектов "+Dragons.hashCode()+" "+Cars.hashCode());
        System.out.println("Результат сравнения "+Dragons.equals(Cars));
    }
}

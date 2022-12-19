public class Autorun {
    public static void main(String[] args) {
        Book Dragons= new Book("Dragons", new Author("Danil","Balakhonov"),1992);
        System.out.println("Книгу с названием " + Dragons.getBookname()+" Написал " +Dragons.getAuthor()+" Она была опубликована в " + Dragons.getAgepublication()+" Году");
        Book Cars = new Book("Cars", new Author("Anton","Krasnov"),2015);
        System.out.println("Книгу с названием " + Cars.getBookname()+" Написал " +Cars.getAuthor()+" Она была опубликована в " + Cars.getAgepublication()+" Году");
        Dragons.setAgepublication(2015);
        System.out.println("Книгу с названием " + Dragons.getBookname()+" Написал " + Cars.getAuthor()+" Она была опубликована в " + Dragons.getAgepublication()+" Году");
    }
}

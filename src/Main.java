public class Main {
    public static void main(String[] args) {

        Printable[] printables = new Printable[]{
                new Book("kitep", 45),
                new Magazine("jurnal", 75)
        };
        for (Printable printable: printables) {
            printable.print();
        }
        Magazine.printMagazine(printables);
        Book.printBook(printables);
    }
}
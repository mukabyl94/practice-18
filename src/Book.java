public class Book implements Printable{
    private String name;
    private int page;

    public Book(String name, int page) {
        this.name = name;
        this.page = page;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public void print() {
        System.out.println("Book is printing");
    }
    public static void printBook(Printable[] printables){
        for (Printable printable: printables){
            if(printable instanceof Book){
                System.out.println(printable);
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", page=" + page +
                '}';
    }
}

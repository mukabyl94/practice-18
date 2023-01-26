public class Magazine implements Printable{
    private String name;
    private int page;

    public Magazine() {
    }

    public Magazine(String name, int page) {
        this.name = name;
        this.page = page;
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

    public static void printMagazine(Printable[] printables){
        for (Printable printable: printables) {
            if(printable instanceof Magazine){
                System.out.println(printable);
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Magazine is printing");
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", page=" + page +
                '}';
    }
}

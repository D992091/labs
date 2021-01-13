public class PostageVisitor implements Visitor {
    private double totalPostageForCart;
    public void visit(Book book) {
        if(book.getPrice() < 10.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    public void visit(CD cd) {
        if(cd.getPrice() < 2.0) {
        totalPostageForCart += cd.getWeight() * 1.5;
        }
    }
    public void visit(DVD dvd) {
        if(dvd.getPrice() < 4.0) {
            totalPostageForCart += dvd.getWeight() * 1.25;
        }
    }

    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
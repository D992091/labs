public class Book implements Visitable{

    private double price;

    private double weight;

    Book(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
}

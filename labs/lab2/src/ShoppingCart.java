import java.util.ArrayList;

public class ShoppingCart {
    public static ArrayList<Visitable> items = new ArrayList<>();
    public double calculatePostage() {
        PostageVisitor visitor = new PostageVisitor();
        MyList<Visitable> visitable = new MyList<>(items);
        for(Visitable item: visitable) {
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }
    public static void main(String... args){
        Book b1 = new Book(10,2);
        Book b2 = new Book(5,0.5);
        CD cd1= new CD(2,0.5);
        CD cd2 = new CD(1,0.25);
        DVD dvd1 = new DVD(4,0.6);
        DVD dvd2 = new DVD(2, 0.4);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.items.add(b1);
        shoppingCart.items.add(b2);
        shoppingCart.items.add(cd1);
        shoppingCart.items.add(cd2);
        shoppingCart.items.add(dvd1);
        shoppingCart.items.add(dvd2);
        System.out.println("Posting price = "+ shoppingCart.calculatePostage());
    }
}
package projects.oopsconcept.classesAndObjects;

class Products {
    String name;
    double price;
    int quantity;

    Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: ₹" + price);
        System.out.println("Product quantity: " + quantity);
    }
}

public class Product {
    public static void main(String[] args) {
        Products myProduct = new Products("laptop", 50_000, 100);
        myProduct.displayProduct();
    }
}

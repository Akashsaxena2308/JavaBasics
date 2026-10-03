package Demo;

//import Workspace.Product.Product;
import Product.Product;

public class Demo {
    public static void main(String[] args){
        System.out.println("Run program");

        int a = 5;


        Product headphone = new Product("Boat", 1000);
        System.out.println(Product.count);

        Product headphone2 = new Product("Sony", 2000);
        System.out.println(headphone2.count);
        headphone.displayProduct();
        headphone2.displayProduct();

        headphone2.changePrice(2500);
        headphone2.displayProduct();

        Product headphone3 = headphone2; // Sony 2500
        System.out.println(headphone3);
        headphone3.displayProduct();

        headphone2.changePrice(4000);
        headphone3.displayProduct();
    }
}
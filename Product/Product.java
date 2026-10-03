package Product;

public class Product{
    String name; //Instance variable
    int price;
    public static int count;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
        this.count++;
    }

    public void displayProduct(){
        System.out.println(this.name + " " + this.price);
    }

    public void changePrice(int newPrice){
        this.price = newPrice;
    }
//
//    public void getCount(){
//        System.out.println(this.count);
//    }
}
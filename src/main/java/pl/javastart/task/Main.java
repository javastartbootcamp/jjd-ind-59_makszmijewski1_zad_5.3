package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("roll", "wheat roll", 0.8, "bread");
        Product product2 = new Product("dijon Mustard", "spicy mustard from France", 3.8, "mustards");
        Product product3 = new Product("cup", "big cup", 17.0, null);

        BruttoCalculator bruttoCalculator = new BruttoCalculator();

        System.out.println(bruttoCalculator.bruttoCalculator(product1));
        System.out.println(bruttoCalculator.bruttoCalculator(product2));
        System.out.println(bruttoCalculator.bruttoCalculator(product3));
    }
}

package pl.javastart.task;

public class BruttoCalculator {
    public double bruttoCalculator(Product product) {
        if (product.getCategory() == null) {
            return product.getNettoPrice() * 1.23;
        } else {
            switch (product.getCategory()) {
                case "bread":
                    return product.getNettoPrice() * 1.05;
                case "seafood":
                    return product.getNettoPrice() * 1.23;
                case "mustards":
                    return product.getNettoPrice() * 1.08;
                default:
                    return product.getNettoPrice() * 1.23;
            }
        }
    }
}

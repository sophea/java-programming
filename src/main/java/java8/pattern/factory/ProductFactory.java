package java8.pattern.factory;

public abstract class ProductFactory {
    public static Product createProduct(String id) {
        if ("1".equals(id)) {
            return new ProductOne();
        } else {
            return new ProductTwo();
        }
    }
}

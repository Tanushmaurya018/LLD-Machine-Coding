package Product;

public class ProductFactory {
    public ProductI createProduct(String category){
        switch (category.toLowerCase()){
            case "clothing":
                return  new Clothing();
            case "shoes":
                return new Shoes();
            default:
                 throw new IllegalArgumentException("Invalid Category: " + category);
        }
    }
}

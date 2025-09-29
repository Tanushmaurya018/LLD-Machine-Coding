import Product.ProductI;

import java.util.List;

public class Order {
     String orderId;
     List<ProductI> products;

    public Order(OrderBuilder order) {
        this.products = order.products;
        this.orderId = order.orderId;
    }

    public static class OrderBuilder{
        private String orderId;
        private List<ProductI> products;

        public OrderBuilder orderId(String orderId){
            this.orderId = orderId;
            return this;
        }
        public OrderBuilder products(List<ProductI> products){
            this.products = products;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }
}

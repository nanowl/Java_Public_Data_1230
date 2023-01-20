package 인터페이스활용;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buy = customer;
        buy.buy();

        Sell sell = customer;
        sell.sell();

        Customer customer1 = (Customer) sell;
        customer1.buy();
        customer1.sell();
    }
}

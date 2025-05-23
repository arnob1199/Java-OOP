class Restaurant {
    double foodPrice;

    Restaurant(double foodPrice) {
        
        this.foodPrice = foodPrice;
    }

    int estimateDeliveryTime() {

        return 40;
    }

    double calculateTotalBill() {

        return foodPrice + (0.10 * foodPrice);
    }
}

class FastFoodRestaurant extends Restaurant {

    FastFoodRestaurant(double foodPrice) {
        
        super(foodPrice);
    }

    @Override
    int estimateDeliveryTime() {

        return 20;
    }

    @Override
    double calculateTotalBill() {

        return foodPrice + (0.15 * foodPrice);
    }
}

class FineDiningRestaurant extends Restaurant {

    FineDiningRestaurant(double foodPrice) {

        super(foodPrice);
    }

    @Override
    int estimateDeliveryTime() {

        return 60;
    }
}

public class RestaurantTest {
    public static void main(String[] args) {

        Restaurant general = new Restaurant(100);
        FastFoodRestaurant fast = new FastFoodRestaurant(100);
        FineDiningRestaurant fine = new FineDiningRestaurant(100);

        System.out.println("General Restaurant: Bill = " + general.calculateTotalBill() +
                           ", Delivery = " + general.estimateDeliveryTime() + " mins");

        System.out.println("Fast Food Restaurant: Bill = " + fast.calculateTotalBill() +
                           ", Delivery = " + fast.estimateDeliveryTime() + " mins");

        System.out.println("Fine Dining Restaurant: Bill = " + fine.calculateTotalBill() +
                           ", Delivery = " + fine.estimateDeliveryTime() + " mins");
    }
}
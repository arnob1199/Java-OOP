public class ProductFilter {

    public void filterProducts(String category) {

        System.out.println("Filtering products in category: " + category);
    }

    public void filterProducts(int minPrice, int maxPrice) {

        System.out.println("Filtering products with price between $" + minPrice + " and $" + maxPrice);
    }

    public void filterProductsByBrand(String brand) {

        System.out.println("Filtering products of brand: " + brand);
    }

    public void filterProducts(String category, int minPrice, int maxPrice) {

        System.out.println("Filtering products in category '" + category + "' with price between $" + minPrice + " and $" + maxPrice);
    }

    public void filterProducts(String category, int minPrice, int maxPrice, String brand) {
        
        System.out.println("Filtering '" + brand + "' products in category '" + category + "' with price between $" + minPrice + " and $" + maxPrice);
    }

    public static void main(String[] args) {

        ProductFilter filter = new ProductFilter();

        filter.filterProducts("electronics");                         
        filter.filterProducts(100, 500);
        filter.filterProductsByBrand("Apple");                        
        filter.filterProducts("fashion", 50, 200);                    
        filter.filterProducts("electronics", 300, 1000, "Samsung");
    }
}

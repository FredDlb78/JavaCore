package javacore.chapter05.object.exercise;


public class ProductSorting {

    static final double ONE_DOLLAR = 1;
    static final double ONE_DOLLAR_IN_EURO = ONE_DOLLAR * 0.95;
    static final double ONE_DOLLAR_IN_YUAN = ONE_DOLLAR * 7.27;
    static final double ONE_DOLLAR_IN_LIVRE = ONE_DOLLAR * 0.79;

    public String name;
    public String category;

    public double price;
    public char currency;

    public ProductSorting(String name, String category, double price, char currency) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    public void displayProduct() {
        System.out.println("Product Name : " + this.name + " | Category : " + this.category + " | Price : " + this.price + this.currency);
    }

    public static void main(String[] args) {

        ProductSorting[] productArray = generateFakeProductList();

        // Écrivez votre code ci-dessous

        // 1 - Tout convertir en Dollar
        System.out.println("----Conversion----");
        for (int productIndex = 0; productIndex < productArray.length; productIndex++) {
            if (productArray[productIndex].currency == '€') {
                productArray[productIndex].price /= ONE_DOLLAR_IN_EURO;
            } else if (productArray[productIndex].currency == '£') {
                productArray[productIndex].price /= ONE_DOLLAR_IN_LIVRE;
            } else if (productArray[productIndex].currency == '¥'){
                productArray[productIndex].price /= ONE_DOLLAR_IN_YUAN;
            }
            productArray[productIndex].currency = '$';

            productArray[productIndex].displayProduct();
        }

        // 2 - Trier
        double previousPrice;
        double currentPrice;
        int priceIndex;

        System.out.println("----Tri----");

        for (int boardLoopIndex = 0; boardLoopIndex < productArray.length; boardLoopIndex++) {

            for (priceIndex = 1; priceIndex < productArray.length; priceIndex++) {
                previousPrice = productArray[priceIndex - 1].price;
                currentPrice = productArray[priceIndex].price;
                if (previousPrice < currentPrice) {
                    ProductSorting temp = productArray[priceIndex - 1];
                    productArray[priceIndex - 1] = productArray[priceIndex];
                    productArray[priceIndex] = temp;

                }
            }
        }

        System.out.println("----Tri----");
        for (int i = 0; i < productArray.length; i++) {
            productArray[i].displayProduct();
        }

    }

    public static ProductSorting[] generateFakeProductList() {

        ProductSorting[] productArray = new ProductSorting[10];

        productArray[0] = new ProductSorting("Samsung G9", "Gaming Screen", 1499.99, '$');
        productArray[1] = new ProductSorting("Porsche 911", "Car", 120000, '€');
        productArray[2] = new ProductSorting("IKEA Sofa", "Seating", 599.99, '£');
        productArray[3] = new ProductSorting("MacBook Pro M3", "Laptop", 2499.99, '$');
        productArray[4] = new ProductSorting("Rolex Submariner", "Watch", 9500, '€');
        productArray[5] = new ProductSorting("Bose QuietComfort 45", "Headphones", 329.99, '$');
        productArray[6] = new ProductSorting("Dyson V15 Detect", "Vacuum Cleaner", 7390.10, '¥');
        productArray[7] = new ProductSorting("Harley-Davidson Fat Boy", "Motorcycle", 20300, '€');
        productArray[8] = new ProductSorting("Canon EOS R5", "Camera", 3899, '$');
        productArray[9] = new ProductSorting("Lego Millennium Falcon", "Toy", 849.99, '$');

        return productArray;

    }
}
package org.example;

public class VendingMachineDemo {
    public static void main(String agrs[]) {
        VendingMachine vendingMachine = VendingMachine.getInstance();
        NotePayment notePayment = new NotePayment();
        CoinPayment coinPayment = new CoinPayment();
        CardPayment card = new CardPayment();

        // Add products to the inventory
        Product coke = vendingMachine.addProduct("Coke", 1.5, 3);
        Product pepsi = vendingMachine.addProduct("Pepsi", 1.5, 1);
        Product water = vendingMachine.addProduct("Water", 1.0, 5);

      //  orderCoke(vendingMachine, notePayment, coinPayment, coke);
      //  orderPepsi(vendingMachine,pepsi,coinPayment,notePayment);
        orderWater(vendingMachine,water,card);
    }

    private static void orderWater(VendingMachine vendingMachine, Product water, CardPayment cardPayment) {
        vendingMachine.selectProduct(water);
        vendingMachine.setPaymentStrategy(cardPayment);
        vendingMachine.dispenseProduct(); //without payment
        Card card = new Card();
        card.setCard_holder_name("JK ROWLING");
        card.setAmount(10000.0);
        vendingMachine.insertCard(card);
        vendingMachine.dispenseProduct();

    }

    private static void orderCoke(VendingMachine vendingMachine, NotePayment notePayment, CoinPayment coinPayment, Product coke) {
        // Select a product
        vendingMachine.selectProduct(coke);
        vendingMachine.setPaymentStrategy(coinPayment);

        // Insert coins
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);

        vendingMachine.setPaymentStrategy(notePayment);

        // Insert a note
        vendingMachine.insertNote(Note.FIVE);

        // Dispense the product
        vendingMachine.dispenseProduct();

        // Return change
        vendingMachine.returnChange();
    }

    static void  orderPepsi(VendingMachine vendingMachine,Product pepsi,CoinPayment coinPayment,NotePayment notePayment){
        vendingMachine.selectProduct(pepsi);

        vendingMachine.setPaymentStrategy(coinPayment);
        // Insert insufficient payment
        vendingMachine.insertCoin(Coin.QUARTER);

        // Try to dispense the product
        vendingMachine.dispenseProduct();

        vendingMachine.setPaymentStrategy(coinPayment);
        // Insert more coins
        vendingMachine.insertCoin(Coin.QUARTER);

        vendingMachine.setPaymentStrategy(notePayment);
        vendingMachine.insertNote(Note.FIVE);
        vendingMachine.insertNote(Note.ONE); //extra note is not accepted.

        // Dispense the product
        vendingMachine.dispenseProduct();

        // Return change
        vendingMachine.returnChange();
    }
}

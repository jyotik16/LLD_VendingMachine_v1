package org.example;

public interface VendingMachineState {
    void selectProduct(Product product);

    void insertCoin(Coin coin);

    void insertNote(Note note);

    void insertCard(Card card);

    void dispenseProduct();

    void returnChange();
}
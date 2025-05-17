# LLD_VendingMachine_v1


#### Problem Statement
>Design and implement a Vending Machine system that allows users to select products, insert coins/notes, dispense products, and return change. The system should manage inventory, handle payments, and use the State design pattern for its operations.
*** 
#### Requirements
- Product Management: The system manages a catalog of products, each with a price and available quantity.
- Inventory Management: The system tracks the quantity of each product and prevents dispensing if out of stock.
- Payment Handling: The system accepts coins and notes, tracks total payment, and returns change if necessary.
- State Management: The system uses the State design pattern to manage its operational states (Idle, Ready, Dispense, ReturnChange).
- User Interaction: Users can select products, insert coins/notes, and receive products and change.
- Extensibility: Easy to add new product types, payment methods, or states.

#### Core Entities
- VendingMachine: Main class that manages inventory, state transitions, product selection, and payment.
- Product: Represents a product with a name and price.
- Inventory: Manages the stock of products.
- Coin / Note: Represents accepted denominations for payment.
- VendingMachineState (interface): Interface for different machine states.
- IdleState, ReadyState, DispenseState, ReturnChangeState: Concrete states implementing VendingMachineState.
- Singleton Pattern: VendingMachine is implemented as a singleton.

#### Design Patterns Used
- **State Pattern:** For managing machine states and transitions.
- **Singleton Pattern:** For ensuring a single instance of the VendingMachine.
- **Strategy Pattern:** To encapsulate algorithms or processes that can vary independently, like different payment processing methods or product selection strategies.

#### Limitations
- Poor Change Handling in Inventory Management: There's no mention of out-of-stock handling, product reloading, or expiry tracking.
- Incomplete Payment Handling: The CardPayment and CoinPayment classes should be extended to support the discounts, and transaction logs.
- No Machine Maintenance Mode: Need to reset the system.


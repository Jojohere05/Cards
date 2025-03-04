#  Card Deck - Java Program

**Author:** *Your Name*  
**PRN:** *Your PRN*  
**Batch:** *Your Batch*  

## Description
This Java program simulates a **standard deck of 52 playing cards** with various operations like printing, shuffling, finding, comparing, and dealing cards. The program is **menu-driven**, allowing users to interact with the deck.

## Features & Methods
| **Method Name**       | **Description** |
|-----------------------|----------------|
| `createDeck()`        | Initializes a **new deck of 52 cards** (sorted by default). |
| `printDeck()`         | Prints **all 52 cards** from the deck. |
| `printCard()`         | Prints a **single card** (rank & suit). |
| `sameCard(Card c)`    | Checks if **two cards** belong to the same suit. |
| `compareCard(Card c)` | Checks if **two cards** have the same rank. |
| `findCard(String rank, String suit)` | Searches for a specific **card in the deck**. |
| `dealCard()`          | Prints **5 random cards** from the deck. |
| `shuffleDeck()`       | Randomizes the deck order using `Collections.shuffle()`. |

##  Menu Options
When the program runs, it displays a menu:
- **1 → Print Deck:** Displays all 52 cards.  
- **2 → Shuffle Deck:** Randomizes card order.  
- **3 → Find a Card:** User enters rank & suit to search for a specific card.  
- **4 → Deal 5 Random Cards:** Prints 5 randomly chosen cards.  
- **5 → Exit:** Closes the program.  
 
##  Compile
javac Main.java
## Run the Program:
java Main

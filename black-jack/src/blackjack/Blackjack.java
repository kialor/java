package blackjack;

import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {

        System.out.println("Welcome to Blackjack!");

        // Create the playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();


        // Create hands for the player and the dealer - hands are created from methods that are made in the deck class
        Deck playerHand = new Deck();
        Deck dealerHand = new Deck();

        double playerMoney = 500.00;

        Scanner scanner = new Scanner(System.in);


        // Game loops

        while(playerMoney > 0){
            System.out.println("You currently have $ " +playerMoney);
            System.out.println("What would you like to bet?");
            double playerBet = scanner.nextDouble();
            scanner.nextLine();
            if (playerBet > playerMoney) {
                System.out.println("Insufficient funds.");
                break;
            }
            boolean endRound = false;

            playerHand.draw(playingDeck);
            playerHand.draw(playingDeck);

            dealerHand.draw(playingDeck);
            dealerHand.draw(playingDeck);

            while(true){
                System.out.println("Your hand: ");
                System.out.println(playerHand);
                System.out.println("Value of hand: " +playerHand.cardValue());
                System.out.println();

                if(playerHand.cardValue() == 21) {
                    System.out.println("Blackjack!");
                }

                System.out.println("Dealer hand: " +dealerHand.getCard(0).toString() +" + hole card");

                System.out.println("Hit (select 1) or Stand (select 2) ?");
                int response = scanner.nextInt();
                scanner.nextLine();

                if(response ==1){
                  playerHand.draw(playingDeck);
                    System.out.println("Card added: " +playerHand.getCard(playerHand.deckSize()-1).toString());
                    if(playerHand.cardValue() > 21) {
                        System.out.println("Bust, over 21. You are at: " +playerHand.cardValue());
                        playerMoney -= playerBet;
                        endRound = true;
                        break;
                    }
                }
                if(response ==2){
                    break;
                }
            }
            System.out.println("Dealer hand: " + dealerHand);
            if((dealerHand.cardValue() > playerHand.cardValue()) && !endRound){
                System.out.println("Dealer wins.");
                playerMoney -= playerBet;
                endRound = true;
            }
            while((dealerHand.cardValue() < 17) && !endRound ){
                dealerHand.draw(playingDeck);
                System.out.println("Card added to dealer: " +dealerHand.getCard(dealerHand.deckSize()-1).toString());
            }
            System.out.println("Dealer hand: " +dealerHand.cardValue());
            if((dealerHand.cardValue() > 21) && !endRound){
                System.out.println("You win, dealer busts.");
                playerMoney += playerBet;
                endRound = true;
            }
            if((playerHand.cardValue() == dealerHand.cardValue()) && !endRound){
                System.out.println("Push");
                endRound = true;
            }

            if((playerHand.cardValue() > dealerHand.cardValue()) && !endRound){
                System.out.println("You win!");
                playerMoney += playerBet;
                endRound = true;
            }else if(!endRound){
                System.out.println("You lose.");
                playerMoney -= playerBet;
                endRound = true;
            }

            playerHand.moveAllToDeck(playingDeck);
            dealerHand.moveAllToDeck(playingDeck);
            System.out.println("End of round.");

        }
        System.out.println("Sorry, not enough money to continue. Game over.");


    }
}
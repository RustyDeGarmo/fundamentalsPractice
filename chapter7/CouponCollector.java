package chapter7;

/*
 * This program aims to solve the coupon collector problem using a deck of 
 * cards. 
 * 
 * We want to see how many draws it will take to get one card from each suit 
 * from a shuffled deck. So we want one heart, diamond, spade, and club.
 * After a card is drawn it is placed back in the deck.
 * 
 * 0-12 are hearts, 13-25 are diamonds, 26-38 are spades, 39-51 are clubs
 */

 class CouponCollector{
    public static void main(String[] args){
        int[] picks = new int[4];
        String[] suits = new String[4];
        int totalDraws = getFour(picks, suits);
        printPicks(picks, suits, totalDraws);
    }

    //print our cards
    public static void printPicks(int[] picks, String[] suits, int totalDraws){
        int card;
        String sCard;

        for(int i = 0; i < picks.length; i++){
            card = (picks[i] + 1) % 13;
            switch(card){
                case(1): sCard = "Ace";
                break;
                case(11): sCard = "Jack";
                break;
                case(12): sCard = "Queen";
                break;
                case(0): sCard = "King";
                break;
                default: sCard = Integer.toString(card);
            }
            System.out.println(sCard + " of " + suits[i]);
        }

        System.out.println("Number of picks: " + totalDraws);
    }

    //get four unique cards, return the number of draws
    public static int getFour(int[] picks, String[] suits){
        int counter = 0;
        int pick;
        int totalDraws = 0;

        while(counter < picks.length){
            pick = pickCard();
            String suit = getSuit(pick);
            totalDraws++;
            
            for(int i = 0; i < suits.length; i++){
                if(pick == picks[i] || suit == suits[i]){
                    break;
                }
                if(i == picks.length - 1){
                    suits[counter] = suit;
                    picks[counter] = pick;
                    counter++;
                }
            }
        }
        return totalDraws;
    }

    //pick a card from the deck
    public static int pickCard(){
        int card = ((int)(Math.random() * 52));
        return card;
    }

    //get the suit of the card
    public static String getSuit(int card){
        if(card < 13){
            return "Hearts";
        }else if(card < 26){
            return "Diamonds";
        }else if(card < 39){
            return "Spades";
        }else{
            return "Clubs";
        }
    }
 }

  

import java.util.List;

public class mosmani_UnoPlayer implements UnoPlayer {

    /**
     * play - This method is called when it's your turn and you need to
     * choose what card to play.
     *
     * The hand parameter tells you what's in your hand. You can call
     * getColor(), getRank(), and getNumber() on each of the cards it
     * contains to see what it is. The color will be the color of the card,
     * or "Color.NONE" if the card is a wild card. The rank will be
     * "Rank.NUMBER" for all numbered cards, and another value (e.g.,
     * "Rank.SKIP," "Rank.REVERSE," etc.) for special cards. The value of
     * a card's "number" only has meaning if it is a number card. 
     * (Otherwise, it will be -1.)
     *
     * The upCard parameter works the same way, and tells you what the 
     * up card (in the middle of the table) is.
     *
     * The calledColor parameter only has meaning if the up card is a wild,
     * and tells you what color the player who played that wild card called.
     *
     * Finally, the state parameter is a GameState object on which you can 
     * invoke methods if you choose to access certain detailed information
     * about the game (like who is currently ahead, what colors each player
     * has recently called, etc.)
     *
     * You must return a value from this method indicating which card you
     * wish to play. If you return a number 0 or greater, that means you
     * want to play the card at that index. If you return -1, that means
     * that you cannot play any of your cards (none of them are legal plays)
     * in which case you will be forced to draw a card (this will happen
     * automatically for you.)
     */
    public int play(List<Card> hand, Card upCard, Color calledColor,
        GameState state) {
        //red
    if (upCard.getColor().equals(Color.RED) || calledColor.equals(Color.RED)) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getColor().equals(Color.RED)) {
                    if (hand.get(i).getRank().equals(Rank.DRAW_TWO)) {
                        return i;
                    } else if (hand.get(i).getRank().equals(Rank.REVERSE)) {
                        return i;
                    } else if (hand.get(i).getRank().equals(Rank.WILD) || hand.get(i).getRank().equals(Rank.WILD_D4)) {
                        return i;
                    }
                    return i;
                } else if (upCard.getRank().equals(Rank.REVERSE) && upCard.getColor().equals(Color.RED)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.REVERSE)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getRank().equals(Rank.DRAW_TWO) && upCard.getColor().equals(Color.RED)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.DRAW_TWO)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                
                } else if (upCard.getRank().equals(Rank.SKIP) && upCard.getColor().equals(Color.RED)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.SKIP)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getNumber() == (0) || upCard.getNumber() == (1) ||
                upCard.getNumber() == (2) || upCard.getNumber() == (3) || upCard.getNumber() == (4)
                || upCard.getNumber() == (5) || upCard.getNumber() == (6) ||
                upCard.getNumber() == (7) || upCard.getNumber() == (8) || upCard.getNumber() == (9)) {
                    for (int in = 0; in < hand.size(); in++) {
                        if (hand.get(in).getNumber()==(upCard.getNumber())) {
                            return in;
                        } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                            return in;
                        }
                    }
                } else if (hand.get(i).getRank().equals(Rank.WILD) || hand.get(i).getRank().equals(Rank.WILD_D4)) {
                    return i;
                
                }
            }
        } else if (upCard.getColor().equals(Color.YELLOW) || calledColor.equals(Color.YELLOW)) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getColor().equals(Color.YELLOW)) {
                    if (hand.get(i).getRank().equals(Rank.DRAW_TWO)) {
                        return i;
                    } else if (hand.get(i).getRank().equals(Rank.REVERSE)) {
                        return i;
                    } else if (hand.get(i).getRank().equals(Rank.WILD) || hand.get(i).getRank().equals(Rank.WILD_D4)) {
                        return i;
                    }
                    return i;
                } else if (upCard.getRank().equals(Rank.REVERSE) && upCard.getColor().equals(Color.YELLOW)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.REVERSE)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getRank().equals(Rank.SKIP) && upCard.getColor().equals(Color.YELLOW)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.SKIP)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getRank().equals(Rank.DRAW_TWO) && upCard.getColor().equals(Color.YELLOW)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.DRAW_TWO)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getNumber() == (0) || upCard.getNumber() == (1) ||
                upCard.getNumber() == (2) || upCard.getNumber() == (3) || upCard.getNumber() == (4)
                || upCard.getNumber() == (5) || upCard.getNumber() == (6) ||
                upCard.getNumber() == (7) || upCard.getNumber() == (8) || upCard.getNumber() == (9)) {
                    for (int in = 0; in < hand.size(); in++) {
                        if (hand.get(in).getNumber()==(upCard.getNumber())) {
                            return in;
                        } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                            return in;
                        }
                    }
                } else if (hand.get(i).getRank().equals(Rank.WILD) || hand.get(i).getRank().equals(Rank.WILD_D4)) {
                    return i;
    
                }
            }
        } else if (upCard.getColor().equals(Color.GREEN) || calledColor.equals(Color.GREEN)) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getColor().equals(Color.GREEN)) {
                    if (hand.get(i).getRank().equals(Rank.DRAW_TWO)) {
                        return i;
                    } else if (hand.get(i).getRank().equals(Rank.REVERSE)) {
                        return i;
                    } else if (hand.get(i).getRank().equals(Rank.WILD) || hand.get(i).getRank().equals(Rank.WILD_D4)) {
                        return i;
                    } 
                    return i;
                } else if (upCard.getRank().equals(Rank.REVERSE) && upCard.getColor().equals(Color.GREEN)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.REVERSE)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getRank().equals(Rank.SKIP) && upCard.getColor().equals(Color.GREEN)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.SKIP)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getRank().equals(Rank.DRAW_TWO) && upCard.getColor().equals(Color.GREEN)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.DRAW_TWO)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getNumber() == (0) || upCard.getNumber() == (1) ||
                upCard.getNumber() == (2) || upCard.getNumber() == (3) || upCard.getNumber() == (4)
                || upCard.getNumber() == (5) || upCard.getNumber() == (6) ||
                upCard.getNumber() == (7) || upCard.getNumber() == (8) || upCard.getNumber() == (9)) {
                    for (int in = 0; in < hand.size(); in++) {
                        if (hand.get(in).getNumber()==(upCard.getNumber())) {
                            return in;
                        } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                            return in;
                        }
                    }
                } else if (hand.get(i).getRank().equals(Rank.WILD) || hand.get(i).getRank().equals(Rank.WILD_D4)) {
                    return i;
                
                }
            }
        } else if (upCard.getColor().equals(Color.BLUE) || calledColor.equals(Color.BLUE)) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getColor().equals(Color.BLUE)) {
                    if (hand.get(i).getRank().equals(Rank.DRAW_TWO)) {
                        return i;
                    } else if (hand.get(i).getRank().equals(Rank.REVERSE)) {
                        return i;
                    } else if (hand.get(i).getRank().equals(Rank.WILD) || hand.get(i).getRank().equals(Rank.WILD_D4)) {
                        return i;
                    }
                    return i;
                } else if (upCard.getRank().equals(Rank.REVERSE) && upCard.getColor().equals(Color.BLUE)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.REVERSE)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getRank().equals(Rank.SKIP) && upCard.getColor().equals(Color.BLUE)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.SKIP)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getRank().equals(Rank.DRAW_TWO) && upCard.getColor().equals(Color.BLUE)) {
                for (int in = 0; in < hand.size(); in++) {
                if (hand.get(in).getRank().equals(Rank.DRAW_TWO)) {
                    return in;
                } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                        return in;
                    }
                }
                } else if (upCard.getNumber() == (0) || upCard.getNumber() == (1) ||
                upCard.getNumber() == (2) || upCard.getNumber() == (3) || upCard.getNumber() == (4)
                || upCard.getNumber() == (5) || upCard.getNumber() == (6) ||
                upCard.getNumber() == (7) || upCard.getNumber() == (8) || upCard.getNumber() == (9)) {
                    for (int in = 0; in < hand.size(); in++) {
                        if (hand.get(in).getNumber()==(upCard.getNumber())) {
                            return in;
                        } else if (hand.get(in).getRank().equals(Rank.WILD) || hand.get(in).getRank().equals(Rank.WILD_D4)) {
                            return in;
                        }
                    }
                } else if (hand.get(i).getRank().equals(Rank.WILD) || hand.get(i).getRank().equals(Rank.WILD_D4)) {
                    return i;
                
                }
            }
        } 
        return -1;
    }
    {
    }

    /**
     * callColor - This method will be called when you have just played a
     * wild card, and is your way of specifying which color you want to 
     * change it to.
     *
     * You must return a valid Color value from this method. You must not
     * return the value Color.NONE under any circumstances.
     */
    public Color callColor(List<Card> hand, GameState state) {
        for (int i = 0; i < hand.size(); i++) {
            if (hand.get(i).getColor().equals(Color.NONE)) {
                for (i = 0; i < hand.size(); i++) {
                    if (hand.get(i).getRank().equals(Rank.SKIP)) {
                        Color callcol = (hand.get(i).getColor());
                        return callcol;
                    }
                }
            } else if (hand.get(i).getColor().equals(Color.YELLOW)) {
                return Color.YELLOW;
            } else if (hand.get(i).getColor().equals(Color.BLUE)) {
                return Color.BLUE;
            } else if (hand.get(i).getColor().equals(Color.GREEN)) {
                return Color.GREEN;
            } else if (hand.get(i).getColor().equals(Color.RED)) {
                return Color.RED;
            }
        }
        return Color.RED;
    }
 
}
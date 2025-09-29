package Classes
import scala.collection.mutable._
import Traits._
/**
 * Represents a player in the game.
 * Manages the player's name, board position, life points, hand, and deck.
 * @param Name The player's name (immutable, private).
 * @param Position The player's current position on the board (immutable).
 * @param Life The player's life points (mutable).
 */
class Player(private val Name: String,val Position: String, var Life: Int) {

  /** The player's Hand, initialized as a new Hand object. */
  private val hand: GroupOfCards = Hand()

  /** The player's Deck, initialized as a new Deck object. */
  private val deck: GroupOfCards = Deck()

  /** Retrieves the player's name. */
  def getName: String = Name

  /** Retrieves the player's board position. */
  def getPosition: String = Position

  /** Retrieves the player's current life points. */
  def getLife: Int = Life

  /**
   * Sets the player's life points to a new value.
   * @param l The new life point value.
   */
  def setLife(l: Int): Unit = {
    Life = l
  }

  /** Retrieves the player's Hand. */
  def getHand: GroupOfCards = hand

  /** Retrieves the player's Deck. */
  def getDeck: GroupOfCards = deck

}

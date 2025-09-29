package Classes
import scala.collection.mutable._
import Traits._


/**
 * Abstract base class providing common card collection functionality for Deck and Hand.
 * It implements the GroupOfCards trait.
 */
abstract class AbstractDeck extends GroupOfCards {

  /** Overrides and initializes the internal mutable card collection as empty. */
  override val bag: ArrayBuffer[Card] = ArrayBuffer.empty[Card]

  /** Retrieves the internal card collection. */
  def getBag: ArrayBuffer[Card] = bag

  /**
   * Retrieves a specific card by index (1-based indexing).
   * @param I The 1-based index of the card to retrieve.
   * @return The Card at the specified position.
   */
  def getCard(I: Int): Card = bag.apply(I-1)

  /**
   * Adds a card to the collection.
   * @param C The Card to add.
   */
  def addCard(C: Card): Unit = {
    bag += C
  }

  /** Removes the first card (at index 0) from the collection. */
  def eraseCard(): Unit = {
    bag.remove(0,1)
  }

  /**
   * Checks if the card collection is empty.
   * @return True if the bag contains no cards, False otherwise.
   */
  def isEmpty: Boolean = bag.isEmpty

}

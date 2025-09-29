package Traits
import scala.collection.mutable._


/**
 * Trait defining the contract for any collection of cards (like a Deck or a Hand).
 */
trait GroupOfCards {

  /** The internal mutable collection of cards. */
  val bag: ArrayBuffer[Card]

  /** Checks if the collection is empty. */
  def isEmpty: Boolean

  /** Retrieves the internal card collection. */
  def getBag: ArrayBuffer[Card]

  /**
   * Retrieves a specific card by index.
   * @param I The 1-based index of the card to retrieve.
   */
  def getCard(I: Int): Card

  /**
   * Adds a card to the collection.
   * @param C The Card to add.
   */
  def addCard(C: Card): Unit

  /** Removes the first card from the collection. */
  def eraseCard(): Unit
}

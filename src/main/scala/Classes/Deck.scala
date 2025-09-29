package Classes
import scala.collection.mutable._
import Traits._

/**
 * Represents the game's draw pile (Deck).
 * It inherits all basic card collection methods from AbstractDeck.
 * Note: The Shuffle method is currently commented out.
 */
class Deck extends AbstractDeck {

  /** The bag is explicitly defined to override the trait requirement. */
  override val bag: ArrayBuffer[Card] = ArrayBuffer.empty[Card]

  /*
  def Shuffle(): Unit = {
    val ShuffleDesk = Random.shuffle(bag)
    bag.clear()
    bag ++= ShuffleDesk
  }
*/
}
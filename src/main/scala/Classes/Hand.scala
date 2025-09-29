package Classes
import scala.collection.mutable._
import Traits._

/**
 * Represents a Player's Hand of cards.
 * It inherits all basic card collection methods from AbstractDeck.
 * Note: A showCards method is currently commented out.
 */
class Hand extends AbstractDeck {

  /** The bag is explicitly defined to override the trait requirement. */
  override val bag: ArrayBuffer[Card] = ArrayBuffer.empty[Card]


  /* def showCards(): Unit = {
    var i: Int = 0
    while (i < bag.length) {
      var card: Card = bag.apply(i)
      println(s"name: ${card.getName}, strength: ${card.getStrength}, ActionPlease: ${card.getActionPlease}, Ability: ${card.getAbility}")
      i += 1
    }
  }

*/
}
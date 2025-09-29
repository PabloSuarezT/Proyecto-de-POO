package Classes
import scala.collection.mutable._
import Traits._

/**
 * Represents a concrete Siege unit card.
 * It inherits properties and methods from AbstractUnitCard.
 * @param Name The unit name.
 * @param Strength The unit strength.
 * @param Ability The unit ability.
 */
class Siege (Name: String, Strength: Int, Ability: String)
  extends AbstractUnitCard(Name,Strength, Ability){

  /**
   * Implements the action type for Siege units.
   * @return The constant string "soFar" for siege combat.
   */
  override def getActionPlease: String = "soFar"

}

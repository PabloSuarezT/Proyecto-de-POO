package Classes
import scala.collection.mutable._
import Traits._

/**
 * Represents a concrete Melee unit card.
 * It inherits properties and methods from AbstractUnitCard.
 * @param Name The unit name.
 * @param Strength The unit strength.
 * @param Ability The unit ability.
 */
class Melee(Name: String, Strength: Int, Ability: String)
  extends AbstractUnitCard(Name,Strength, Ability){

  /**
   * Implements the action type for Melee units.
   * @return The constant string "near" for melee combat.
   */
  override def getActionPlease: String = "near"

}

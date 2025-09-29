package Classes
import scala.collection.mutable._
import Traits._
/**
 * Represents a concrete Ranged unit card.
 * It inherits properties and methods from AbstractUnitCard.
 * @param Name The unit name.
 * @param Strength The unit strength.
 * @param Ability The unit ability.
 */
class Range (Name: String, Strength: Int, Ability: String)
  extends AbstractUnitCard(Name,Strength, Ability){

  /**
   * Implements the action type for Ranged units.
   * @return The constant string "far" for ranged combat.
   */
  override def getActionPlease: String = "far"

}

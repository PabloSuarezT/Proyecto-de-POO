package Classes
import scala.collection.mutable._
import Traits._

/**
 * Abstract base class for all unit cards (Melee, Range, Siege).
 * It implements the properties and basic getters/setters defined in UnitCard.
 * @param Name The name of the card (immutable).
 * @param Strength The current combat strength (mutable).
 * @param Ability The card's special ability description (immutable).
 */
abstract class AbstractUnitCard(val Name: String, var Strength: Int, val Ability: String ) extends UnitCard  {

  /** Retrieves the name of the card. */
  def getName: String = {
    Name
  }

  /** Retrieves the ability description. */
  def getAbility: String = {
    Ability
  }

  /** Retrieves the current strength value. */
  def getStrength: Int = {
    Strength
  }

  /**
   * Sets a new strength value.
   * @param v The new strength value.
   */
  def setStrength(v: Int): Unit = {
    Strength = v
  }
}

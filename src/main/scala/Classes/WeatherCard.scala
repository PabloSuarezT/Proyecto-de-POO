package Classes
import scala.collection.mutable._
import Traits._

/**
 * Represents a non-unit card, typically affecting the game board (weather effect).
 * It extends the base Card trait.
 * @param Name The name of the weather effect (immutable).
 * @param Ability The description of the weather effect's action (immutable).
 */
class WeatherCard(val Name: String, val Ability: String) extends Card{

  /** Retrieves the name of the weather card. */
  def getName: String = {
    Name
  }

  /** Retrieves the ability of the weather card. */
  def getAbility: String = {
    Ability
  }
}
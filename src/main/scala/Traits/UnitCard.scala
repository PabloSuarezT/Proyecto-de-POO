package Traits
import scala.collection.mutable._

/**
 * Trait defining the contract for a combat unit card.
 * It extends the base Card trait (assumed to contain basic card properties).
 */
trait UnitCard extends Card{

  /**
   * Defines the action type or combat range for the unit.
   * Must be implemented by concrete classes (e.g., "near", "far").
   */
  def getActionPlease: String

  /**
   * Retrieves the current strength value of the unit.
   */
  def getStrength: Int

  /**
   * Sets a new strength value for the unit.
   * @param v The new integer strength value.
   */
  def setStrength(v: Int): Unit
}
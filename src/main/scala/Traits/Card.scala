package Traits

/**
 * The base trait for all cards in the game.
 * All cards must implement these basic properties.
 */
trait Card {

  /** The name of the card. */
  val Name: String

  /** The special ability or effect description of the card. */
  val Ability: String

  /** Retrieves the name of the card. */
  def getName: String

  /** Retrieves the ability or effect description. */
  def getAbility: String
}
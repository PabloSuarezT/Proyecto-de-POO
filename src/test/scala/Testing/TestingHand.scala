package Testing
import munit.FunSuite
import scala.collection.mutable._
import Classes._
import Traits._

class TestingHand extends FunSuite{
  
  var hand: GroupOfCards = _
  
  override def beforeEach(context: BeforeEach): Unit = {
    hand = Hand()
  }
  

  test("chek the getCard method") {
    val rangeC: Card = new Range("dragon hunter", 5, "")
    hand.addCard(rangeC)
    assertEquals(hand.getCard(1), rangeC)
  }

/*  test("check the method showCards") {
    assert(hand.showCards == "")
    val meleeC: Card = Melee("errant knight", 4, "moral booster")
    hand.addCard(meleeC)
    assert(hand.showCards == "name: errant knight, strength: 4, ActionPlease: near Ability: moral booster")
  }
*/
  
  test("chek the addCard and isEmpty methods") {
    assert(hand.isEmpty)
    val meleeC: Card = Melee("errant knight", 4, "moral booster")
    hand.addCard(meleeC)
    assertEquals(hand.isEmpty, false)
  }

  test("check the eraseCard method") {
    val siegeC: Card = Siege("Ballista", 6, "")
    hand.addCard(siegeC)
    assertEquals(hand.isEmpty, false)
    hand.eraseCard()
    assert(hand.isEmpty)
  }

}

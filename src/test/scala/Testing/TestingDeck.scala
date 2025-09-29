package Testing
import munit.FunSuite
import scala.collection.mutable._
import Classes._
import Traits._


class TestingDeck extends FunSuite {
  
  var deck: GroupOfCards = _

  override def beforeEach(context: BeforeEach): Unit = {
    deck = Deck()
  }

  test("chek the addCard methods") {
    assert(deck.isEmpty)
    val meleeC: Card = Melee("errant knight", 4, "moral booster")
    deck.addCard(meleeC)
    assertEquals(deck.isEmpty,false)
  }

  test("chek the getCard method"){
    val rangeC: Card = new Range("dragon hunter",5,"")
    deck.addCard(rangeC)
    assertEquals(deck.getCard(1),rangeC)
  }

  test("check the eraseCard method") {
    val siegeC : Card = Siege("Ballista",6,"")
    deck.addCard(siegeC)
    assertEquals(deck.isEmpty,false)
    deck.eraseCard()
    assert(deck.isEmpty)
  }
  
  test("check the getBag method"){
    val bag: ArrayBuffer[Card] = ArrayBuffer.empty[Card]
    assertEquals(deck.getBag,bag)
  }
  /*
  test("check the Shuffle method"){
    val siegeC: Card = Siege("Ballista", 6, "")
    val rangeC: Card = new Range("dragon hunter", 5, "")
    val meleeC: Card = Melee("errant knight", 4, "moral booster")

    deck.addCard(meleeC)
    deck.addCard(siegeC)
    deck.addCard(rangeC)

    val OriginalSize = deck.getBag.size
    val OriginalOrder = deck.getBag.toList

    deck.Shuffle()

    val ShuffleOrder = deck.getBag.toList

    assertEquals(ShuffleOrder.size,OriginalSize)
    assertEquals(ShuffleOrder.sortBy(_.Name),OriginalOrder.sortBy(_.Name))
    assertNotEquals(OriginalOrder,ShuffleOrder)
  }

   */
}

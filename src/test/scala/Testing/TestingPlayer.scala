package Testing
import munit.FunSuite
import scala.collection.mutable._
import Classes._
import Traits._

class TestingPlayer extends FunSuite {
  
  var player: Player = _
  
  override def beforeEach(context: BeforeEach): Unit = {
    player = Player("Charles","player section",2)
  }
  
  test("check that the player has a name") {
    assertNotEquals(player.getName, "")
  }

  test("check that the player has a position in the board") {
    assertNotEquals(player.getPosition, "")
  }
  
  test("check the getLife method") {
    assertEquals(player.getLife, 2)
  }
  
  test("check the setLife method"){
    player.setLife(1)
    assertEquals(player.Life,1)
  }

  test("chek the getHand and getDeck method") {
    val hand: GroupOfCards = player.getHand
    val deck : GroupOfCards = player.getDeck
    assert(hand.isEmpty)
    assert(deck.isEmpty)
  }
  
}



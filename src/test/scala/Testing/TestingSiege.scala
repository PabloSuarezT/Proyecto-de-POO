package Testing
import munit.FunSuite
import scala.collection.mutable._
import Classes._
import Traits._

class TestingSiege extends FunSuite{
  
  var siege: UnitCard = _

  override def beforeEach(context: BeforeEach): Unit = {
    siege = Siege("Ballista",6,"")
  }

  test("check that the Siege class constructor initializes without error") {
    assert(siege != null)
  }
  
  test("check that the card has a correct name using the getName method"){
    assertNotEquals(siege.getName, "")
  }

  test("check that the card has strength") {
    assert(siege.getStrength > 0)
  }

  test("check that the card has a correct ability") {
    val ValidAbility: List[String] = List("moral booster", "close bond", "")
    assert(ValidAbility.contains(siege.getAbility))
  }
  
  test("check the getActionPlease method"){
    assertEquals(siege.getActionPlease,"soFar")
  }
  
  test("check the setStrength method"){
    siege.setStrength(1)
    assertEquals(siege.getStrength,1)
  }
  

}

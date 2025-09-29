package Testing
import munit.FunSuite
import scala.collection.mutable._
import Classes._
import Traits._

class TestingRange extends FunSuite{
  
  var range: UnitCard = _

  override def beforeEach(context: BeforeEach): Unit = {
    range = new Range("dragon hunter",5,"")
  }

  test("check that the Range class constructor initializes without error") {
    assert(range != null)
  }
  
  test("check that the card has a name using the getName method"){
    assertNotEquals(range.getName,"")
  }

  test("check that the card has strength") {
    assert(range.getStrength > 0)
  }

  test("check that the card has a correct ability") {
    val ValidAbility: List[String] = List("moral booster", "close bond", "")
    assert(ValidAbility.contains(range.getAbility))
  }
  
  test("check the getActionPlease method"){
    assertEquals(range.getActionPlease,"far")
  }
  
  test("check the setStrength method"){
    range.setStrength(1)
    assertEquals(range.getStrength,1)
  }
  
}

package Testing
import munit.FunSuite
import scala.collection.mutable._
import Classes._
import Traits._

class TestingMelee extends FunSuite {

  var melee: UnitCard = _

  override def beforeEach(context: BeforeEach): Unit = {
    melee = Melee("errant knight", 4, "moral booster")
  }

  test("check that the Melee class constructor initializes without error"){
    assert(melee != null)
  }

  test("check that the card has a name using the getName method") {
    assertNotEquals(melee.getName, "")
  }

  test("check that the card has strength") {
    assert(melee.getStrength > 0)
  }

  test("check that the card has a correct ability") {
    val ValidAbility: List[String] = List("moral booster", "close bond", "")
    assert(ValidAbility.contains(melee.getAbility))
  }


  test("chek the getActionPlease method") {
    assertEquals(melee.getActionPlease, "near")
  }

  test("chek the setStrength method") {
    melee.setStrength(1)
    assertEquals(melee.getStrength, 1)
  }

}
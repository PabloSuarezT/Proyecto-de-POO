package Testing
import munit.FunSuite
import scala.collection.mutable._
import Classes._
import Traits._

class TestingWeatherCard extends FunSuite {

  var Wcard: Card = _

  override def beforeEach(context: BeforeEach): Unit = {
    Wcard = WeatherCard("clear weather", "clear weather")
  }

  test("check that the Wcard has a name") {
    val ValidName: List[String] = List("Biting frost", "Impenetrable fog", "pouring rain", "clear weather")
    assert(ValidName.contains(Wcard.getName))
  }

  test("check that the Wcard has a correct ability") {
    val ValidAbility: List[String] = List("melee damage 1", "range damage 1", "siege damage 1", "clear weather")
    assert(ValidAbility.contains(Wcard.getAbility))
  }

  

}

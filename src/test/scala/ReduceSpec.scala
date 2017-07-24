import org.scalatest._

class ReduceSpec extends FlatSpec with Matchers {

  "reduceLeft" should "reduce collection" in {
    val result = List(1,3,5).reduceLeft {
      (a, b) => {
        println("a " + a + ", b " + b)
        a + b
      }
    }

    assertResult(9,"equality check")(result)
  }

  "reduce" should "reduce collection" in {
    val result = List(1,2,3,4,5,6,7,8,9).reduce {
      (a, b) => {
        println("a " + a + ", b " + b)
        a + b
      }
    }

    assertResult(45,"equality check")(result)
  }

  "reduceRight" should "reduce collection" in {
    val result = List(1,2,3,4,5,6,7,8,9).reduceRight {
      (a, b) => {
        println("a " + a + ", b " + b)
        a + b
      }
    }

    assertResult(45,"equality check")(result)
  }
}

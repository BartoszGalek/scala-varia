import org.scalatest.{FlatSpec, Matchers}

class ForComprehensionSpec extends FlatSpec with Matchers {

  "forComprehension result" should "equal iterative one" in {

    val myComprehension = ForComprehension()
    val expected = myComprehension.printAllForAllIterative
    val actual = myComprehension.printAllForAllComprehesion
    assert(actual==expected)
  }
}

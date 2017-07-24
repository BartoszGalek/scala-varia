import org.scalatest._

class FoldSpec extends FlatSpec with Matchers {

  "foldLeft" should "fold to List[String] from List[Int]" in {
    val ints = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val strings:List[String] = for (in <- ints.reverse) yield in.toString

    val result = ints.foldLeft(List[String]()) { (a, b) => b.toString :: a }
    assertResult(strings, "should equal")(result)
  }

  "foldLeft" should "fold to String from List[String]" in {
    val result = List("kayak","ayruveda","yeti", "abra", "kadabra").foldLeft("") { (a, b) => b.toList.head + a }

    assertResult("kayak", "should equal")(result)
  }

  "fold" should "fold to String" in {
    val result = List("kayak","ayruveda","yeti", "abra", "kadabra").fold("") { (a, b) => b.toList.head + a }

    assertResult("kayak", "should equal")(result)
  }

  "foldRight" should "fold collection" in {
    /*val ints = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val strings:List[String] = for (in <- ints) yield in.toString

    val result = ints.foldRight(List[String]()) { (a, b) => b.toString :: a }
    assertResult(strings, "should equal")(result)*/
    /*val result = List("kayak","ayruveda","yeti", "abra", "kadabra").foldRight("") { (a, b) => if (!b.isEmpty) b.toList.head + a else "" }

    assertResult("kayak", "should equal")(result)*/
  }
}

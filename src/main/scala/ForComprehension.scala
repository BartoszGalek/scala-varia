class ForComprehension {

  val countries = List("Poland", "Uganda", "Malesia", "Switzerland")
  val guests = List("Jolanta", "Lydia", "Sheila", "Albert",
    "Alex", "Fred", "Judita", "Danny",
    "Lukasz", "Agnieszka", "Jessica")
  val newlyWeds = List("Masturah", "Bartosz")

  private val connectorOne = " would love to see you "

  private val connectorTwo = " also in country of another guest "

  def printAllForAllIterative: List[String] = {

    var list: List[String] = List[String]()

    for (countryIdx <- 0 until countries.length) {
      val country = countries(countryIdx)
      for (guestIdx <- 0 until guests.length) {
        val guest = guests(guestIdx)
        for (newlyWedIdx <- 0 until newlyWeds.length) {
          val newlyWed = newlyWeds(newlyWedIdx)

          list ++= List(newlyWed +connectorOne +
            guest + connectorTwo + country)

        }
      }
    }
    list
  }

  def printAllForAllComprehesion: List[String] = {

    for {
      country <- countries
      guest <- guests
      newlyWed <- newlyWeds
    } yield {
      newlyWed +connectorOne +
        guest + connectorTwo + country
    }
  }
}

object ForComprehension {
  def apply(): ForComprehension = new ForComprehension()
}
package controllers
import play.api.db.Databases

object  WidgetDataBase{
val database = Databases(
  driver = "org.postgresql.Driver",
  url = "jdbc:postgresql://localhost/ScalaDataBase",
  name = "ScalaDataBase",
  config = Map(
    "username" -> "ScalaExample",
    "password" -> "scala"
  )
)
}
package example

import example.Tables.profile.api.Database
import example.Tables.profile.backend.DatabaseDef

object Hello extends App {
  val url = ""
  val username = ""
  val password = ""
  val db: DatabaseDef = Database.forURL(
    url = url,
    user = username,
    password = password,
  )
  val db1: Database = db
  println("hello")
}

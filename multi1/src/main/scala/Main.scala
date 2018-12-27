import monocle.macros.GenLens

object Main extends App {
  println("multi1 can use common sub-project")
  val entity = Entity("id", NestedEntity("value"))
  println(s"entity = $entity")

  println("multi1 can use monocle dependency")
  val idLens = GenLens[Entity](_.id)
  println(s"idLens = $idLens")
}

// src/main/scala/helloworld/HelloMain2

package helloworld

object HelloMain2:
  def main(params: Array[String]): Unit =
    println("Running from HelloMain2")
    params.map(s => s.toUpperCase).foreach(s => printf("%s ", s))
    println("")

// This is the Scala2 way of doing things
// When running runMain helloworld.HelloMain2, the objects main method (the entrypoint is called)
// HelloMain2 is defined as an object rather than as a class. objects are Singletons!
//    There can only be ONE instance (which Scala creates for you) of HelloMain2

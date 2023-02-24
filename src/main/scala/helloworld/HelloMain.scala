// src/main/scala/helloworld/HelloMain.scala

package helloworld

@main def Hello(params: String*): Unit =
  print("running from HelloMain")
  params.map(s => s.toUpperCase).foreach(s => printf("%s ",s))
  println("")

// OK. This works. It takes zero or more Strings as arguments (String*)
// map applies changes to elements in the list in-place
// foreach takes the elements in the list, and does something with it, without modifying it. ("side effects only")
// I cannot call runMain helloworld.HelloMain
// I have to call the entrypoint: runMain helloworld.Hello
// Return type: Unit --> Analogous to return type None in Python

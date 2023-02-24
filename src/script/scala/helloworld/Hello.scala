// src/script/scala/helloworld/Hello.scala

class Hello:  // class definition
  def convert(string_list: Seq[String]): Seq[String] =  // method definition. arguments and return type are optional
    string_list.map((s: String) => s.toUpperCase)

val up = new Hello()
val uppers = up.convert(List("Hello", "World", "!"))

println(uppers)

// Note that NO entrypoints have been defined here.
// Let's try to define an entrypoint on src/main/scala/...
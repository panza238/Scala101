package shapes


// Simple entrypoint to test out ProcessMessages
// It defines a sequence of messages and then processes each one with the ProcessMessages class
@main def ProcessShapesDriver: Unit =
  val messages = Seq(
    Draw(Circle(Point(0.0, 0.0), 1.0)),
    Draw(Rectangle(Point(0.0, 0.0), 2, 5)),
    Response(s"Say hello to pi: 3.14159"),
    Exit)

  // Me gusta la forma de iterar de Scala. Es mucho más elegante que los for loops
  messages.foreach { message =>
    val response = ProcessMessages(message)  // As we have seen with companion objects, the apply method is called
                                             // to create new messages
    println(response)
    println()
  }
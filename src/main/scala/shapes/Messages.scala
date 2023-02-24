package shapes

// Define Messages to emulate a sample application

sealed trait Message  // sealed trait --> all children classes MUST be defined in the same class!!
// Not that different from an abstract base class... For now...

// Now I can define the different kinds of messages that we are going to need.
case class Draw(shape: Shape) extends Message
case class Response(message: String) extends Message
case object Exit extends Message  // This is defined as a case object as the result of a design decision
                                  // Exit will only be a termination signal, so we are going to need only ONE instance

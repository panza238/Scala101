package shapes

// Actual Message Processor
object ProcessMessages:
  /* This Message Processor class is a singleton. It will serve as a Message factory
  This object will receive a Message, and respond according to the Message type received.
  The response will also be a message
  */
  def apply(message: Message): Message =  // The apply method works as a factory!
    message match
      case Exit =>  // If it receives an Exit sub-type Message, print something and return an Exit Message
        println(s"Message Processor exiting")
        Exit  // In Scala, there is NO need for an explicit return clause. The last line is the returned value.
      case Draw(shape) =>  // If it receives a Draw sub-type...
        shape.draw(str => println(s"Message Processor $str"))  // output: Message Processor
        Response(s"Response: $shape drawn")
      case Response(unexpected) =>  // If it receives a Response sub-type
        val response = Response(s"ERROR: Unexpected Response: $unexpected")
        println(s"ProcessMessage: $response")
        response

// OK It works!! It would probably be useful to separate the printed messages so as to show in the console
// where exactly is each message coming from! some are coming from .draw, others are coming from .apply

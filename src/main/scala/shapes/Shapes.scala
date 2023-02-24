package shapes

// I need to define a Point:
case class Point(x: Double = 0.0, y: Double = 0.0)
// case classes are kind of like (frozen, hashable, immutable) dataclasses in Python. It is a class with
//  batteries included. There are a few methods implemented for you when you instantiate a case class

// Then, I need an abstract base class Shape
abstract class Shape():
  /*
  This is a multi-line comment in Scala!
  */
  def draw(f: String => Unit): Unit =
    f(s"draw $this")  // $this is analogous to Python's self.
    // s"string {expression}" is a formated (or interpolated) string. 
    //    If calling a variable directly (NOT evaluating an expression), {} can be omitted
    // draw takes in a function as an argument. In this case, we will most likely pass the print function

// Now I can define shapes based on Shape. And I get to use the draw method!
case class Circle(center: Point, radius: Double) extends Shape
case class Rectangle(lower_left: Point, height: Double, width: Double) extends Shape
// I do not need colons : after defining these classes because they don't have a body!

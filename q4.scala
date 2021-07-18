//19001665
object q4 extends App {
  
  def evenOdd(n:Int) : String= n%2 match {
    case 0 => "Number is even"
    case _ => "Number is odd"
    
    }  
println(evenOdd(4))
}

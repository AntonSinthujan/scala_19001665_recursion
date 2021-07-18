//19001665
object q3 extends App {
  
  def add(n:Int) : Int= n match {
    case 0 => 0
    case 1 => n
    case _ => n+add(n-1)
    
    }  
println(add(5))
}

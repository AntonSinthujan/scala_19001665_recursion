//19001665
object q5 extends App {
  def even(n:Int) : Int = n match {
    case n if n<=0 => 0
    case n if (n-2)%2 ==0 => (n-2)+even(n-2)
    case n if (n-2)%2 ==1 => (n-1)+even(n-1)
}
  println(even(6))
  }

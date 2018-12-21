

object Hello extends App {

  def cake(c: Int): Int = {
    def addc(x: Int, y: Int) = x+y
    def mulc(x: Int, y: Int) = x*y
    mulc(c,3) * addc(1,2);
  }

  def fibo(c: Int = 1, p: Int = 0, m: Int): Any = {
    if (c >= m) return
    println(c+p)
    fibo(c+p, c, m)
  }


  /*  I want to do something like this.. store functions/methods inside an array:
      I couldn't find anything like this on google, but assume its possible.
  */
  //val ops = Array((a: Double, b: Double) => { a - b}, (a: Double, b: Double) => { a + b})
  //val ops = Array[(Double : Double) => Double](_ + _, _* _)

  val pi = 3.141592;
  def EstPi(c : Double = 4.0, i : Int = 1): Int = {
    if (Math.abs(c-pi)<0.00001 || i >= 99999999){ println(s"PI estimate: ${c}"); return i; }
    var j = 3 + ((i-1)*2)
    var r  = {
      i % 2 match {
        case 0 => c + (4.0/(j))
        case 1 => c - (4.0/(j))
      }
    }
    EstPi(r, i+1)
  }

  println(s"Cake result is: ${cake(3)}")

  var f = 20
  println(s"Fibonacci sequence until ${f}")
  fibo(m = f)

  println(s"Iterations to guess pi to ${s"${pi}".length()-1} places: ${EstPi()}")
}
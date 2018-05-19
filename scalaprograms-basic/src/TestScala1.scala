

class TestScala1() {
  
  
  def test(): Unit = { println("test") }
  
}

object ImpTestScala1 {
  
  def main(args: Array[String]): Unit = {
    
    val n = new TestScala1()
    n.test()
    
  }
  
}
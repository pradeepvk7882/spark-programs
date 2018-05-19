

case class MyCaseClass (empId: Int, empName: String, empLoc: String)
  
object TestMyCaseClass {
  
  def main(args: Array[String]): Unit = {
    val m1 = new MyCaseClass(100, "Pradeep", "Bloomington")
    val m2 = new MyCaseClass(200, "Pavithra", "Bloomington")
    
    println(m1 == m2) 
  } 
}
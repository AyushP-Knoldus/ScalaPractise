import scala.io.StdIn
object ArrayElementsProduct {
  def main(commandLineArguments : Array[String]):
  Unit=
    {
      println("Enter the size of the array")
      val lengthOfArray=StdIn.readInt()
      val userArray=new Array[Int](lengthOfArray)
      println("Enter elements of the array")
      for(array_index<- 0 until lengthOfArray)
        {
          userArray(array_index) = StdIn.readInt()
        }
      val resultantProduct=productOfElements(userArray)
      println(s"The product of elements of an array is : $resultantProduct")
    }
  def productOfElements(userArray: Array[Int]):
  Int=
    {
      var elementProduct=1
      for(elements<-userArray)
        {
          elementProduct=elementProduct*elements
        }
      elementProduct
    }


}

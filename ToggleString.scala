/*The given program is used to convert the case of the characters of inputted string
* ie; to lower case or upper case
*                                                         -Ayush Pathak*/
import scala.io.StdIn
object ToggleString {
  def main(commandLineArguments : Array[String]):
  Unit=
    {
      println("Enter the string")
      val inputtedString=StdIn.readLine()
      val resultantString=invertTheCase(inputtedString)
      println(s"The final string is : $resultantString")
    }
  def invertTheCase(userString : String):
  String=
    {
      var finalString=""
      for(character<- userString)
        {
          var asciiValue=character.toInt
          if(asciiValue >= 65 && asciiValue <= 90)
            {
              asciiValue=asciiValue+32
            }
          else
            {
              asciiValue=asciiValue-32
            }

          finalString=finalString+asciiValue.toChar
        }
      finalString
    }

}

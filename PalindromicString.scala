/*The given program is used to find if the inputted string is palindrome or not.
It will return true if string is palindrome else will return false.
                                                          -Ayush Pathak*/
import scala.io.StdIn
object PalindromicString {
  def main(commandLineArgument : Array[String]):
  Unit=
  {
    println("Enter the string to be checked")
    val inputtedString=StdIn.readLine()
    val result=checkPalindrome(inputtedString)
    var userString=checkPalindrome(inputtedString)
    println(result)
  }
  def checkPalindrome(userString :String):
  String=
    {
      var reversedString=""
      for(character<- userString)
      {
        reversedString=character+reversedString
      }
      if(userString == reversedString)
        {
          return "YES"
        }
      else
        {
          return "NO"
        }
    }
}

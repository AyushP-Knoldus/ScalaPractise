/*The program is used to check whether the image can be adjusted within the frame or not.
                                                                        -Ayush Pathak
* */
import scala.io.StdIn
object ProfilePicture {
 def main(commandLineArguments : Array[String]):
 Unit=
 {
   println("Enter the length of the frame L:")
   val lengthOfFrame=StdIn.readInt()
   println("Enter the width of the image W:")
   val widthOfImage=StdIn.readInt()
   println("Enter the height of the image H:")
   val heightOfImage=StdIn.readInt()
   val finalMessage=checkPictureCriteria(lengthOfFrame,widthOfImage,heightOfImage)
   println(finalMessage)
 }
 def checkPictureCriteria(lengthOfFrame:Int , widthOfImage:Int , heightOfImage:Int):
 String=
   {
     if(widthOfImage < lengthOfFrame || heightOfImage < lengthOfFrame)
       {
         "Upload Another Profile Image."
       }
     else if(widthOfImage > lengthOfFrame || heightOfImage > lengthOfFrame)
       {
         "Crop the Profile Image."
       }
     else
       {
         "Profile Image Accepted."
       }
   }
}

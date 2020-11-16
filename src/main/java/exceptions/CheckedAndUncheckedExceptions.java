package exceptions;

import java.io.File;
import java.io.IOException;

public class CheckedAndUncheckedExceptions {
  /* In java we differentiate between 2 types of exceptions: checked and unchecked exceptions:
    Checked exception: we need to handle this exception in the code
    Unchecked exception: we don't explicitly need to declare or handle the exception
   */

  /*
            Throwable
    Exception       Error
    Runtime Exception

    Unchecked exceptions are subclasses of Runtime Exception (and errors)
    Checked exceptions extend Exception (so everything else)

   */

  public static void main(String[] args){
//    unchecked exception
    int array[] = {1, 2, 3, 4};

//    System.out.print(array[6]);
//    checked exception
    try {
      new File("newfile.txt").createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }

    /* Application won't compile
    Application will throw an exception (at runtime)
     */

    StringBuffer emptyBuffer = null;
    //....
    emptyBuffer.append("addsomething");

  }
}

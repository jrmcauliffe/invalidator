package invalidator;

import com.amazonaws.services.s3.model._
import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger

case class NameInfo(firstName: String, lastName: String)

class Main {

  def invalidate(event: S3Event, context: Context): String = {
    
  val logger: LambdaLogger = context.getLogger 
  logger.log("Test of Log")
  "Out"
  }

}

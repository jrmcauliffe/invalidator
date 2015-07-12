package invalidator;

import com.amazonaws.services.lambda.runtime.{ Context, LambdaLogger }
import com.amazonaws.services.lambda.runtime.events.S3Event
import scala.collection.JavaConversions

case class NameInfo(firstName: String, lastName: String)

class Main {

  def invalidate(event: S3Event, context: Context): Unit = {

    val logger = context.getLogger

    val record = event.getRecords.get(0)
    
    // Get source bucket and key
    val bucket = record.getS3.getBucket.getName
    val key =  record.getS3.getObject.getKey  
    
    logger.log(bucket + ":" + key + "/n")

  }
}

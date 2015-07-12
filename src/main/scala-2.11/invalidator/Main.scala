package invalidator;

import com.amazonaws.services.lambda.runtime.{ Context, LambdaLogger }
import com.amazonaws.services.lambda.runtime.events.S3Event
import com.amazonaws.services.cloudfront._
import com.amazonaws.services.cloudfront.model._

class Main {

  def invalidate(event: S3Event, context: Context): Unit = {

    val logger = context.getLogger

    val record = event.getRecords.get(0)
    
    // Get source bucket and key
    val bucket = record.getS3.getBucket.getName
    val key =  record.getS3.getObject.getKey
    
    val cf = new AmazonCloudFrontClient
    
    val w = cf.listDistributions(new ListDistributionsRequest)

    logger.log(bucket + ":" + key + "\n")
    logger.log(cf.toString)
  }
}

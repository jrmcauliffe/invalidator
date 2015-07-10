package invalidator;

case class NameInfo(firstName: String, lastName: String)

class Main {
  import java.io.{InputStream, OutputStream, PrintStream}

  val scalaMapper = {
    import com.fasterxml.jackson.databind.ObjectMapper
    import com.fasterxml.jackson.module.scala.DefaultScalaModule
    new ObjectMapper().registerModule(new DefaultScalaModule)
  }

  def greeting(input: InputStream, output: OutputStream): Unit = {
    val name = scalaMapper.readValue(input, classOf[NameInfo])
    val result = "Greetings again ${name.firstName} ${name.lastName}." 
    output.write(result.getBytes("UTF-8"))
  }
}

import io.vertx.core.*

fun main(args: Array<String>) {
    val server = Vertx.vertx().createHttpServer()
    server
            .requestHandler({ req ->
                req.response().end("Hello World!")
            })
            .listen(8080, { handler ->
                if (!handler.succeeded()) {
                    System.err.println("Failed to listen on port 8080")
                }
            })
}
package ez.rest_db_proxy.verticle

import ez.rest_db_proxy.Config
import io.vertx.sqlclient.Pool
import io.vertx.sqlclient.SqlClient

class AsyncDbClientVerticle : DbClientVerticle() {
  override suspend fun createDbClient(): SqlClient {
    val config = Config.instance
    return Pool.pool(vertx, config.db.connect, config.db.pool)
  }
}

package ez.rest_db_proxy.verticle

import ez.rest_db_proxy.db.DbClientVerticle
import ez.vertx.core.config.ConfigVerticle
import io.vertx.sqlclient.Pool
import io.vertx.sqlclient.SqlClient

class AsyncDbClientVerticle : DbClientVerticle() {
  override suspend fun createDbClient(): SqlClient {
    val db: AsyncDbConfig by ConfigVerticle
    return Pool.pool(vertx, db.connect, db.pool)
  }

  override fun path(): String = "_asyncDb"
}

package ez.rest_db_proxy.verticle

import ez.rest_db_proxy.config.AsyncDbConfig
import ez.rest_db_proxy.db.DbClientVerticle
import io.vertx.sqlclient.Pool
import io.vertx.sqlclient.SqlClient

class AsyncDbClientVerticle : DbClientVerticle<AsyncDbConfig>() {
  override val key: String = AsyncDbConfig.key
  override var configValue = AsyncDbConfig()
  override suspend fun createDbClient(): SqlClient {
    return Pool.pool(vertx, configValue.connect, configValue.pool)
  }
}

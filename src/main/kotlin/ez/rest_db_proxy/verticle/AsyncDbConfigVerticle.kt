package ez.rest_db_proxy.verticle

import ez.vertx.core.config.ConfigVerticle
import io.vertx.sqlclient.PoolOptions
import io.vertx.sqlclient.SqlConnectOptions

@Suppress("unused")
class AsyncDbConfigVerticle: ConfigVerticle<AsyncDbConfig>() {
  override var configValue: AsyncDbConfig = AsyncDbConfig()
  override val key: String = "db"
}

class AsyncDbConfig {
  var connect = SqlConnectOptions()
  var pool = PoolOptions()
}

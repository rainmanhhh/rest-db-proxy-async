package ez.rest_db_proxy.config

import io.vertx.sqlclient.PoolOptions
import io.vertx.sqlclient.SqlConnectOptions

class AsyncDbConfig {
  companion object {
    val key = "db"
  }

  var connect = SqlConnectOptions()
  var pool = PoolOptions()
}

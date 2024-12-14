package db.migration;

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.SQLDataType.*;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

/**
* @see "https://www.jooq.org/doc/3.1/manual/sql-building/ddl-statements"
*/
public class V1734200396522__CrateTableEnvironment extends BaseJavaMigration {
  @Override
  public void migrate(Context context) {
    var create = using(context.getConnection());
    create.transaction(configuration -> using(configuration)
      .createTableIfNotExists("environment")
      .column("id", BIGINT.identity(true))
      .column("name", VARCHAR(100).nullable(false))
      .column("base_url", VARCHAR(350).nullable(true))
      .constraints(
        constraint("environment_pk").primaryKey("id"),
        constraint("environment_unique_name").unique("name"))
      .execute());
  }
}
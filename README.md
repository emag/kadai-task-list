# kadai-task-list

タスク管理アプリケーション

## 前提条件

* MySQL 5.7.x を立ち上げておくこと
  * 5.7.17 で動作確認
* env/dev.conf を適宜修正すること(特に `jdbcPassword`)

## 実行

``` console
sbt flywayMigrate
sbt run
```

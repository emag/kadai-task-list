package models

import scalikejdbc._
import skinny.orm._

/**
  * Task
  */
case class Task(id: Option[Long], content: String, status: Option[String])

object Task extends SkinnyCRUDMapper[Task] {

  override def tableName: String = "tasks"

  override def defaultAlias: Alias[Task] = createAlias("t")

  override def extract(rs: WrappedResultSet, n: ResultName[Task]): Task =
    autoConstruct(rs, n)

  private def toNamedValues(record: Task): Seq[(Symbol, Any)] = Seq(
    'content -> record.content,
    'status  -> record.status
  )

  def create(task: Task)(implicit session: DBSession): Long =
    createWithAttributes(toNamedValues(task): _*)

  def update(task: Task)(implicit session: DBSession): Int =
    updateById(task.id.get).withAttributes(toNamedValues(task): _*)

}

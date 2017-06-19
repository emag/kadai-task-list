package controllers

import javax.inject.{ Inject, Singleton }

import play.api.i18n.{ I18nSupport, MessagesApi }
import play.api.mvc.{ Action, AnyContent, Controller }

@Singleton
class DeleteTaskController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def delete(taskId: Long): Action[AnyContent] = ???

}

package controllers

import javax.inject.{ Inject, Singleton }

import play.api.i18n.{ I18nSupport, MessagesApi }
import play.api.mvc.{ Action, AnyContent, Controller }

@Singleton
class GetTaskController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def index(taskId: Long): Action[AnyContent] = ???

}

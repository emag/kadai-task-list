package controllers

import javax.inject.{ Inject, Singleton }

import forms.TaskForm
import models.Task
import play.api.i18n.{ I18nSupport, MessagesApi }
import play.api.mvc.{ Action, AnyContent, Controller }

@Singleton
class UpdateTaskController @Inject()(val messagesApi: MessagesApi)
    extends Controller
    with I18nSupport
    with TaskControllerSupport {

  def index(taskId: Long): Action[AnyContent] = Action { implicit request =>
    val result     = Task.findById(taskId).get
    val filledForm = form.fill(TaskForm(result.id, result.content))
    Ok(views.html.edit(filledForm))
  }

  def update: Action[AnyContent] = ???

}

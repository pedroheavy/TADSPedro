// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/usuario/Documents/crudmusica4/conf/routes
// @DATE:Fri Sep 21 11:29:00 BRT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  MusicaController_1: controllers.MusicaController,
  // @LINE:15
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    MusicaController_1: controllers.MusicaController,
    // @LINE:15
    Assets_0: controllers.Assets
  ) = this(errorHandler, MusicaController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MusicaController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """musicas""", """controllers.MusicaController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """musicas/edit/""" + "$" + """id<[^/]+>""", """controllers.MusicaController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """musicas/edit""", """controllers.MusicaController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """musicas/create""", """controllers.MusicaController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """musicas/""" + "$" + """id<[^/]+>""", """controllers.MusicaController.show(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """musicas/create""", """controllers.MusicaController.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """musicas/delete/""" + "$" + """id<[^/]+>""", """controllers.MusicaController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_MusicaController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("musicas")))
  )
  private[this] lazy val controllers_MusicaController_index0_invoker = createInvoker(
    MusicaController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MusicaController",
      "index",
      Nil,
      "GET",
      this.prefix + """musicas""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_MusicaController_edit1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("musicas/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MusicaController_edit1_invoker = createInvoker(
    MusicaController_1.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MusicaController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """musicas/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_MusicaController_update2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("musicas/edit")))
  )
  private[this] lazy val controllers_MusicaController_update2_invoker = createInvoker(
    MusicaController_1.update,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MusicaController",
      "update",
      Nil,
      "POST",
      this.prefix + """musicas/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_MusicaController_create3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("musicas/create")))
  )
  private[this] lazy val controllers_MusicaController_create3_invoker = createInvoker(
    MusicaController_1.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MusicaController",
      "create",
      Nil,
      "GET",
      this.prefix + """musicas/create""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_MusicaController_show4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("musicas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MusicaController_show4_invoker = createInvoker(
    MusicaController_1.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MusicaController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """musicas/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_MusicaController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("musicas/create")))
  )
  private[this] lazy val controllers_MusicaController_save5_invoker = createInvoker(
    MusicaController_1.save,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MusicaController",
      "save",
      Nil,
      "POST",
      this.prefix + """musicas/create""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_MusicaController_destroy6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("musicas/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MusicaController_destroy6_invoker = createInvoker(
    MusicaController_1.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MusicaController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """musicas/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_MusicaController_index0_route(params@_) =>
      call { 
        controllers_MusicaController_index0_invoker.call(MusicaController_1.index)
      }
  
    // @LINE:6
    case controllers_MusicaController_edit1_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MusicaController_edit1_invoker.call(MusicaController_1.edit(id))
      }
  
    // @LINE:7
    case controllers_MusicaController_update2_route(params@_) =>
      call { 
        controllers_MusicaController_update2_invoker.call(MusicaController_1.update)
      }
  
    // @LINE:8
    case controllers_MusicaController_create3_route(params@_) =>
      call { 
        controllers_MusicaController_create3_invoker.call(MusicaController_1.create)
      }
  
    // @LINE:9
    case controllers_MusicaController_show4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MusicaController_show4_invoker.call(MusicaController_1.show(id))
      }
  
    // @LINE:10
    case controllers_MusicaController_save5_route(params@_) =>
      call { 
        controllers_MusicaController_save5_invoker.call(MusicaController_1.save)
      }
  
    // @LINE:11
    case controllers_MusicaController_destroy6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MusicaController_destroy6_invoker.call(MusicaController_1.destroy(id))
      }
  
    // @LINE:15
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_0.versioned(path, file))
      }
  }
}

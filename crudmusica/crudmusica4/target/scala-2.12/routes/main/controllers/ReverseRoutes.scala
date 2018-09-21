// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/usuario/Documents/crudmusica4/conf/routes
// @DATE:Fri Sep 21 11:29:00 BRT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseMusicaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "musicas/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:8
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "musicas/create")
    }
  
    // @LINE:9
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "musicas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:11
    def destroy(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "musicas/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:10
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "musicas/create")
    }
  
    // @LINE:7
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "musicas/edit")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "musicas")
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}

// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/usuario/Documents/crudmusica4/conf/routes
// @DATE:Fri Sep 21 11:29:00 BRT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseMusicaController MusicaController = new controllers.ReverseMusicaController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseMusicaController MusicaController = new controllers.javascript.ReverseMusicaController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}

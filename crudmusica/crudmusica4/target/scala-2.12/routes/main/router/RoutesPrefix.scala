// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/usuario/Documents/crudmusica4/conf/routes
// @DATE:Fri Sep 21 11:29:00 BRT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}


package views.html.musicas

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Musica],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formMusica: Form[Musica]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<h1>Nova Musica</h1>

	"""),_display_(/*13.3*/form(action=routes.MusicaController.save)/*13.44*/{_display_(Seq[Any](format.raw/*13.45*/("""
	"""),_display_(/*14.3*/helper/*14.9*/.inputText(formMusica("id"))),format.raw/*14.37*/("""
	"""),_display_(/*15.3*/helper/*15.9*/.inputText(formMusica("nome"))),format.raw/*15.39*/("""
	"""),_display_(/*16.3*/helper/*16.9*/.inputText(formMusica("compositor"))),format.raw/*16.45*/("""
	"""),_display_(/*17.3*/helper/*17.9*/.inputText(formMusica("album"))),format.raw/*17.40*/("""
	"""),format.raw/*18.2*/("""<button action="submit">Criar</button>
""")))}),format.raw/*19.2*/("""

"""),format.raw/*21.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(formMusica:Form[Musica]): play.twirl.api.HtmlFormat.Appendable = apply(formMusica)

  def f:((Form[Musica]) => play.twirl.api.HtmlFormat.Appendable) = (formMusica) => apply(formMusica)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Sep 21 12:34:07 BRT 2018
                  SOURCE: C:/Users/usuario/Documents/crudmusica4/app/views/musicas/create.scala.html
                  HASH: 29bbd5ebc95f85fa3690655d8b67a5ad16a13af9
                  MATRIX: 963->1|1062->32|1107->27|1137->49|1165->51|1286->146|1336->187|1375->188|1405->192|1419->198|1468->226|1498->230|1512->236|1563->266|1593->270|1607->276|1664->312|1694->316|1708->322|1760->353|1790->356|1861->397|1892->401
                  LINES: 28->1|31->3|34->1|36->4|37->5|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|51->19|53->21
                  -- GENERATED --
              */
          
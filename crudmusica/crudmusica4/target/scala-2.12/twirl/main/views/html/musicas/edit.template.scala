
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Musica],play.twirl.api.HtmlFormat.Appendable] {

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
	<h1>Nova música</h1>

	"""),_display_(/*13.3*/form(action=routes.MusicaController.update())/*13.48*/{_display_(Seq[Any](format.raw/*13.49*/("""
	"""),_display_(/*14.3*/helper/*14.9*/.inputText(formMusica("id"))),format.raw/*14.37*/("""
	"""),_display_(/*15.3*/helper/*15.9*/.inputText(formMusica("nome"))),format.raw/*15.39*/("""
	"""),_display_(/*16.3*/helper/*16.9*/.inputText(formMusica("compositor"))),format.raw/*16.45*/("""
	"""),_display_(/*17.3*/helper/*17.9*/.inputText(formMusica("album"))),format.raw/*17.40*/("""
	"""),format.raw/*18.2*/("""<button action="submit">Atualizar</button>
""")))}),format.raw/*19.2*/("""



"""),format.raw/*23.1*/("""</body>
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
                  DATE: Fri Sep 21 12:57:52 BRT 2018
                  SOURCE: C:/Users/usuario/Documents/crudmusica4/app/views/musicas/edit.scala.html
                  HASH: 05cb8d3ca0145a371cab182d492c4804e9e58efb
                  MATRIX: 961->1|1060->32|1105->27|1135->49|1163->51|1284->146|1338->191|1377->192|1407->196|1421->202|1470->230|1500->234|1514->240|1565->270|1595->274|1609->280|1666->316|1696->320|1710->326|1762->357|1792->360|1867->405|1902->413
                  LINES: 28->1|31->3|34->1|36->4|37->5|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|51->19|55->23
                  -- GENERATED --
              */
          
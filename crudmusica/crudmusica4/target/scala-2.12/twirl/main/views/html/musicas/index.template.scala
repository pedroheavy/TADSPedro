
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Musica],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(musicas: Set[Musica]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
  <title></title>
</head>
<body>
  <h1>Todas as Musicas</h1>
    <form action=""""),_display_(/*10.20*/routes/*10.26*/.MusicaController.create),format.raw/*10.50*/("""">
      <button type="submit">Inserir</button>
    </form>
    <table border="1">
      <tr>
        <td>ID</td>
        <td>Nome</td>
        <td>Compositor</td>
        <td>Album</td>
      </tr>
        """),_display_(/*20.10*/for(musica <- musicas) yield /*20.32*/{_display_(Seq[Any](format.raw/*20.33*/("""
        """),format.raw/*21.9*/("""<tr>
          <td><a href=""""),_display_(/*22.25*/routes/*22.31*/.MusicaController.show(musica.getId())),format.raw/*22.69*/("""">"""),_display_(/*22.72*/musica/*22.78*/.id),format.raw/*22.81*/("""</a></td>
          <td>"""),_display_(/*23.16*/musica/*23.22*/.nome),format.raw/*23.27*/("""</td>
          <td>"""),_display_(/*24.16*/musica/*24.22*/.compositor),format.raw/*24.33*/("""</td>
          <td>"""),_display_(/*25.16*/musica/*25.22*/.album),format.raw/*25.28*/("""</td>
          <td><a href=""""),_display_(/*26.25*/routes/*26.31*/.MusicaController.destroy(musica.getId())),format.raw/*26.72*/("""">Excluir</a></td>
        </tr>
      """)))}),format.raw/*28.8*/("""
    """),format.raw/*29.5*/("""</table>
</body>
</html>"""))
      }
    }
  }

  def render(musicas:Set[Musica]): play.twirl.api.HtmlFormat.Appendable = apply(musicas)

  def f:((Set[Musica]) => play.twirl.api.HtmlFormat.Appendable) = (musicas) => apply(musicas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Sep 21 13:04:17 BRT 2018
                  SOURCE: C:/Users/usuario/Documents/crudmusica4/app/views/musicas/index.scala.html
                  HASH: df9f405336bdb6db124580c2f2dd641495c559d0
                  MATRIX: 961->1|1078->23|1108->27|1252->144|1267->150|1312->174|1557->392|1595->414|1634->415|1671->425|1728->455|1743->461|1802->499|1832->502|1847->508|1871->511|1924->537|1939->543|1965->548|2014->570|2029->576|2061->587|2110->609|2125->615|2152->621|2210->652|2225->658|2287->699|2359->741|2392->747
                  LINES: 28->1|33->1|35->3|42->10|42->10|42->10|52->20|52->20|52->20|53->21|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28|61->29
                  -- GENERATED --
              */
          
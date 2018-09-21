
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Musica,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(musica: Musica):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<h1>"""),_display_(/*8.7*/musica/*8.13*/.nome),format.raw/*8.18*/("""</h1>
	<p>Nome: """),_display_(/*9.12*/musica/*9.18*/.nome),format.raw/*9.23*/("""</p>
	<p>Compositor: """),_display_(/*10.18*/musica/*10.24*/.compositor),format.raw/*10.35*/("""</p>
	<p>Album: """),_display_(/*11.13*/musica/*11.19*/.album),format.raw/*11.25*/("""</p>
	<form action=""""),_display_(/*12.17*/routes/*12.23*/.MusicaController.edit(musica.getId())),format.raw/*12.61*/("""">Editar</form>

</body>
</html>"""))
      }
    }
  }

  def render(musica:Musica): play.twirl.api.HtmlFormat.Appendable = apply(musica)

  def f:((Musica) => play.twirl.api.HtmlFormat.Appendable) = (musica) => apply(musica)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Sep 21 12:23:13 BRT 2018
                  SOURCE: C:/Users/usuario/Documents/crudmusica4/app/views/musicas/show.scala.html
                  HASH: 931c2b65e2669496c4999b634e7235348c35a4fa
                  MATRIX: 955->1|1066->17|1094->19|1193->93|1207->99|1232->104|1276->122|1290->128|1315->133|1365->156|1380->162|1412->173|1457->191|1472->197|1499->203|1548->225|1563->231|1622->269
                  LINES: 28->1|33->1|34->2|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12
                  -- GENERATED --
              */
          
package controllers;

import play.mvc.*;
import views.html.musicas.*;
import models.Musica;
import java.util.Set;
import javax.inject.Inject;
import play.data.*;

public class MusicaController extends Controller {
  @Inject
  private FormFactory formFactory;

  // Mostrar todos
  public Result index() {
      Set<Musica> musicas = Musica.all();
      return ok(index.render(musicas));
  }

  //Mostrar uma música
  public Result show(Integer id){
   Musica musica = Musica.findById(id);
    if(musica == null){
      return notFound("Musica não encontrada!");
    } else{
      return ok(show.render(musica));
    }
  }

  //criar uma música
  public Result create(){
    Form<Musica>  form = formFactory.form(Musica.class);
    return ok(create.render(form));
  }

  //Salvar os dados da musica
  public Result save(){
    Form<Musica> form = formFactory.form(Musica.class).bindFromRequest();
    Musica musica = form.get();
    if(form.hasErrors()){
      return ok(create.render(form));
    }
    Musica.add(musica);
    return redirect(routes.MusicaController.index());
  }

  //editar uma música
  public Result edit(Integer id){
    Musica musica = Musica.findById(id);
    if(musica == null){
      return notFound("Musica não encontrada!");
    }
    Form<Musica> form = 
     formFactory.form(Musica.class).fill(musica);
    return ok(edit.render(form));
  }

  //atualizar uma música
  public Result update(){
    Musica musica = formFactory.form(Musica.class).bindFromRequest().get();
    Musica musicaAntiga = Musica.findById(musica.id);
    if(musicaAntiga ==null){
      return notFound("Musica não encontrada!");
    }
    musicaAntiga.nome = musica.nome;
    musicaAntiga.compositor = musica.compositor;
    musicaAntiga.album = musica.album;
    return redirect(routes.MusicaController.index());
  }

  //excluir uma música
  public Result destroy(Integer id){
    Musica musica = Musica.findById(id);
    if(musica.id == null){
      return notFound("Musica não encontrada");
    }
    Musica.remove(musica);
    return redirect(routes.MusicaController.index());

  }
}



package models;

import java.util.*;

public class Musica{

	public Integer id;
	public String nome;
	public String compositor;
	public String album;

	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}

	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getCompositor(){
		return compositor;
	}
	public void setCompositor(String compositor){
		this.compositor = compositor;
	}

	public String getAlbum(){
		return album;
	}
	public void setAlbum(String album){
		this.album = album;
	}

	public Musica(Integer id, String nome, String compositor, String album){
		this.id = id;
		this.nome = nome;
		this.compositor = compositor;
		this.album = album;
	}

	public Musica(){
		this.id = -1;
	}

	private static Set<Musica> musicas;

	static{
		musicas = new HashSet<>();
		musicas.add(new Musica(1, "hail to the king", "M. Shadows", "hail to the king"));
		musicas.add(new Musica(2, "True friends", "Oliver", "that´s the spirit"));
	}

	public static Set<Musica> all(){
		return musicas;
	}

	  public static Musica findById(Integer id){
    for(Musica musica: musicas){
      if(id.equals(musica.id)){
        return musica;
      }
    }
    return null;
  }

	public static void add(Musica musica){
		musicas.add(musica);
	}

	public static void remove(Musica musica){
		musicas.remove(musica);
	}


}

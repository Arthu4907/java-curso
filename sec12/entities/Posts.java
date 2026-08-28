package sec12.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {
    
    private Date moment;
    private String title;
    private  String conteudo;
    private  Integer likes;

    private List <Comentarios> coment = new ArrayList<>();

    public Posts(){

    }

    public Posts(Date moment, String title, String conteudo, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentarios> getComent() {
        return coment;
    }

   public void addComentario(Comentarios coments){
     coment.add(coments);
   }
   public void removeComentarios(Comentarios coments){
    coment.remove(coments);
   }
    
}

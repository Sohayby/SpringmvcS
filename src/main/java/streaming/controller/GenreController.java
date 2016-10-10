/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.entity.Genre;
import streaming.service.GenreCrudService;

/**
 *
 * @author admin
 */
@Controller
public class GenreController {

    @Autowired
    private GenreCrudService crud;
    
    @RequestMapping (value = "/ajouter_genre/{genreAc}", method =RequestMethod.POST)
    public String ajouterPost (@ModelAttribute ("genreAc") Genre genre ){
        crud.save(genre);
        return "redirect:liste_genres/";
    }
    
    @RequestMapping (value = "/ajouter_genre/{genreAc}", method =RequestMethod.GET )
    public String  ajouter (Model model){
        Genre genre= new Genre();
        crud.save(genre);   
        return "redirect:liste_genres/";
        
    } 
    
    
    @RequestMapping (value ="/modifier_genre", method = RequestMethod.POST )
    public String modifierPOST (@ModelAttribute ("genreAc") Genre genre){
       crud.save(genre);
               return "redirect:/liste_genres";
    }
    
    @RequestMapping (value = "/supprimer_genre/{val}", method = RequestMethod.GET)
        
    public String supprimer(@PathVariable("val")   long idGenreAsupprimer){
       
        crud.delete(idGenreAsupprimer);
        return "redirect:/liste_genres";
    }
    @RequestMapping (value = "/modifier_genre/{idGenre}", method = RequestMethod.GET)
    
    public String modifierGET (@PathVariable ("idGenre") long id, Model model){
     // recup genre
        Genre genre = crud.findOne(id);
        
        //Prép l'attribut à dstinantion
        model.addAttribute("genreAct", genre);
        
        //Renvoie ==> JSP
        return "modifier_genre.jsp";
    }
              
        @RequestMapping(value = {"/liste_genres", "/"}, method = RequestMethod.GET)
            
    public String lister(Model m) {
        List<Genre> genres = crud.findAllByOrderByNom();

        m.addAttribute("genres", genres);
        return "genre_lister.jsp";
    }

}

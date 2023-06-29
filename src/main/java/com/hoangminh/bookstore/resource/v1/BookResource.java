/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoangminh.bookstore.resource.v1;

import com.hoangminh.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngmin
 */
@Path("v1/books")
public class BookResource {
    
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Book getABook(){
//        return new Book("b1", "Đời ngắn đừng ngủ dài", "Japan", 2, 2016);
//    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks(){
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("b1", "Đời ngắn đừng ngủ dài", "Japan", 2, 2016));
        list.add(new Book("b1", "Tuổi trẻ đáng giá bao nhiêu", "Japan", 2, 2016));
        list.add(new Book("b1", "Tony buổi sáng", "Japan", 2, 2016));
        return list;
    }
}

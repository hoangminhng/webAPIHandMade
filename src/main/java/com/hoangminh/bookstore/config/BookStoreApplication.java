/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoangminh.bookstore.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author ngmin
 */
@ApplicationPath("/api")
public class BookStoreApplication extends ResourceConfig{

    public BookStoreApplication() {
        packages("com.hoangminh.bookstore.resource");
    }
    //đây là class điều phối luồng xử lý api đến các class khác
    //các class khác có nhiệm vụ xử lý JSON, DB nếu cần
    
    //class này bắn cái xử lý cho các class khác - class lo JSON
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen;

import Informacion.Datos;
import com.google.gson.Gson;

/**
 *
 * @author JesusQuiroz
 */

    public class convertir {
   public Datos aclase(String cadena){ 
       Gson gson= new Gson();
     return gson.fromJson( cadena, Datos.class);
}

public String ajson(Datos datos){
    Gson gson = new Gson();
    return gson.toJson(datos);
    
}
}

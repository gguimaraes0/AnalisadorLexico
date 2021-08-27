/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisadorlexico;

/**
 *
 * @author Grupo 3
 */
public class customToken {
    
    public String value;
    public int id;
    public String type;
    
    public String getValue(){
        return value;
    }
    
    public String getId(){
        return String.valueOf(id);
    }
    
    public String getType(){
        return type;
    }
    
}

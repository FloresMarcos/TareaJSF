/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREAJUEVES15.beans;

/**
 *
 * @author MAESTRO
 */

import TAREAJUEVES15.helper.userHelper;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

//@Named(value="userBeans")
@ManagedBean
@SessionScoped
public class userBeans  implements Serializable {

  private static final long serialVersionUID = 1L;
    // String fname="";
     //String lname="";
//  private String userName;
//  private String userAppat;
//  private String userApmat;
//  private String userEdad;
//  private String userSexo;
  @Getter
  @Setter
    private userHelper helper;

   public userBeans() {
   helper=new userHelper();
   }
  private List<String> datos=new ArrayList<>();
 
  
  public void ALTAS(){
      String ficha="|nombre:  "+helper.getUserName()
                  +"   |apellido:  "+helper.getUserAppat()
                  +"   "+helper.getUserApmat()
                  +"   |sexo:  "+helper.getUserSexo()
                  +"   |edad:  "+helper.getUserEdad()
                  +" |";
//      this.datos.add(helper.getUserName());
//      this.datos.add(helper.getUserAppat());
//      this.datos.add(helper.getUserApmat());
//      this.datos.add(helper.getUserEdad());
//      this.datos.add(helper.getUserSexo());
      this.datos.add(ficha);
      helper.setUserName(null);
      helper.setUserAppat(null);
      helper.setUserApmat(null);
      helper.setUserEdad(null);
      helper.setUserSexo(null);
  }  
  
//    public void clear(){
//    helper.setUserName(null);
//    helper.setUserAppat(null);
//    helper.setUserApmat(null);
//    helper.setUserEdad(null);
//    helper.setUserSexo(null);
//    
//}//end clear`
//  public String getUserName() {
//    return userName;
//  }    
//  public void setUserName(String userName) {
//    this.userName = userName;
//  }
//
//  public String getUserAppat() {
//    return userAppat;
//  }
//  public void setUserAppat(String userAppat) {
//    this.userAppat = userAppat;
//  }
//  public String getUserApmat() {
//    return userApmat;
//  }
//
//  public void setUserApmat(String userApmat) {
//    this.userApmat = userApmat;
//  }
//  public String getUserEdad() {
//    return userEdad;
//  }
//
//  public void setUserEdad(String userEdad) {
//    this.userEdad = userEdad;
//  }
//  public String getUserSexo() {
//    return userSexo;
//  }
//
//  public void setUserSexo(String userSexo) {
//    this.userSexo = userSexo;
//  }
  public List<String> getDatos() {
    return datos;
  }

}
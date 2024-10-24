/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author prath
 */
public class Controller {
    public void showMenu(){
        View view = new View();
        StudentModel model = new StudentModel();
        
        view.collectData(model);
        view.display(model);
    }
}

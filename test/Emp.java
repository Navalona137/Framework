package model;

import etu1884.annotation.*;
import etu1884.obj.*;

@ClassAnnotation
public class Emp {
    @MyAnnotation(value = "emp-findAll")
    public void findAll(){
        System.out.println("findAll");
    }
    
    @MyAnnotation(value = "emp-add")
    public void add(){
        System.out.println("add");
    }

    @MyAnnotation(value = "emp-view")
    public ModelView getView(){
    	ModelView view = new ModelView();
    	view.setView("hello.jsp");
    	return view;
    }
}

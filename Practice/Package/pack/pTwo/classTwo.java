// Create a class with variable(s) and method(s) (all will be default accessed) under package pOne. Now create a class under package pTwo, which is subclass of firstly created class. In the method here (i.e. class of pTwo) call variable(s) and method(s) of pre - vious class (i.e. class of pOne). If errors come, rectify them. Now from Main (under working directory) access second class’s members.

package pTwo;
import Practice.Package.pOne.classOne;

public class classTwo extends classOne{
    
    protected void accessMember(){
        System.out.println(s);
        show();
    }


}

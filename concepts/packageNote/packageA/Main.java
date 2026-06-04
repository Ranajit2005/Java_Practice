package packageA;

public class Main {
    public static void main(String[] args){
        A.methodOfA1();
    }
}


/* For runing this code
PS C:\Users\RANAJIT\OneDrive\Desktop\Code\Java\concepts\packageNote\packageA> javac -d . A.java
PS C:\Users\RANAJIT\OneDrive\Desktop\Code\Java\concepts\packageNote\packageA> javac -d . Main.java
PS C:\Users\RANAJIT\OneDrive\Desktop\Code\Java\concepts\packageNote\packageA> java packageA.Main


so commend is : javac -d <directory> sourceFile.java 
javac used for compiling,
-d stand for destination,(Here we used . which means current directory)

When we run javac -d . A.java and javac -d . Main.java, it will create a folder named packageA in the current directory. So then when need to run the Main class, we need to specify the package name as well, which is packageA.Main. So we run java packageA.Main. 

*/

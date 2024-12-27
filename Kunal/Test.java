class Demo{

    //ambuguous error
    void D1(int a,double b){
        System.out.println("D1 int and int");
    }

    void D1(float a,int b){
        System.out.println("D1 int and double");
    }

    


}

class Test{
    public static void main(String[] args) {
        Demo d = new Demo();
        // d.D1(2, 2);
    }
}
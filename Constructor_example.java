package constructor;

public class Constructor_example {
    int a;
    int n;
    float f;
    String s;
    boolean b;

    //This is non parameterized constructor
    Constructor_example(){
        System.out.println("This is the Non parameterized constructor of class constructor example");
        System.out.println(a);
        System.out.println(n);
        System.out.println(f);
        System.out.println(s);
        System.out.println(b);
    }

    //This is parameterized constructor
    Constructor_example(int a1,int n1,float f1,String s1,boolean b1){
        this.a=a1;
        this.n=n1;
        this.f=f1;
        this.s=s1;
        this.b=b1;

        System.out.println("This is the parameterized constructor of class constructor example");
        System.out.println(a);
        System.out.println(n);
        System.out.println(f);
        System.out.println(s);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Constructor_example obj1=new Constructor_example();
        Constructor_example obj2=new Constructor_example(5,2,2.2f,"aman",true);
    }

    
}

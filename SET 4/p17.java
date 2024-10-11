public class p17 {

     static class parent
    {
        void println()
        {
            System.out.println("This is a parent class.");
        }
    }

    static class child extends parent
    {
        void println()
        {
            System.out.println("This is a child class.");
        }   
    }
    public static void main(String[] args) {
        parent ob1 = new parent();
        parent ob2 = new child();
        ob1.println();
        ob2.println();

    }    
}



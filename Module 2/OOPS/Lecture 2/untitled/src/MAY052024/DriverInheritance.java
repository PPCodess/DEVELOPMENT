class Dad {
    public  String plot(){
        return "200 ghaz ka plot";
    }
}
     class khushi extends Dad{

        public void demo(){
            plot();
        }
         public  String plot(){
             return "200 ghaz ka plot";
         }
    }

    public class DriverInheritance{
        public static void main(String[] args) {
             khushi khushi1=new khushi();
            System.out.println(khushi1.plot());
        }
    }


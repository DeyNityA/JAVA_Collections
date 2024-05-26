public class Singleton{
    private int no;
    private Singleton(int no){
        this.no=no;
    }
    private static Singleton instance=null;
    public static Singleton getInstance(int no){
        if(instance==null){
            instance=new Singleton(no);
        }
        return instance;
    }
    public void show(){
        System.out.println(this.no);
    }
}

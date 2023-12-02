public class Main {
    public static void main(String[] args){
        try{
        String empty =null;
        System.out.println(empty.length());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("NullPointerException : " + e.getMessage());
            e.printStackTrace();
            System.out.println("NullPointerException が発生しました！");
        }
    }
}

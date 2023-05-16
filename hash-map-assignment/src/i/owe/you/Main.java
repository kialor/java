package i.owe.you;

public class Main {
    public static void main(String[] args){
        IOU kiasIOU = new IOU();
        kiasIOU.setSum("Aaron", 100.5);
        kiasIOU.setSum("Jacky", 50);

        System.out.println(kiasIOU.howMuchDoIOweTo("Aaron"));
        System.out.println(kiasIOU.howMuchDoIOweTo("Jacky"));
    }
}

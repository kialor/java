public class MainCounter {
    public static void main(String[] args){

        Counter counter1 = new Counter(10);

        System.out.println("First count");
        System.out.println("start value: " +counter1.value());

        counter1.increase();
        System.out.println("increase value: "+counter1.value());

        counter1.decrease();
        System.out.println("decrease value: " +counter1.value());

        counter1.decrease(3);
        System.out.println("decrease by 3: " +counter1.value());

        counter1.increase(15);
        System.out.println("increase by 15: " +counter1.value());


        Counter counter2 = new Counter();
        System.out.println();
        System.out.println("Second count");

        System.out.println("start value: " +counter2.value());

        counter2.increase(5);
        System.out.println("increase by 5: " +counter2.value());

        counter2.increase(-1);
        System.out.println("increase by -1: " +counter2.value());

        counter2.decrease();
        System.out.println("decrease: " +counter2.value());

        counter2.increase();
        System.out.println("increase: " +counter2.value());

        counter2.decrease(2);
        System.out.println("decrease by 2: " +counter2.value());

        counter2.decrease(-6);
        System.out.println("decrease by -6: " +counter2.value());

    }
}

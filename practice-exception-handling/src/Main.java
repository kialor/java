public class Main {
    public static void main(String[] args){
            Person person1 = new Person("Megan", 28);

            System.out.println(person1.getName()+ " is " +person1.getAge());


            //Throws exception
            Person person2 = new Person("Joe", 187);
            System.out.println(person2.getName()+ " is " +person2.getAge());

            Calculator calculator = new Calculator();
            System.out.println(calculator.factorial(5));

            //Throws exception
            System.out.println(calculator.factorial(-10));

            System.out.println(calculator.binomialCoefficient(8,2));

            //Throws exception
            System.out.println(calculator.binomialCoefficient(2,5));

    }
}

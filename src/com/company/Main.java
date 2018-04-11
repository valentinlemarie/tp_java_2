package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Counter c1 = new Counter(2,10);
        Counter c2 = new Counter(22);
        Counter c3 = new Counter();
        c3.init(4,8+12);
        c3.count();c3.count();
        System.out.println("counter 1 position :"+c1.position+"  step : "+c1.step);
        System.out.println("counter 2 position :"+c2.position+"  step : "+c2.step);
        System.out.println("counter 3 changement objet -> position :"+c3.position+"  step : "+c3.step);
        System.out.println("counter 3 consulte objet   -> position :"+c3.getPosition());

        Counter counter1 = new Counter();
        Counter counter2 = counter1;
        counter1.position = 10 ;
        if(counter1.position == counter2.position){
            System.out.println("egalite instance de classe");
        }

    }
}

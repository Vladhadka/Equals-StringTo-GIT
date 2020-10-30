package com.aleksiienkov;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Vasya", "Pupkin", "18");
        Human human2 = new Human("Mitya", "Vibeyglaz", "33");
        Human human3 = new Human("Vasya", "Pupkin", "18");



	    if(human1.equals(human3)){
            System.out.println(human1.toString()+"   equal to   "+human3.toString());




	    }
	    else System.out.println(human1.toString()+"    not equal to        "+human3.toString());
	          if (human1.equals(human2)){
            System.out.println(human1.toString()+"   equal to    "+human3.toString());
        }
      else System.out.println(human1.toString()+"   not equal to  "+human2.toString());






    }



}


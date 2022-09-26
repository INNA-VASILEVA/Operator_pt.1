public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int age1 = 29;
        if (age1 >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        }
        if (age1 < 18) {
            System.out.println("Возраст совершеннолетия еще не достигнут, нужно подождать");
        }
//Задание 2
        System.out.println("Задание 2");
        int age2 = 23;
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Пора идти в школу!");
        }
        if (age2 >= 18 && age2 <= 23) {
            System.out.println("Пора в университет!");
        }
        if (age2 >= 24) {
            System.out.println("Пора искать работу!");
        }
//Задание 3
        System.out.println("Задание 3");
        int totalSeats = 102;
        int totalSitSeats = 60;
        int totalUpSpace = totalSeats - totalSitSeats;

        int sitSeats = 59;
        int upSpace = 0;
        if (sitSeats >= 61) {
            System.out.println("Сидячих мест нет");
        }
        if (sitSeats < 60) {
            System.out.println("Есть еще " + (totalSitSeats - sitSeats) + " сидячих мест");
        }
        if (upSpace >= 43) {
            System.out.println("Стоячих мест нет");
        }
        if (upSpace <= 42) {
            System.out.println("Есть еще " + (totalUpSpace - upSpace) + " стоячих мест");
        }
        if (sitSeats + upSpace >= 103) {
            System.out.println("Никаких мест нет");
        }
        if (sitSeats + upSpace <= 102) {
            System.out.println("Места есть!");
        }


//Задание 2.1
        System.out.println("Задание 2.1");
        int age3 = 17;
        if (age3 >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия еще не достигнут, нужно подождать");

        }

//Задание 2.2
        System.out.println("Задание 2.2");
        int age4 = 29;
        if (age4 >= 7 && age4 <= 17) {
            System.out.println("Пора идти в школу!");
        } else {
            if (age4 >= 18 && age4 <= 23) {
                System.out.println("Пора в университет!");
            } else {
                System.out.println("Пора искать работу!");
            }
        }

//Задание 2.3
        System.out.println("Задание 2.3");
        int totalSeats1 = 102;
        int sitSeats1 = 60;
        int upSpace1 = totalSeats1 - sitSeats1;

        int sitSeats0 = 38;
        int upSpace0 = 22;
        if (sitSeats1 >= 61) {
            System.out.println("Сидячих мест нет");
        } else {
            System.out.println("Есть еще " + (sitSeats1 - sitSeats0) + " сидячих мест");
        }
        if (upSpace0 >= 43) {
            System.out.println("Стоячих мест нет");
        } else {
            System.out.println("Есть еще " + (upSpace1 - upSpace0) + " сидячих мест");
        }
        if (sitSeats1 + upSpace1 >= 103) {
            System.out.println("Никаких мест нет");
        } else {
            System.out.println("Места есть!");
        }
//Задание 3.1
        System.out.println("Задание 3.1");
        int ageKid = 25;
        if (ageKid >= 2 && ageKid <= 6) {
            System.out.println("Если возраст человека равен " + ageKid + ", то ему нужно ходить в сад");
        } else if (ageKid >= 7 && ageKid <= 18) {
            System.out.println("Если возраст человека равен " + ageKid + ", то ему нужно ходить в школу");
        } else if (ageKid >= 19 && ageKid <= 24) {
            System.out.println("Если возраст человека равен " + ageKid + ", то ему нужно ходить в университет");
        } else if (ageKid > 24) {
            System.out.println("Если возраст человека равен " + ageKid + ", то ему нужно ходить на работу");
        }
//Задание 3.2
        System.out.println("Задание 3.2");
        int ageChild = 29;
        if (ageChild < 5) {
            System.out.println("Кататься нельзя");
        } else {
            if (ageChild >= 5 && ageChild <= 13) {
                System.out.println("Кататься можно только со взрослыми");
            } else {
                System.out.println("Кататься без взрослых можно");
            }
        }
//Задание 3.3
        System.out.println("Задание 3.3");
        int one = 14;
        int two = 11;
        int free = 8;
        if (free > one && free > two) {
            System.out.println("бОльшее из трех числел " + free);
        } else {
            if (two > one && two > free) {
                System.out.println("бОльшее из трех числел " + two);
            } else {
                if (one > two && one > free) {
                    System.out.println("бОльшее из трех числел " + one);
                } else {
                    if (one == two || one == free) {
                        System.out.println(one + " числа равны!");
                    } else {
                        if (two == one || two == free) {
                            System.out.println(two + " числа равны!");
                        } else {
                            if (free == one || free == two) {
                                System.out.println(free + " числа равны!");
                            }
                        }
                    }
                }
            }
        }
    }
}
public class Main {

// ЗАДАНИЕ 1
// вариант 1
    public static void main(String[] args) {
        String aVar = "'";
        String aVar1 = "\"";
        String aVar2 = "---";
        String aVar3 = "/";
        String aVar4 = "\\";
        String aVar5 = "|";
        String aVar6 = "[";
        String aVar7 = "]";

        System.out.println("____________________" + aVar + aVar1 + "_________");
        System.out.println("___________________" + aVar2 + "________");
        System.out.println("_______________" + aVar3 + aVar4 + "_" + aVar5 + "_" + aVar5 + "_______");
        System.out.println("______________" + aVar3 + "__" + aVar4 + aVar5 + "_" + aVar5 + "_______");
        System.out.println("_____________" + aVar3 + "____" + aVar4 + "_" + aVar5 + "_______");
        System.out.println("____________" + aVar3 + "______" + aVar4 + aVar5 + "_______");
        System.out.println("___________" + aVar3 + "__" + aVar6 + "__" + aVar7 + "__" + aVar4 + "_______");
        System.out.println("__________" + aVar3 + aVar5 + "________" + aVar5 + aVar4 + "_______");
        System.out.println("_________" + aVar3 + "_" + aVar5 + "________" + aVar5 + "_" + aVar4 + "______");
        System.out.println("__________" + "_" + aVar5 + "__" + aVar2 + "___" + aVar5 + "_" + "______");
        System.out.println("__________" + "_" + aVar5 + "__" + aVar2 + "___" + aVar5 + "_" + "______");
        System.out.println("__________" + "_" + aVar5 + "__" + aVar5 + "_" + aVar5 + "___" + aVar5 + "_" + "______");
    }


// варинат 2

        public static void main(String[] args) {
            String aVar = "____________________'\"_________\n___________________---________\n_______________/\\_|_|_______\n______________/__\\|_|_______\n_____________/____\\_|_______\n____________/______\\|_______\n___________/__[__]__\\_______\n__________/ |_______|\\_______\n_________/_|________|_\\______\n___________|__---___|_______\n___________|__---___|_______\n___________|__|_|___|_______";
            System.out.println(aVar);

    }

//ЗАДАНИ 2

        public static void main(String[] args) {
        byte number1 = 1;
        String city = "Omsk";
        int population = 1500500;
        float unemployed = (float) 8.5000;
        System.out.printf("%d Город: %s, Население: %d, Процент безработных: %.2f \n", number1, city, population, unemployed);
        byte number2 = 2;
        char section = 65;
        short place = 522;
        short ticket = 1500;
        System.out.printf("%d Секция на трибуне: %s, Место: %d, Стоимость билета: %d \n", number2, section, place, ticket);
        byte number3 = 3;
        String name = "Max";
        byte age = 33;
        short height = 180;
        System.out.printf("%d Имя: %s, Возраст: %d, Рост: %d \n", number3, name, age, height);
        byte number4 = 4;
        char letter1 = 65;
        short place1 = 100;
        char letter2 = 65;
        char letter3 = 65;
        short weight = 2500;
        System.out.printf("%d Номер машины: %s%d%s%s, Вес автомобиля: %d \n", number4, letter1, place1, letter2, letter3, weight);
        byte number5 = 5;
        String name_company = "BRIGADA";
        int income = 9500000;
        float market_share = (float) 15.564;
        System.out.printf("%d Название компании: %s, Годовой доход: %d, Доля на рынке: %.2f \n", number5, name_company, income, market_share);
        byte number6 = 6;
        char rh = 43;
        byte blood_type = 2;
        float people = (float) 45.0356;
        System.out.printf("%d Резус фактор: %s, Группа крови: %d, Доля людей с группой крови: %.2f \n", number6, rh, blood_type, people);
        byte number7 = 7;
        String name_university = "UPI";
        int student = 5563;
        float deducted = (float) 8.56564;
        System.out.printf("%d Университет: %s, Число студентов: %d, Доля отчисленных: %.2f \n", number7, name_university, student, deducted);
        byte number8 = 8;
        char type_top_movie1 = 80;
        char type_top_movie2 = 71;
        char type_top_movie3 = 45;
        char type_top_movie4 = 49;
        char type_top_movie5 = 51;
        long movie = 56233121556615l;
        int top_movie = 155;
        System.out.printf("%d Рейтинг фильма: %s%s%s%s%s, Продано копий: %d, Рейтинг: %d \n", number8, type_top_movie1, type_top_movie2, type_top_movie3, type_top_movie4, type_top_movie5, movie, top_movie);
        byte number9 = 9;
        String goods = "ZARA";
        long quantity_goods = 565685221999l;
        float percent_sales = (float) 15.80564;
        System.out.printf("%d Название бренда: %s, Произведено товаров: %d Процент продаж: %.1f \n", number9, goods, quantity_goods, percent_sales);
        byte number10 = 10;
        char product_category = 87;
        long code = 655595995655l;
        float percent_buyer = (float) 10.564;
        System.out.printf("%d Категория товара: %s, Штрих-код: %d, Процент покупателей старше 30 лет: %.0f \n", number10, product_category, code, percent_buyer);
    }
}

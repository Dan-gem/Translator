import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

//        String Weather;
        System.out.println("Введите слово о погоде на русском языке для перевода на английский язык: ");
        Scanner in = new Scanner(System.in);
        // На 8 строке создаем объект класса Scanner для обработки ввода с клавиатуры.
        String Weather = in.next();
        // На 10 строке создаем строковую локальную переменную с именем Weather и
        // принимаем от нее ввод от пользователя до первого пробела.

        switch (Weather) { // На 13 строке создаем конструкцию многозначного выбора, переключатель
            // switch-case, в котором в качестве выражения селектора, передаем переменную - Weather.
            case "метель":
                System.out.println("blizzard"); //    метель - blizzard.
                break;
            case "холодный":
                System.out.println("cold");     //    холодный - cold.
                break;
            case "мороз":
                System.out.println("frost");    //    мороз - frost.
                break;
            case "тепло":
                System.out.println("heat");     //    тепло - heat.
                break;
            case "дождь":
                System.out.println("rain");     //    дождь - rain.
                break;
            case "снег":
                System.out.println("snow");     //    снег - snow.
                break;
            case "буря":
                System.out.println("storm");    //    буря - storm.
                break;
            case "солнце":
                System.out.println("sun");      //    солнце - sun.
                break;
            case "ветер":
                System.out.println("wind");     //    ветер - wind.
                break;
            case "туман":
                System.out.println("fog");      //    туман - fog.
                break;
            default: // На 45 строке создаем не обязательный оператор default, тело которого выполняется в случае,
                // если значение выражения селектора не совпадает ни с одним из значений постоянных выражений.
                System.out.println ("К сожалению, для запроса "+Weather+" у нас пока ничего нет.");
                break;

        }
        String a = Weather;
        if (a != Weather) {



        } else {

        }
    }
}

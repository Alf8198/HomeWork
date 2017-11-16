package HomeWork_ch_4;
//Необходимо написать программу , которая позволяла бы определить насколько код введенный
//пользователем, как парамерты при запуске программы, ссответствует секретному коду.
//Вызов программы из командной строки мог бы быть примерно таким: java GuessProg 3 2 2 2 7
//А ответ программы может выть возможно таким:
//4 digit(s) correctly included.-это столько цифр во введенном при запуске наборе соответствует
//секретному набору(просто присутствуют в нем, позиция при этом не важна);
//1 digit(s) correctly placed.-это столько цифр во введенном при запуске наборе не только
//содержаться в секретном наборе, но и при этом еще и находятся на соответсвующих местах.
//Сам секретный код задается в программе, как содержимое списака, например ArrayList,
//наподобие след. фрагмента кода:
//List secretSolution = new ArrayList();
//secretSolution.add("5");
//secretSolution.add("3");
//Задаваемый при запуске программы параметры так же внутри кода преобразуются в список через
//поэлементное добавление их в список.
//Поиск кол-ва цифр , которые просто правильно присутствуют, должен быть реализован при помощи
//использования "boolean remove(Object element)" из интерфейса Collection, а не вариант этого метода,
//заданный в интерфейсе List: "Object remove(int index)". А поиск кол-ва правильно размещенный цифр
//должен быть реализован с помощью алгоритма поэлементного сравнения двух списков, реализованного
//на базе итераторов 2-х списков: собственно содержащего секретный код, и того, который был полусен,
//как результат преобразованния вводных параметров программы.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> secNum = new ArrayList<>();
        ArrayList<Integer> userNum = new ArrayList<>();

        int included = 0;
        int placed = 0;

        //Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            if (secNum.contains(secNum)){
                secNum.add((int) (Math.random() * 9 + 1));
            }else {
                continue;
            }
            }
        System.out.println(secNum);
        for (int i = 0; i < 5; i++) {
            userNum.add((int) (Math.random() * 9 + 1));
            //userNum.add(scanner.nextInt());
        }
        System.out.println(userNum);
        for (int i = 0; i < secNum.size(); i++) {
            for (int j = 0; j < userNum.size(); j++) {
                if ((secNum.get(i) == userNum.get(j)) == true) {
                    included++;
                }
            }
        }
        System.out.println(included);

    }

//    public static boolean target(int num) {
//        boolean[] shot = new boolean[0];
//        while (num > 0) {
//            if (shot[num % 10]) return true;
//            shot[num % 10] = true;
//            num /= 10;
//        }
//        return false;
//    }
}

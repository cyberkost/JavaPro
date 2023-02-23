package tasks_02_17_2023;

//AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
//**ДОБАВИТЬ ПРОВЕРКУ

public class Task5 {

//    Создаётся пустая строка result, которая будет содержать результат.
//    Создаётся переменная count, которая будет содержать количество повторений текущего символа.
//    Изначально count устанавливается равным 1, так как каждый символ встречается как минимум один раз.
//    Выполняется цикл по символам в строке s.
//    Если текущий символ совпадает с последующим символом и строка s не закончилась, то увеличиваем переменную count на 1.
//    Если текущий символ не совпадает с последующим символом, то добавляем в результат количество повторений count и текущий символ, а затем сбрасываем count на 1.
//    В конце работы цикла возвращается строка result, содержащая количество повторений каждого символа.

    public static void main(String[] args) {
        String s = "AAASSDDFFRRTGGBNHYUUU";
        String result = getNewString(s);
        System.out.println(result);
    }
    public static String getNewString(String s) {
        String result = "";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result += count + "" + s.charAt(i);
                count = 1;
            }
        }
        return result;
    }
}
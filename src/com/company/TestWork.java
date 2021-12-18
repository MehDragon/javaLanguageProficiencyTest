package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestWork {

    public int maximumOf2(int a, int b) {
//        TODO 1. верните максимальное из 2 целых чисел
        return Math.max(a,b);
    }

    public int maxNumFromArray(int[] numbers) {
//        TODO 2. верните максимальное число из массива
        int max = Integer.MIN_VALUE;
        for (int i: numbers) {
            if (i>max) max =i;
        }
        return max;
    }

    public int[] sortNumbers(int[] numbers) {
//        TODO 3. верните отсортированный по возрастанию массив
        return Arrays.stream(numbers).sorted().toArray();
    }

    public int[] sortInverseNumbers(int [] numbers) {
//        TODO 4. верните отсортированный по убыванию массив
        Arrays.sort(numbers);
        int[] res = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            res[res.length -i - i] = numbers[i];
        }
        return res;
    }

    public String invertWord(String string) {
//        TODO 5. Инвертировать слово.
//                Например:
//                ввод: abcdef
//                вывод: fedcba

        return new StringBuilder(string).reverse().toString();
    }

    public String upperCaseFirstSymbolEachWord(String text) {
//        TODO 6. Сделать первый символ каждого слова заглавным, а остальные маленькими.
//              Пример:
//              ввод: мама мыЛа раму
//              вывод: Мама Мыла Раму
        return null;
    }

    public String calcCharacterFrequency(String text) {
//        TODO 7. Посчитать сколько раз каждый символ встречается в слове, игнорируя регистр.
//         Символы вывести по алфавиту
//              Пример:
//              ввод: маМа мыла рАму
//              вывод: { =2, а=4, л=1, м=4, р=1, у=1, ы=1}

        return null;
    }

    public boolean isWordStartWith(String start, String word) {
//        TODO 8. Определить начинается ли слова с определённой последовательности символов, игнорируя регистр.
        return word.startsWith(start.toLowerCase());
    }

    public String applyRurSuffix(long count) {
        final String MONEY_ONE = "рубль";
        final String MONEY_MANY = "рублей";
        final String MONEY_OTHER_MANY = "рубля";

//        TODO 9. Верните слово "рубль" в род. падеже, в зависимости от введённого количества
//          Пример:
//              Ввод: 23
//              Вывод: рубля
        return null;
    }
}

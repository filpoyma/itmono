package com.itmonopoly.Lesson_08;

/*
Метод substring() имеет два варианта и возвращает новую строку, которая является подстрокой данной строки. Подстрока начинается с символа, заданного индексом beginIndex, и продолжается до конца данной строки или до endIndex-1, если введен второй аргумент.
синтаксис -
String substring(int beginIndex)
или
String substring(int beginIndex, int endIndex)

toCharArray() — преобразует данную строку в новый массив символов.
синтаксис -
public char[] toCharArray();

charAt - возвращает символ, расположенный по указанному индексу строки.
length - дл. строки

indexOf("str") строки "substring" возвратит 3. если не неходит, то возвратит -1 (ищет первое вхождение)
indexOf("str", 4) начнет искать с 4го индекса. от слова strstrstr возвратит 6.

substring(begin, end);
substring(begin) от begin и до конца
строка - набор символов char

replace("str", "other") - каждое вхождение str заменться на other

Метод split() — разделяет данную строку вокруг данного регулярного выражения и имеет два варианта.

Синтаксис
public String[] split(String regex, int limit)
или
public String[] split(String regex)

regex - регулярное выражение

регулярные выражения:
\s - пробел
\d - все числа
\w - символы
.* - ноль или более символов
.+ - один или более символов
a123b с рег выр 1.*2 сколько угодно символов между 1 и 2 втом числе никаких.
\s{3} найти пробелы, которые 3 подряд
\s{3,8} от 3х до 8ми пробелов
[567] один из символов
[567]+ последовательность символов из этого набора
replaceAll(regexp, "other");
regex101.com
[1-30]{2}\.\d{2}\.\d{4}
 */


public class String_Lesson {
    public static void main(String[] args) {
        //является ли слово полиндромом
        boolean is_palindrom = true;
        String word = "АРозаУпалаНаЛапуАзора";
        word = word.toLowerCase();
        for (int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                is_palindrom = false;
                break;
            }
        }
        if(is_palindrom) System.out.println("Полиндром");
        else System.out.println("НеПолиндром");

        //******************************************************//
        //
        String str = "The World Is MineMineMine";
        String sub_str = "Mine";
        System.out.println(str.indexOf(sub_str));
        System.out.println(str.indexOf(sub_str, 19));

//      вычисляем кол-во подстрок в строке
        int count = 0;
        int index = str.indexOf(sub_str);
        while (index != -1) {
            count++;
            index = str.indexOf(sub_str, index + 1);
        }
        System.out.println("кол-во подстрок в строке - " + count);

        // вывод на экран строк, которые между под строками

        str = "The Mine World Is Mine kuhkjh Mine";
        sub_str = "Mine";
        count = 0;
        index = str.indexOf(sub_str);
        System.out.println("index: " + index);
        while (index != -1) {
            count++;
            int nextIndex = word.indexOf(sub_str, index + 1);
            if (nextIndex != -1){
                String exc = str.substring(index + sub_str.length(), nextIndex);
                System.out.println(exc);
            }
            index = nextIndex;
        }
        System.out.println("Count - " + count);


        //*******************************************************************************************//
        str = "сегодня       солнце солнце";
        String space = " ";
        // перевести первые буквы слов в заглавные
        //str = str.replace("  ", " ");
        str = str.replaceAll("\\s+", " ");
        count = 0;
        index = str.indexOf(space);

        while (index != -1) {
            count++;
            index = str.indexOf(space, index + 1);
        }

        String[] words = new String[count + 1];
        index = str.indexOf(space);
        int idx = 0;
        words[idx] = str.substring(0, index);
        while (index != -1){
            idx++;
            int nextIndex = str.indexOf(space, index + 1);
            if (nextIndex != -1) words[idx] = str.substring(index + space.length(), nextIndex);
            else words[idx] = str.substring(index + 1);
            index = nextIndex;
        }

        for(idx = 0; idx < words.length; idx++){
            String tmp1, tmp2;
            word = words[idx];
            tmp1 = word.substring(0, 1);
            tmp2 = word.substring(1, word.length());
            tmp1 = tmp1.toUpperCase();
            words[idx] = tmp1 + tmp2;
        }
        for(idx = 0; idx < words.length; idx++) System.out.print(words[idx]+" ");

        words = str.split(space);

    }
}

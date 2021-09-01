/**
 * 1. Создать класс, в котором будет статический метод.
 * (почитать и понять, чем статический метод отличается от нестатического - обсудить на занятии по необходимости)
 * Этот метод принимает на вход три параметра:
 * login
 * password
 * confirmPassword
 * Все поля имеют тип данных String.
 * Длина login должна быть меньше 20 символов и не должен содержать пробелы.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Метод возвращает true, если значения верны или false в другом случае.
 */

package com.tms.task1;

public class Main {

    public static void main(String[] args) {
        System.out.println(Task.checkAccountData("qwerty", "1a2345b", "1a2345b"));
        System.out.println("----------------");
        System.out.println(Task.checkAccountData("qwe rty", "1a2345b", "1a2345b"));
        System.out.println("----------------");
        System.out.println(Task.checkAccountData("qwerty", "qwerty", "qwerty"));
        System.out.println("----------------");
        System.out.println(Task.checkAccountData("qwerty", "qwerty1", "qwerty"));
        System.out.println("----------------");
        System.out.println(Task.checkAccountData("qwerty", "qw erty", "qw erty"));
        System.out.println("----------------");
    }

}


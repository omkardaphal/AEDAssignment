/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.DateTimeException;
import java.time.LocalDate;

/**
 *
 * @author swappy
 */
public class ValidateDate {

    public static boolean isDateValid(int year, int month, int day) {
        boolean dateIsValid = true;
        try {
            LocalDate.of(year, month, day);

        } catch (DateTimeException e) {
            dateIsValid = false;

        }
        return dateIsValid;
    }

}

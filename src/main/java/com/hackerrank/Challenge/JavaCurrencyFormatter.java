package com.hackerrank.Challenge;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Given a double-precision number, payment , denoting an amount of money, use
 * the NumberFormat class' getCurrencyInstance method to convert payment into
 * the US, Indian, Chinese, and French currency formats. Then print the
 * formatted values as follows: Where formattedPayment is payment formatted
 * according to the appropriate Locale's currency. Note: India does not have a
 * built-in Locale, so you must construct one where the language is en (i.e.,
 * English). 
 * Ex.: 
 * Input 
 * 12324.134
 * 
 * Output
 * US: $12,324.13 
 * India: Rs.12,324.13 
 * China: ￥12,324.13 
 * France: 12 324,13 €
 */

public class JavaCurrencyFormatter {
	public static void main(String[] args) {
		double payment = 12324.134;

		System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
		System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
		System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
		System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr", "FR")).format(payment));
	}
}

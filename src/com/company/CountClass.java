package com.company;


import java.util.Locale;

public class CountClass {
    private String text;
    char[] alphabet = new char[26];
    int[] count = new int[26];

    public CountClass(String text){
        this.text = text.toLowerCase(Locale.ROOT);
    }

    public void countLetters() {
        int j = 0;
        for (char c = 'a'; c <= 'z'; c++) // for-loop to initialize alphabet
        {
            int counter = 0; // counter for each character of alphabet
            for (int i = 0; i < text.length(); i++) //for-loop to compare alphabet with all characters of variable "text"
            {
                if (c == text.charAt(i)) counter++;
            }
            alphabet[j] = c;
            count[j] = counter;
            j++;

        }
        showResult();
    }

    private void showResult(){
        for (int i = 0; i < alphabet.length; i++)
            System.out.println(alphabet[i] + " : " + count[i]);
    }
}

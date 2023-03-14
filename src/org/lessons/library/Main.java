package org.lessons.library;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class Main {



        private final static String FILE_PATH = "./books.txt";

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Quanti libri vuoi mettere? ");
            int n = Integer.parseInt(scan.nextLine());
            //Book[] list
            Book[] list = new Book[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Titolo del libro n " + (i+1)  +"° : ");
                String titolo = scan.nextLine();
                if (titolo.isEmpty()){
                    throw new IllegalArgumentException("Titolo non valido eddaje");
                }
                System.out.print("numero di pagine: ");
                int numPagine = Integer.parseInt(scan.nextLine());
                if (numPagine <= 0 ){
                    throw new IllegalArgumentException("numero non valido");
                }
                System.out.print("autore: ");
                String autore = scan.nextLine();
                if (autore.isEmpty()){
                    throw new IllegalArgumentException("Autore non valido SVEGLIATI!");
                }
                System.out.print("editore: ");
                String editore = scan.nextLine();
                if (editore.isEmpty()){
                    throw new IllegalArgumentException("e io non ti valido editore! gne gne");
                }
                Book p = new  Book(titolo,numPagine, autore,editore );
                System.out.println("************ * *************");
                list[i] = p;
            }
            scan.close();

            FileWriter myWriter = null;
            try {
                myWriter = new FileWriter(FILE_PATH, true);
                for (Book currentBook : list) {
                    myWriter.write(currentBook.toString() + "\n");
                }
            } catch (IOException e) {
                System.out.println("Unable to create file");
                System.out.println(e.getMessage());
            } finally {
                if (myWriter != null) {
                    try {
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

            //leggo il file
            Scanner fileScanner = null;
            try {
                fileScanner = new Scanner(new File(FILE_PATH));
                while (fileScanner.hasNext()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
                if (fileScanner != null) {
                    try {
                        fileScanner.close();
                    } catch (IllegalStateException ise) {
                        ise.printStackTrace();
                    }
                }
            }
        }
    }

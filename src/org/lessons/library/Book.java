package org.lessons.library;

public class Book {
   private String titolo;
    private int numPagine;
    private String autore;
    private String editore;

    //costruttore

    public Book(String titolo, int numPagine, String autore, String editore) {
        setTitolo(titolo);
        setNumPagine(numPagine);
        setAutore(autore);
        setEditore(editore);

    }
//getter e setter


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) throws IllegalArgumentException {
        if (titolo == null || titolo.isEmpty()) {
            throw new IllegalArgumentException("Titolo non valido eddaje");
        }
        this.titolo = titolo;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(int numPagine) throws IllegalArgumentException {
        if (numPagine <= 0 ) {
            throw new IllegalArgumentException("Numero di pagine non valide SVEGLIA!");
        }
        this.numPagine = numPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore)  throws IllegalArgumentException  {
        if (autore == null || autore.isEmpty()) {
            throw new IllegalArgumentException("Autore non validone");
        }
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) throws IllegalArgumentException  {
        if (editore == null || editore.isEmpty()) {
            throw new IllegalArgumentException("E io non te la valido! gne gne");
        }
        this.editore = editore;
    }


    @Override
    public String toString() {
        return "Titolo: " + getTitolo() + " Numero di pagine: " + getNumPagine();
    }
}






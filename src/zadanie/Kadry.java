package zadanie;

import java.util.Scanner;

public class Kadry extends Pracownik

{
    public int getZatrudnienie()
    {
        return zatrudnienie_;
    }

    private Pracownik [] pracownicy_;
    private int zatrudnienie_;
    public Kadry()
    {
        pracownicy_ = new Pracownik[100]; //przydzielenie pamieci dla tablicy pracownicy_ dla stu obiektow klasy Pracownik
        zatrudnienie_ = 0;                //ustala poczatkowa wartosc zatrudnienia na zero
    }
    public void dodajPracownika(Pracownik pracownik)  //metoda przyjmujaca jako parametr pracownia klasy Pracownik
    {
        if (zatrudnienie_<=99)                        //warunek okreslajacy czy mozna dodac kolejnego pracownika
        {
            pracownicy_[zatrudnienie_]=pracownik;     //intrukcja przypisania pracownika do tablicy pracownicy_ oraz nadanie mu wartosci zatrudnienie_
            System.out.println("Dodales nowego pracownika, ktorego numer to"+zatrudnienie_);
            zatrudnienie_++;                          //inkrementacja wartosci zatrudnienie_
        }
        else if (zatrudnienie_>=100)
        {
            System.out.println("Nie mozna dodac kolejnych pracownikow");
        }
    }
    public void dodajPracownikaInteraktywnie(Pracownik pracownik)
    {
        if (zatrudnienie_ <=99)
        {
            System.out.println("Podaj dane nowego pracownika");
            Scanner imie = new Scanner(System.in);
            System.out.println("imie: ");


        }

    }
}
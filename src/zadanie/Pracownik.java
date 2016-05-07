package zadanie;


public class Pracownik
{
    private String imie;
    private String nazwisko;
    private double placa;
    private char plec;
    private int dzial;



    public int getDzial()
    {
        return dzial;
    }


    public void przypiszWartosc()
    {
        imie = "";
        nazwisko = "";
        placa = 0.00;
        plec = 'K';
        dzial = 0;

    }
    public String toString()
    {
        return "Imie: \n" +imie+"nazwisko: \n"+nazwisko+"Placa: \n"+placa+"Plec: \n"+plec+"Dzial: \n"+dzial;
    }
    public boolean czyPracujeWDziale()
    {
        if (dzial == getDzial())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}

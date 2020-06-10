package Beobachtmuster;

import java.util.HashSet;
import java.util.Set;

public abstract class Beobachtbar
{
    Set<Beobachter> _beobachter;

    public Beobachtbar()
    {
        _beobachter = new HashSet<Beobachter>();
    }

    public void registiereBeobachter(Beobachter beobachter)
    {
        _beobachter.add(beobachter);
    }

    public void informiereUeberAenderung()
    {
        for (Beobachter beobachter : _beobachter)
        {
            beobachter.reagiereAufAenderung();
        }
    }

}

package Beobachtmuster;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Mit dieser Klasse können die Klassen überwacht werden. 
 * 
 * Mit dem Interface Beobachter kann es die Zustandsänderung
 * der Klasse zu anderen Klassen informieren. 
 *
 */
public abstract class Beobachtbar
{
    Set<Beobachter> _beobachter;

    /**
     * Initialisiert ein Beobachter
     */
    public Beobachtbar()
    {
        _beobachter = new HashSet<Beobachter>();
    }

    /**
     * Registiert diesem Set des Beobachtern ein neues Beobachter hinzu
     * 
     * @param beobachter
     * 
     * @require beobachter != null 
     */
    public void registiereBeobachter(Beobachter beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter ist null";

        _beobachter.add(beobachter);
    }

    /**
     * Informiert jedem Beobachter in der Set des Beobachtern
     * 
     * @require _beobachter != null
     * 
     */
    public void informiereUeberAenderung()
    {
        for (Beobachter beobachter : _beobachter)
        {
            assert _beobachter != null : "Vorbedingung verletzt: _beobachter ist null";

            beobachter.reagiereAufAenderung();
        }
    }

}

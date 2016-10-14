package com.geocalk.feranodor.androidgeocalk.Grunt;

import static java.lang.Math.round;

/**
 * Created by Feranodor on 2016-08-28.
 * gliny ily i takie tam.
 */
public class GruntSpoisty extends Grunt {
    private NazwaSpoistegoGruntu nazwa;
    private TypSpoistego typ;
    private float spojnoscGruntu;
    private float stPlastGruntu;

    private void Tablica2(NazwaSpoistegoGruntu n, float s)
    {
        if(n==NazwaSpoistegoGruntu.ZWIR_GLINIASTY||n==NazwaSpoistegoGruntu.POSPOLKA_GLINIASTA)
        {
            gestWlasc=2.65f;
            if (s<0.25f) {
                wilgNat = 9;
                gestObj = 2.2f;
            } else if (s<0.50f) {
                wilgNat = 15;
                gestObj = 2.1f;
            } else {
                wilgNat = 18;
                gestObj = 2.05f;
            }
        }else if(n==NazwaSpoistegoGruntu.PIASEK_GLINIASTY)
        {
            gestWlasc=2.65f;
            if (s<0.25f) {
                wilgNat = 13;
                gestObj = 2.15f;
            } else if (s<0.50f) {
                wilgNat = 16;
                gestObj = 2.1f;
            } else {
                wilgNat = 19;
                gestObj = 2.05f;
            }
        }else if(n==NazwaSpoistegoGruntu.PYL_PIASZCZYSTY)
        {
            gestWlasc=2.66f;
            if (s<0.25f) {
                wilgNat = 18;
                gestObj = 2.1f;
            } else if (s<0.50f) {
                wilgNat = 20;
                gestObj = 2.05f;
            } else {
                wilgNat = 22;
                gestObj = 2f;
            }
        }else if(n==NazwaSpoistegoGruntu.PYL)
        {
            gestWlasc=2.67f;
            if (s<0.25f) {
                wilgNat = 22;
                gestObj = 2.05f;
            } else if (s<0.50f) {
                wilgNat = 24;
                gestObj = 2f;
            } else {
                wilgNat = 26;
                gestObj = 1.95f;
            }
        }else if(n==NazwaSpoistegoGruntu.GLINA_PIASZCZYSTA)
        {
            gestWlasc=2.67f;
            if (s<0.25f) {
                wilgNat = 12;
                gestObj = 2.2f;
            } else if (s<0.50f) {
                wilgNat = 17;
                gestObj = 2.1f;
            } else {
                wilgNat = 24;
                gestObj = 2f;
            }
        }else if(n==NazwaSpoistegoGruntu.GLINA)
        {
            gestWlasc=2.67f;
            if (s<0.25f) {
                wilgNat = 16;
                gestObj = 2.15f;
            } else if (s<0.50f) {
                wilgNat = 21;
                gestObj = 2.05f;
            } else {
                wilgNat = 27;
                gestObj = 1.95f;
            }
        }else if(n==NazwaSpoistegoGruntu.GLINA_PYLASTA)
        {
            gestWlasc=2.68f;
            if (s<0.25f) {
                wilgNat = 20;
                gestObj = 2.1f;
            } else if (s<0.50f) {
                wilgNat = 25;
                gestObj = 2f;
            } else {
                wilgNat = 32;
                gestObj = 1.9f;
            }
        }else if(n==NazwaSpoistegoGruntu.GLINA_PIASZCZYSTA_ZWIEZLA)
        {
            gestWlasc=2.68f;
            if (s<0.25f) {
                wilgNat = 14;
                gestObj = 2.15f;
            } else if (s<0.50f) {
                wilgNat = 20;
                gestObj = 2.05f;
            } else {
                wilgNat = 30;
                gestObj = 1.95f;
            }
        }else if(n==NazwaSpoistegoGruntu.GLINA_ZWIEZLA)
        {
            gestWlasc=2.69f;
            if (s<0.25f) {
                wilgNat = 18;
                gestObj = 2.1f;
            } else if (s<0.50f) {
                wilgNat = 24;
                gestObj = 2f;
            } else {
                wilgNat = 35;
                gestObj = 1.9f;
            }
        }else if(n==NazwaSpoistegoGruntu.GLINA_PYLASTA_ZWIEZLA)
        {
            gestWlasc=2.71f;
            if (s<0.25f) {
                wilgNat = 22;
                gestObj = 2f;
            } else if (s<0.50f) {
                wilgNat = 28;
                gestObj = 1.9f;
            } else {
                wilgNat = 42;
                gestObj = 1.8f;
            }
        }else if(n==NazwaSpoistegoGruntu.IL_PIASZCZYSTY)
        {
            gestWlasc=2.7f;
            if (s<0.25f) {
                wilgNat = 18;
                gestObj = 2.1f;
            } else if (s<0.50f) {
                wilgNat = 25;
                gestObj = 1.95f;
            } else {
                wilgNat = 40;
                gestObj = 1.8f;
            }
        }else if(n==NazwaSpoistegoGruntu.IL)
        {
            gestWlasc=2.72f;
            if (s<0.25f) {
                wilgNat = 27;
                gestObj = 2f;
            } else if (s<0.50f) {
                wilgNat = 34;
                gestObj = 1.85f;
            } else {
                wilgNat = 50;
                gestObj = 1.75f;
            }
        }else if(n==NazwaSpoistegoGruntu.IL_PYLASTY)
        {
            gestWlasc=2.75f;
            if (s<0.25f) {
                wilgNat = 33;
                gestObj = 1.9f;
            } else if (s<0.50f) {
                wilgNat = 42;
                gestObj = 1.8f;
            } else {
                wilgNat = 50;
                gestObj = 1.7f;
            }
        }
    }

    private void Rys4(TypSpoistego t, float plast)
    {
        if(t==TypSpoistego.A)
            katTarciaWew=-17.333f*plast+25f;
        else if(t==TypSpoistego.B)
            katTarciaWew=-18.666f*plast+22f;
        else if(t==TypSpoistego.C)
            katTarciaWew=-16f*plast+18f;
        else katTarciaWew=-13.333f*plast+13f;
    }

    private void OdwrRys4(TypSpoistego t, float kat)
    {
        if(t==TypSpoistego.A)
            stPlastGruntu=(25f-kat)/17.333f;
        else if(t==TypSpoistego.B)
            stPlastGruntu=(22f-kat)/18.666f;
        else if(t==TypSpoistego.C)
            stPlastGruntu=(18f-kat)/16f;
        else stPlastGruntu=(13f-kat)/13.333f;
    }

    private void Rys5(TypSpoistego t, float plast)
    {
        if(t==TypSpoistego.A)
            spojnoscGruntu=26.188f*plast*plast-59.938f*plast+50.408f;
        else if(t==TypSpoistego.B)
            spojnoscGruntu=12.631f*plast*plast-42.716f*plast+40.018f;
        else if(t==TypSpoistego.C)
            spojnoscGruntu=-103.75f*plast*plast*plast+165.65f*plast*plast-100.53f*plast+30.766f;
        else spojnoscGruntu=15.547f*plast*plast-58.449f*plast+60.211f;
    }

    private void OdwrRys5(TypSpoistego t, float spoj)
    {
        if(t==TypSpoistego.A)
            stPlastGruntu=0.0004f*spoj*spoj-0.0512f*spoj+1.613f;
        else if(t==TypSpoistego.B)
            stPlastGruntu=0.0003f*spoj*spoj-0.0486f*spoj+1.4016f;
        else if(t==TypSpoistego.C)
            stPlastGruntu=-0.00004f*spoj*spoj*spoj+0.0036f*spoj*spoj-0.1089f*spoj+1.2099f;
        else stPlastGruntu=0.0002f*spoj*spoj-0.0342f*spoj+1.5103f;
    }

    private void Rys7a(TypSpoistego t, float plast)
    {
        if(t==TypSpoistego.A)
            modulEo=(int)(1000f*(109.41f*plast*plast-150.93f*plast+65.379f));
        else if(t==TypSpoistego.B)
            modulEo=(int)(1000f*(-134.22f*plast*plast*plast+230.6f*plast*plast-151.2f*plast+49.649f));
        else if(t==TypSpoistego.C)
            modulEo=(int)(1000f*(41.833f*plast*plast-65.322f*plast+32.821f));
        else modulEo=(int)(1000f*(30.267f*plast*plast-46.47f*plast+22.109f));
    }

    private void Rys7b(TypSpoistego t, float plast)
    {
        if(t==TypSpoistego.A)
            modulMo=(int)(1000f*(-170.91f*plast*plast*plast+323.43f*plast*plast-236.84f*plast+81.463f));
        else if(t==TypSpoistego.B)
            modulMo=(int)(1000f*(-144.15f*plast*plast*plast+262.21f*plast*plast-185.26f*plast+64.535f));
        else if(t==TypSpoistego.C)
            modulMo=(int)(1000f*(68.987f*plast*plast-100.21f*plast+47.066f));
        else modulMo=(int)(1000f*(53.814f*plast*plast-81.7f*plast+39.138f));
    }

    private void Tab3(TypSpoistego t, int modulMo)
    {
        if(t==TypSpoistego.A)
            modulM=(int)(modulMo/0.9f);
        else if(t==TypSpoistego.B)
            modulM=(int)(modulMo/0.75f);
        else if(t==TypSpoistego.C)
            modulM=(int)(modulMo/0.6f);
        else modulM=(int)(modulMo/0.8f);
    }

    public GruntSpoisty(NazwaSpoistegoGruntu n, TypSpoistego t, float plast)
    {
        nazwa=n;
        typ=t;

        if (plast > 0.75f) stPlastGruntu = 0.75f;
        else if (plast < 0f) stPlastGruntu = 0f;
        else stPlastGruntu = plast;

        Tablica2(n,plast);
        Rys4(t,plast);
        Rys5(t,plast);
        Rys7a(t,plast);
        Rys7b(t,plast);
        Tab3(t,modulMo);
    }

    public GruntSpoisty(float kat, NazwaSpoistegoGruntu n, TypSpoistego t)
    {
        nazwa=n;
        typ=t;

        if(t==TypSpoistego.A) {
            if (kat > 25f) katTarciaWew = 24.999f;
            else if (kat < 12f) katTarciaWew = 12f;
            else katTarciaWew = kat;
        }else if(t==TypSpoistego.B) {
            if (kat > 22f) katTarciaWew = 21.999f;
            else if (kat < 8f) katTarciaWew = 8f;
            else katTarciaWew = kat;
        }else if(t==TypSpoistego.C) {
            if (kat > 18f) katTarciaWew = 17.999f;
            else if (kat < 6f) katTarciaWew = 6f;
            else katTarciaWew = kat;
        }else {
            if (kat > 13f) katTarciaWew = 12.999f;
            else if (kat < 3f) katTarciaWew = 3f;
            else katTarciaWew = kat;
        }

        OdwrRys4(t,kat);

        Tablica2(n,stPlastGruntu);
        Rys5(t,stPlastGruntu);
        Rys7a(t,stPlastGruntu);
        Rys7b(t,stPlastGruntu);
        Tab3(t,modulMo);
    }

    public GruntSpoisty(NazwaSpoistegoGruntu n, float spoj, TypSpoistego t)
    {
        nazwa=n;
        typ=t;

        if(t==TypSpoistego.A) {
            if (spoj > 51f) spojnoscGruntu = 51f;
            else if (spoj < 20f) spojnoscGruntu = 20f;
            else spojnoscGruntu = spoj;
        }else if(t==TypSpoistego.B) {
            if (spoj > 40f) spojnoscGruntu = 40f;
            else if (spoj < 15f) spojnoscGruntu = 15f;
            else spojnoscGruntu = spoj;
        }else if(t==TypSpoistego.C) {
            if (spoj > 31f) spojnoscGruntu = 31f;
            else if (spoj < 5f) spojnoscGruntu = 5f;
            else spojnoscGruntu = spoj;
        }else {
            if (spoj > 60f) spojnoscGruntu = 60f;
            else if (spoj < 25f) spojnoscGruntu = 25f;
            else spojnoscGruntu = spoj;
        }

        OdwrRys5(t,spoj);

        Tablica2(n,stPlastGruntu);
        Rys4(t,stPlastGruntu);
        Rys7a(t,stPlastGruntu);
        Rys7b(t,stPlastGruntu);
        Tab3(t,modulMo);
    }

    public float getSpojnoscGruntu() {
        return (round(spojnoscGruntu*100f))/100f;
    }

    public float getStPlastGruntu() {
        return (round(stPlastGruntu*100f))/100f;
    }

    public NazwaSpoistegoGruntu getNazwa() {
        return nazwa;
    }

    public TypSpoistego getTyp() {
        return typ;
    }
}

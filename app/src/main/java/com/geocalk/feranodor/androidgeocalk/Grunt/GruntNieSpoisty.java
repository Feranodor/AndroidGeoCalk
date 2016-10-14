package com.geocalk.feranodor.androidgeocalk.Grunt;

import static java.lang.Math.round;

/**
 * Created by Feranodor on 2016-08-26.
 * piaski źwiry i inne
 */
public class GruntNieSpoisty extends Grunt {
    private float stZagGruntu;
    private NazwaNiespoistegoGruntu nazwa;
    private StanWilg wilg;

    private void Tablica1(NazwaNiespoistegoGruntu n, StanWilg w, float zag) {
        if (n == NazwaNiespoistegoGruntu.ZWIR || n == NazwaNiespoistegoGruntu.POSPOLKA) {
            gestWlasc = 2.65f;

            if (w == StanWilg.MALO_WILGOTNE) {
                if (zag > 0.67) {
                    wilgNat = 3;
                    gestObj = 1.85f;
                } else if (zag > 0.33) {
                    wilgNat = 4;
                    gestObj = 1.75f;
                } else {
                    wilgNat = 5;
                    gestObj = 1.7f;
                }
            } else if (w == StanWilg.WILGOTNE) {
                if (zag > 0.67) {
                    wilgNat = 10;
                    gestObj = 2;
                } else if (zag > 0.33) {
                    wilgNat = 12;
                    gestObj = 1.9f;
                } else {
                    wilgNat = 15;
                    gestObj = 1.8f;
                }
            } else if (w == StanWilg.MOKRE) {
                if (zag > 0.67) {
                    wilgNat = 14;
                    gestObj = 2.1f;
                } else if (zag > 0.33) {
                    wilgNat = 18;
                    gestObj = 2.05f;
                } else {
                    wilgNat = 23;
                    gestObj = 2;
                }
            }
        } else if (n == NazwaNiespoistegoGruntu.PIASEK_GRUBY || n == NazwaNiespoistegoGruntu.PIASEK_SREDNI) {
            gestWlasc = 2.65f;

            if (w == StanWilg.MALO_WILGOTNE) {
                if (zag > 0.67) {
                    wilgNat = 4;
                    gestObj = 1.8f;
                } else if (zag > 0.33) {
                    wilgNat = 5;
                    gestObj = 1.7f;
                } else {
                    wilgNat = 6;
                    gestObj = 1.65f;
                }
            } else if (w == StanWilg.WILGOTNE) {
                if (zag > 0.67) {
                    wilgNat = 12;
                    gestObj = 1.9f;
                } else if (zag > 0.33) {
                    wilgNat = 14;
                    gestObj = 1.85f;
                } else {
                    wilgNat = 16;
                    gestObj = 1.8f;
                }
            } else if (w == StanWilg.MOKRE) {
                if (zag > 0.67) {
                    wilgNat = 18;
                    gestObj = 2.05f;
                } else if (zag > 0.33) {
                    wilgNat = 22;
                    gestObj = 2;
                } else {
                    wilgNat = 25;
                    gestObj = 1.95f;
                }
            }
        } else if (n == NazwaNiespoistegoGruntu.PIASEK_DROBNY || n == NazwaNiespoistegoGruntu.PIASEK_PYLASTY) {
            gestWlasc = 2.65f;

            if (w == StanWilg.MALO_WILGOTNE) {
                if (zag > 0.67) {
                    wilgNat = 5;
                    gestObj = 1.7f;
                } else if (zag > 0.33) {
                    wilgNat = 6;
                    gestObj = 1.65f;
                } else {
                    wilgNat = 7;
                    gestObj = 1.6f;
                }
            } else if (w == StanWilg.WILGOTNE) {
                if (zag > 0.67) {
                    wilgNat = 14;
                    gestObj = 1.85f;
                } else if (zag > 0.33) {
                    wilgNat = 16;
                    gestObj = 1.75f;
                } else {
                    wilgNat = 19;
                    gestObj = 1.7f;
                }
            } else if (w == StanWilg.MOKRE) {
                if (zag > 0.67) {
                    wilgNat = 22;
                    gestObj = 2;
                } else if (zag > 0.33) {
                    wilgNat = 24;
                    gestObj = 1.9f;
                } else {
                    wilgNat = 28;
                    gestObj = 1.85f;
                }
            }
        } else if (n == NazwaNiespoistegoGruntu.PIASEK_PROCHNICZY) {
            gestWlasc = 2.64f;

            if (w == StanWilg.MALO_WILGOTNE) {
                if (zag > 0.67) {
                    wilgNat = 5;
                    gestObj = 1.6f;
                } else if (zag > 0.33) {
                    wilgNat = 6;
                    gestObj = 1.55f;
                } else {
                    wilgNat = 7;
                    gestObj = 1.5f;
                }
            } else if (w == StanWilg.WILGOTNE) {
                if (zag > 0.67) {
                    wilgNat = 16;
                    gestObj = 1.75f;
                } else if (zag > 0.33) {
                    wilgNat = 18;
                    gestObj = 1.7f;
                } else {
                    wilgNat = 21;
                    gestObj = 1.65f;
                }
            } else if (w == StanWilg.MOKRE) {
                if (zag > 0.67) {
                    wilgNat = 24;
                    gestObj = 1.9f;
                } else if (zag > 0.33) {
                    wilgNat = 28;
                    gestObj = 1.85f;
                } else {
                    wilgNat = 30;
                    gestObj = 1.75f;
                }
            }
        }
    }

    private void Rysunek3(float zag, NazwaNiespoistegoGruntu n) {
        if (n == NazwaNiespoistegoGruntu.ZWIR || n == NazwaNiespoistegoGruntu.POSPOLKA)
            katTarciaWew = 7.5f * zag + 34.75f;
        else if (n == NazwaNiespoistegoGruntu.PIASEK_GRUBY || n == NazwaNiespoistegoGruntu.PIASEK_SREDNI)
            katTarciaWew = 6.6666f * zag + 29.6666f;
        else katTarciaWew = 5 * zag + 28;
    }

    private void Rysunek6a(float zag, NazwaNiespoistegoGruntu n) {
        if (n == NazwaNiespoistegoGruntu.ZWIR || n == NazwaNiespoistegoGruntu.POSPOLKA)
            modulEo = (int) (1000 * (59.307f * zag * zag + 117.5f * zag + 63.752f));
        else if (n == NazwaNiespoistegoGruntu.PIASEK_GRUBY || n == NazwaNiespoistegoGruntu.PIASEK_SREDNI)
            modulEo = (int) (1000 * (82.684f * zag * zag + 54.779f * zag + 31.41f));
        else modulEo = (int) (1000 * (67.857f * zag * zag + 14.071f * zag + 21.938f));
    }

    private void Rysunek6b(float zag, NazwaNiespoistegoGruntu n) {
        if (n == NazwaNiespoistegoGruntu.ZWIR || n == NazwaNiespoistegoGruntu.POSPOLKA)
            modulMo = (int) (1000 * (55.357f * zag * zag + 144.46f * zag + 68.768f));
        else if (n == NazwaNiespoistegoGruntu.PIASEK_GRUBY || n == NazwaNiespoistegoGruntu.PIASEK_SREDNI)
            modulMo = (int) (1000 * (107.9f * zag * zag + 53.686f * zag + 41.195f));
        else modulMo = (int) (1000 * (90.801f * zag * zag + 20.872f * zag + 28.29f));
    }

    private void Tablica3(int x, NazwaNiespoistegoGruntu n) {
        if (n == NazwaNiespoistegoGruntu.ZWIR || n == NazwaNiespoistegoGruntu.POSPOLKA)
            modulM = x;
        else if (n == NazwaNiespoistegoGruntu.PIASEK_GRUBY || n == NazwaNiespoistegoGruntu.PIASEK_SREDNI)
            modulM = (int) (x / 0.9);
        else modulM = (int) (x / 0.8);
    }

    private void odwrtRysunek3(float kat, NazwaNiespoistegoGruntu n) {
        if (n == NazwaNiespoistegoGruntu.ZWIR || n == NazwaNiespoistegoGruntu.POSPOLKA)
            stZagGruntu = kat / 7.5f - 4.6333f;
        else if (n == NazwaNiespoistegoGruntu.PIASEK_GRUBY || n == NazwaNiespoistegoGruntu.PIASEK_SREDNI)
            stZagGruntu = kat / 6.6666f - 4.45f;
        else stZagGruntu = kat / 5f - 5.6f;
    }

    public GruntNieSpoisty(NazwaNiespoistegoGruntu n, StanWilg w, float zag) {
        nazwa = n;

        if (zag > 1) stZagGruntu = 1;
        else if (zag < 0.2f) stZagGruntu = 0.2f;
        else stZagGruntu = zag;

        wilg = w;

        Tablica1(n, w, zag);
        Rysunek3(zag, n);
        Rysunek6a(zag, n);
        Rysunek6b(zag, n);
        Tablica3(modulMo, n);
    }

    public GruntNieSpoisty(float kat, NazwaNiespoistegoGruntu n, StanWilg w) {
        if (n == NazwaNiespoistegoGruntu.ZWIR || n == NazwaNiespoistegoGruntu.POSPOLKA) {
            if (kat > 42) katTarciaWew = 42;
            else if (kat < 36.5) katTarciaWew = 36.5f;
            else katTarciaWew = kat;
        } else if (n == NazwaNiespoistegoGruntu.PIASEK_GRUBY || n == NazwaNiespoistegoGruntu.PIASEK_SREDNI) {
            if (kat > 36) katTarciaWew = 36;
            else if (kat < 31) katTarciaWew = 31;
            else katTarciaWew = kat;
        } else {
            if (kat > 33) katTarciaWew = 33;
            else if (kat < 29) katTarciaWew = 29;
            else katTarciaWew = kat;
        }

        odwrtRysunek3(katTarciaWew, n);
        nazwa = n;
        wilg = w;

        Tablica1(n, w, stZagGruntu);
        Rysunek3(stZagGruntu, n);
        Rysunek6a(stZagGruntu, n);
        Rysunek6b(stZagGruntu, n);
        Tablica3(modulMo, n);
    }

    public StanWilg getWilg() {
        return wilg;
    }

    public NazwaNiespoistegoGruntu getNazwa() {
        return nazwa;
    }

    public float getStZagGruntu() {
        return (round(stZagGruntu*100f))/100f;
    }
}

package pl.klolo.workshops.domain;

public enum Currency {
    PLN(1.0f),
    EUR(4.23f),
    USD(3.72f),
    CHF(3.83f);

    public final float rate;

    Currency(final float rate) {
        this.rate = rate;
    }

}

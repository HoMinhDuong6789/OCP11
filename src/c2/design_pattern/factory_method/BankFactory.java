package c2.design_pattern.factory_method;

public class BankFactory {
    private BankFactory() {}

    public static final Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK:
                return new TPBank();
            case VIETINBANK:
                return new Vietinbank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}

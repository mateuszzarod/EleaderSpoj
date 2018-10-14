package Fangen;


public class FangFactory {
    FangType fangType;
    CharMap charMap;

    public FangType getFangType() {
        return fangType;
    }

    public CharMap getCharMap() {
        return charMap;
    }

    public final WingFanPrinterBasic makeWingType(FangType fangType, CharMap map) {
        switch (fangType) {
            case QUADRUPLEBIG:
                return new WingedFanPrinterQuadrupleSymmetryBig(map);
            case QUADRUPLESMALL:
                return new WingedFanPrinterQuadrupleSymmetry(map);
            default:
                throw new IllegalArgumentException(" Illegal fangType" + fangType);
        }
    }
}
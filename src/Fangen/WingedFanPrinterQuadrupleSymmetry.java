package Fangen;


public class WingedFanPrinterQuadrupleSymmetry extends WingFanPrinterBasic {

    public WingedFanPrinterQuadrupleSymmetry(CharMap filler) {
        super(filler);
    }

    @Override
    public void draw(int n, Direction direction) {
        int size = Math.abs(n * 2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                // Prawo
                if (direction == Direction.CLOCKWISE) {
                    if (i < size / 2) {
                        if (j < size / 2) {
                            sb.append(j < i + 1 ? filler.getStar() : filler.getDot());
                        } else {
                            sb.append(j < size - i ? filler.getStar() : filler.getDot());
                        }
                    } else {
                        if (j < size / 2) {
                            sb.append(j >= size - i - 1 ? filler.getStar() : filler.getDot());
                        } else {
                            sb.append(j >= i ? filler.getStar() : filler.getDot());
                        }
                    }
                } else {
                    if (i < size / 2) {
                        if (j < size / 2) {
                            sb.append((j >= i ? filler.getStar() : filler.getDot()));
                        } else {
                            sb.append((j >= size - i - 1 ? filler.getStar() : filler.getDot()));
                        }
                    } else {
                        if (j < size / 2) {
                            sb.append((j < size - i ? filler.getStar() : filler.getDot()));
                        } else {
                            sb.append((j <= i ? filler.getStar() : filler.getDot()));
                        }
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
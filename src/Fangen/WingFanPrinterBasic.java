package Fangen;

public class WingFanPrinterBasic implements FangPrinter{

    protected CharMap filler;

    public CharMap getFiller() {
        return filler;
    }

    public WingFanPrinterBasic (CharMap filler) {

        this.filler = filler;
    }

    @Override
    public void draw(int n, Direction direction) {
        int size = Math.abs(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                // Prawo
                if (direction == Direction.CLOCKWISE) {
                    if (i < size / 2) {
                        if (j < size / 2) {
                            if (j < i + 1)

                                sb.append(filler.getStar());
                            else
                                sb.append(filler.getDot());

                        }
                        else {
                            if (j < size - i)
                                sb.append(filler.getStar());
                            else
                                sb.append(filler.getDot());
                        }
                    } else {
                        if (j < size / 2) {
                            if (j >= size - i - 1)
                                sb.append(filler.getStar());
                            else
                                sb.append(filler.getDot());
                        }
                        else {
                            if (j >= i)
                                sb.append(filler.getStar());
                            else
                                sb.append(filler.getDot());
                        }
                    }
                }
                else {
                    if (i < size / 2) {
                        if (j < size / 2) {
                            if (j >= i)
                                sb.append(filler.getStar());
                            else
                                sb.append(filler.getDot());
                        }
                        else {
                            if (j >= size - i - 1)
                                sb.append(filler.getStar());
                            else
                                sb.append(filler.getDot());
                        }
                    } else {
                        if (j < size / 2) {
                            if (j < size - i)
                                sb.append(filler.getStar());
                            else
                                sb.append(filler.getDot());
                        }
                        else {
                            if (j <= i)
                                sb.append(filler.getStar());
                            else
                                sb.append(filler.getDot());
                        }
                    }
                }

            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
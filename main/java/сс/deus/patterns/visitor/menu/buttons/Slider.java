package сс.deus.patterns.visitor.menu.buttons;

/**
 * Реализация примитивного слайдера
 */
public class Slider implements BaseSlider {
    private double value;

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

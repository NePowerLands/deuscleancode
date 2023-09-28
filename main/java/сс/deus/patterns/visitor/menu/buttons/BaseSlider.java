package сс.deus.patterns.visitor.menu.buttons;

/**
 * Интерфейс описывающий базовый слайдер
 */
public interface BaseSlider extends BaseButton {
    /**
     * @return значение слайдера
     */
    double getValue();

    /**
     * @param value значение слайдера
     */
    void setValue(double value);
}

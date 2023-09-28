package сс.deus.patterns.visitor.menu.buttons;

/**
 * Интерфейс описывающий чекбокс
 */
public interface BaseCheckBox extends BaseButton {
    /**
     * @param state значение чекбокса
     */
    void setState(boolean state);

    /**
     * @return значение чекбокса
     */
    boolean getState();
}

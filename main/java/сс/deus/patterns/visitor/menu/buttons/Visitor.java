package сс.deus.patterns.visitor.menu.buttons;

/**
 * Шаблон Visitor для иерархии {@link BaseButton}
 */
public interface Visitor {
    /**
     * @param checkBox обрабатываемый чекбокс
     */
    void visit(BaseCheckBox checkBox);

    /**
     * @param slider обрабатываемый слайдер
     */
    void visit(BaseSlider slider);
}

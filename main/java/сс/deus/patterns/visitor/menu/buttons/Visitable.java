package сс.deus.patterns.visitor.menu.buttons;

/**
 * Шаблон Visitor для иерархии {@link BaseButton}
 */
public interface Visitable {
    /**
     * реализующий метод должен определить какой конкретно метод {@link Visitor visitor`а} должен его обработать
     *
     * @param visitor обработчик
     */
    void accept(Visitor visitor);
}

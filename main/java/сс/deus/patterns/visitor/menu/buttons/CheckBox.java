package сс.deus.patterns.visitor.menu.buttons;

/**
 * Реализация примитивного чекбокса
 */
public class CheckBox implements BaseCheckBox {
    private boolean state;

    @Override
    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public boolean getState() {
        return state;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

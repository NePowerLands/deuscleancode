package сс.deus.patterns.visitor.config;

import сс.deus.patterns.visitor.config.io.Reader;
import сс.deus.patterns.visitor.config.io.Writer;
import сс.deus.patterns.visitor.menu.buttons.BaseCheckBox;
import сс.deus.patterns.visitor.menu.buttons.BaseButton;
import сс.deus.patterns.visitor.menu.buttons.BaseSlider;
import сс.deus.patterns.visitor.menu.buttons.Visitor;

/**
 * Реализация {@link Visitor visitor`а} которая позволяет загружать значения для иерархии {@link BaseButton}
 *
 * @see Writer
 */
public class ImportVisitor implements Visitor {
    private final Reader reader;

    public ImportVisitor(Reader reader) {
        this.reader = reader;
    }

    @Override
    public void visit(BaseCheckBox checkBox) {
        checkBox.setState(reader.readBoolean());
    }

    @Override
    public void visit(BaseSlider slider) {
        slider.setValue(reader.readDouble());
    }
}

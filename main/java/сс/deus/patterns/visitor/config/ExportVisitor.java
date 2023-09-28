package сс.deus.patterns.visitor.config;

import сс.deus.patterns.visitor.config.io.Reader;
import сс.deus.patterns.visitor.config.io.Writer;
import сс.deus.patterns.visitor.menu.buttons.BaseCheckBox;
import сс.deus.patterns.visitor.menu.buttons.BaseButton;
import сс.deus.patterns.visitor.menu.buttons.BaseSlider;
import сс.deus.patterns.visitor.menu.buttons.Visitor;

/**
 * Реализация {@link Visitor visitor`а} которая позволяет сохранять значения иерархии {@link BaseButton}
 *
 * @see Reader
 */
public class ExportVisitor implements Visitor {
    private final Writer writer;

    public ExportVisitor(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void visit(BaseCheckBox checkBox) {
        writer.writeBoolean(checkBox.getState());
    }

    @Override
    public void visit(BaseSlider slider) {
        writer.writeDouble(slider.getValue());
    }
}

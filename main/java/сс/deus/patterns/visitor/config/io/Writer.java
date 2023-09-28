package сс.deus.patterns.visitor.config.io;

/**
 * Интерфейс описывающий запись примитивных типов данных
 *
 * @see Reader
 */
public interface Writer {
    /**
     * @param value значение для записи
     */
    void writeDouble(final double value);

    /**
     * @param value значение для записи
     */
    void writeBoolean(final boolean value);
}

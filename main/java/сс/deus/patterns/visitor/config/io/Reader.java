package сс.deus.patterns.visitor.config.io;

/**
 * Интерфейс описывающий чтение примитивных типов данных
 *
 * @see Writer
 */
public interface Reader {
    /**
     * @return boolean значение записанное через {@link Writer}
     */
    boolean readBoolean();

    /**
     * @return double значение записанное через {@link Writer}
     */
    double readDouble();
}

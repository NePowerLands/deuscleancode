package сс.deus.patterns.visitor.config.io;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Реализация интерфейса {@link Writer} с помощью {@link DataOutputStream}
 */
public class DataOutputWriter implements Writer {
    private final DataOutputStream writer;

    public DataOutputWriter(DataOutputStream writer) {
        this.writer = writer;
    }

    @Override
    public void writeDouble(double value) {
        try {
            writer.writeDouble(value);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void writeBoolean(boolean value) {
        try {
            writer.writeBoolean(value);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}

package сс.deus.patterns.visitor.config.io;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Реализация интерфейса {@link Reader} с помощью {@link DataInputStream}
 */
public class DataInputReader implements Reader {
    private final DataInputStream reader;

    public DataInputReader(DataInputStream reader) {
        this.reader = reader;
    }

    @Override
    public boolean readBoolean() {
        try {
            return reader.readBoolean();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public double readDouble() {
        try {
            return reader.readDouble();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}

package okhttp3;

import okio.BufferedSink;
import okio.BufferedSource;

import java.io.IOException;

public abstract class WritableBody extends Body {
  @Override public final BufferedSource source() {
    throw new UnsupportedOperationException();
  }

  @Override
  public abstract void writeTo(BufferedSink sink) throws IOException;

  @Override public final void close() {
    // Nothing to do!
  }
}

package okhttp3;

import java.io.IOException;
import okio.BufferedSink;
import okio.BufferedSource;

public abstract class ReadableBody extends Body {
  @Override public abstract BufferedSource source();

  @Override public final void writeTo(BufferedSink sink) throws IOException {
    throw new UnsupportedOperationException();
  }
}

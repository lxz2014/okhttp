package okhttp3;

import java.io.IOException;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;

public class StaticBody extends Body {
  private final MediaType contentType;
  private final long contentLength;
  private final byte[] content;
  private Buffer source;

  StaticBody(MediaType contentType, long contentLength, byte[] content) {
    this.contentType = contentType;
    this.contentLength = contentLength;
    this.content = content;
  }

  @Override
  public MediaType contentType() {
    return contentType;
  }

  @Override
  public long contentLength() {
    return contentLength;
  }

  @Override
  public BufferedSource source() {
    if (source == null) source = new Buffer().write(content);
    return source;
  }

  @Override
  public void writeTo(BufferedSink sink) throws IOException {
    sink.write(content);
  }
}

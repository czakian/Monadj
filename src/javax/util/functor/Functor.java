package javax.util.functor;

import java.util.function.Function;

public interface Functor<T> {
  public <U> U fmap(Function<? super T, U> f);
}

